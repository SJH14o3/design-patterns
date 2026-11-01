package com.sjh14o3.designPatterns.proxy.problem

import java.time.Duration
import java.time.Instant
import java.util.*
import java.util.concurrent.atomic.AtomicInteger
import kotlin.collections.HashMap

class WeatherServiceProxy(private val realService: WeatherService) : WeatherService {
    companion object {
        val TTL: Duration = Duration.ofSeconds(10)
    }
    private val cache = HashMap<String, WeatherCache>()
    private val locks = HashMap<String, Any>() // lock for each city. This is not efficient for a large quantities of cities.
    private val cacheHits = AtomicInteger(0)
    private val cacheMisses = AtomicInteger(0)

    fun getCachedHits(): Int { return cacheHits.get() }
    fun getCacheMisses(): Int { return cacheMisses.get() }

    override fun getWeather(city: String): Weather {
        var cacheKey = city.trim().lowercase(Locale.ROOT)

        val lock = getLock(cacheKey)

        synchronized(lock) {
            val cacheData = synchronizedRead(cacheKey)
            if (cacheData != null) {
                if (isExpired(cacheData)) {
                    cacheMisses.incrementAndGet()
                    val newData = realService.getWeather(cacheKey)
                    synchronizedWrite(cacheKey, newData)
                } else {
                    cacheHits.incrementAndGet()
                }
            } else {
                cacheMisses.incrementAndGet()
                val newData = realService.getWeather(cacheKey)
                synchronizedWrite(cacheKey, newData)
            }
        }
        return synchronizedRead(cacheKey)!!.weather
    }

    private fun synchronizedRead(cacheKey: String): WeatherCache? {
        var data: WeatherCache?
        synchronized(cache) {
            data = cache[cacheKey]
        }
        return data
    }

    private fun synchronizedWrite(cacheKey: String, data: Weather) {
        synchronized(cache) {
            cache[cacheKey] = WeatherCache(data)
        }
    }

    private fun getLock(cacheKey: String): Any {
        synchronized(locks) {
            return locks.getOrPut(cacheKey) { Any() }
        }
    }

    private fun isExpired(entry: WeatherCache): Boolean {
        val expirationTime = entry.cachedAt.plus(TTL)

        return !Instant.now().isBefore(expirationTime)
    }
}