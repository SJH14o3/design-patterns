package com.sjh14o3.proxy.problem

fun main() {
    val remoteService = RemoteWeatherService()
    val weatherService = WeatherServiceProxy(remoteService)

    println(weatherService.getWeather("Helsinki"))
    println(weatherService.getWeather("Helsinki"))
    println(weatherService.getWeather("helsinki"))

    Thread.sleep(11_000)

    println(weatherService.getWeather("Helsinki"))
}