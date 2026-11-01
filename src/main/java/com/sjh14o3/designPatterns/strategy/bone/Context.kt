package com.sjh14o3.designPatterns.strategy.bone

class Context(var strategy: Strategy) {
    fun runAlgorithm() {
        strategy.algorithmInterface()
    }
}