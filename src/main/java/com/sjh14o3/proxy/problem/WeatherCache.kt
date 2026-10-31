package com.sjh14o3.proxy.problem

import java.time.Instant

data class WeatherCache(val weather: Weather, val cachedAt: Instant = Instant.now())
