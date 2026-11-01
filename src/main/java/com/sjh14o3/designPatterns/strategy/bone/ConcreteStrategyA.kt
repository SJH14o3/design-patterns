package com.sjh14o3.designPatterns.strategy.bone

class ConcreteStrategyA: Strategy() {
    override fun algorithmInterface() {
        println("strategy A used")
    }
}