package com.sjh14o3.strategy.bone

class Context(var strategy: Strategy) {
    fun runAlgorithm() {
        strategy.algorithmInterface()
    }
}