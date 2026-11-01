package com.sjh14o3.designPatterns.proxy.problem

interface WeatherService {
    fun getWeather(city: String): Weather
}