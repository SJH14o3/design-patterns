package com.sjh14o3.designPatterns.builder.car

class Engine(private val horsePower: Int) {
    override fun toString(): String {
        return "horse power: $horsePower"
    }
}