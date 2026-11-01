package com.sjh14o3.designPatterns.builder.car

class Body(private val shape: String) {
    override fun toString(): String {
        return "shape: $shape"
    }
}