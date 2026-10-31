# Kotlin Learning Challenge: Proxy Pattern with Caching

## Problem: Build a Caching Proxy for a Remote Weather Service

### Scenario

You are developing a weather application that retrieves weather information from a remote API.

Calling the remote API is expensive because:

- Each request takes approximately 2 seconds.
- The API has a limited number of requests per minute.
- Multiple users may request weather information for the same city.

Your task is to implement the Proxy Design Pattern to introduce caching without changing the existing weather service implementation.

The proxy should intercept requests, check whether the requested city's weather is cached, and only call the real service when necessary.

## 1. Requirements

Implement the following components:

1. `WeatherService` — An interface defining the weather service contract.
2. `RemoteWeatherService` — The real implementation that simulates an expensive API call.
3. `WeatherServiceProxy` — A proxy that controls access to the real service and manages the cache.
4. `Weather` — A data class representing weather information.

### Expected behavior

Your proxy must satisfy these requirements:

- When a city is requested for the first time, call the remote service.
- Cache the result.
- When the same city is requested again, return the cached result.
- Do not call the remote service if a valid cached result exists.
- Cache entries should expire after 10 seconds (TTL).
- If an entry expires, fetch fresh data from the remote service.
- Cache should be case-insensitive (`Helsinki` and `helsinki` should be treated as the same city).

## 2. Starter Code

The following code provides the initial structure. Your job is to complete the implementation.

```
import java.time.Instant

data class Weather(
    val city: String,
    val temperature: Double,
    val description: String
)

interface WeatherService {
    fun getWeather(city: String): Weather
}

class RemoteWeatherService : WeatherService {

    override fun getWeather(city: String): Weather {
        println("Fetching weather from remote API...")

        // Simulate expensive network operation
        Thread.sleep(2000)

        return Weather(
            city = city,
            temperature = 15.0,
            description = "Cloudy"
        )
    }
}

class WeatherServiceProxy(
    private val realService: WeatherService
) : WeatherService {

    // TODO 1: Create a cache data structure.

    // TODO 2: Implement getWeather().

    // TODO 3: Check whether cached data has expired.

    // TODO 4: Fetch and cache data when necessary.
}
```

## 3. Your Tasks

Work through these challenges in order.

Task 1 — Basic caching

Implement a cache using a Kotlin `MutableMap`.

The first request should call the real service. Subsequent requests should return the cached result.

Task 2 — Add expiration

Store a timestamp alongside each cached weather result.

Use a TTL of 10 seconds.

Task 3 — Case-insensitive keys

Normalize city names before using them as cache keys.

Task 4 — Cache statistics

Add two counters:

- `cacheHits`
- `cacheMisses`

Expose them through appropriate properties or functions.

Task 5 — Thread safety (Bonus)

Make your proxy safe when multiple threads request weather for the same city simultaneously.

Try to prevent multiple remote requests for the same cache miss.

## 4. Expected Output

For example, consider this sequence of requests:

```
fun main() {
    val remoteService = RemoteWeatherService()
    val weatherService = WeatherServiceProxy(remoteService)

    println(weatherService.getWeather("Helsinki"))
    println(weatherService.getWeather("Helsinki"))
    println(weatherService.getWeather("helsinki"))

    Thread.sleep(11_000)

    println(weatherService.getWeather("Helsinki"))
}
```

Expected behavior:

```
Fetching weather from remote API...
Weather(city=Helsinki, temperature=15.0, description=Cloudy)

Weather(city=Helsinki, temperature=15.0, description=Cloudy)

Weather(city=Helsinki, temperature=15.0, description=Cloudy)

Fetching weather from remote API...
Weather(city=Helsinki, temperature=15.0, description=Cloudy)
```

The remote API should be called exactly twice: once initially and once after cache expiration.

## 5. Design Pattern Analysis

Think about these questions while implementing the solution.

1. Why do we need the `WeatherService` interface?
2. Why is `WeatherServiceProxy` implementing the same interface as `RemoteWeatherService`?
3. Could we implement caching directly inside `RemoteWeatherService`? What would be the disadvantages?
4. Does the client know whether it is communicating with the real service or the proxy?
5. What would happen if we wanted to add logging or request-rate limiting? Would the Proxy Pattern help?