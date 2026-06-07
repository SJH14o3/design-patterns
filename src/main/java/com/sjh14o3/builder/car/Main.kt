package com.sjh14o3.builder.car

fun buildCar(builder: Builder?, director: Director) {
    director.builder = builder
    val result = director.getCar()
    if (result.isPresent) println(result.get()) else println("builder is not set")
}

fun main() {
    val jeepBuilder = JeepBuilder()
    val nissanBuilder = NissanBuilder()
    val director = Director()

    buildCar(null, director)

    buildCar(jeepBuilder, director)

    buildCar(nissanBuilder, director)
}