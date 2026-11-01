package com.sjh14o3.designPatterns.builder.car

interface Builder {
    fun getWheels(): Array<Wheel>
    fun getEngine(): Engine
    fun getBody(): Body
}