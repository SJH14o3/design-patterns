package com.sjh14o3.designPatterns.interpreter.problem

class NumberExpression(private val value: Double): Expression {
    override fun interpret(): Double {
        return this.value
    }
}