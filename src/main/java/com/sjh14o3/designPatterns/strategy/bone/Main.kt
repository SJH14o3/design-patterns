package com.sjh14o3.designPatterns.strategy.bone

fun main() {
    val strategy = ConcreteStrategyA()
    val context = Context(strategy)
    context.runAlgorithm()
    context.strategy = ConcreteStrategyB()
    context.runAlgorithm()
}