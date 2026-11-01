package com.sjh14o3.designPatterns.strategy.bone

class ConcreteStrategyB: Strategy() {
    override fun algorithmInterface() {
        println("strategy B used")
    }
}