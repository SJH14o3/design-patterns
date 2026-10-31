package com.sjh14o3.proxy.problem

interface WeatherService {
    fun getWeather(city: String): Weather
}