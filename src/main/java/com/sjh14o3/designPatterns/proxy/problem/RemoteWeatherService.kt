package com.sjh14o3.designPatterns.proxy.problem

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