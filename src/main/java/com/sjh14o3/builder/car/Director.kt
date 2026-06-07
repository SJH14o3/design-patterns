package com.sjh14o3.builder.car

import java.util.Optional

class Director {
    var builder: Builder? = null

    fun getCar(): Optional<Car> {
        if (builder == null) {
            return Optional.empty()
        }


        val car = Car()
        car.body = builder!!.getBody()
        car.engine = builder!!.getEngine()
        car.wheels = builder!!.getWheels()
        return Optional.of(car)
    }
}