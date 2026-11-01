package com.sjh14o3.designPatterns.interpreter.problem

import kotlin.math.pow

class PowerExpression(private val left: Expression, private val right: Expression): MathExpression(left, right) {
    override fun interpret(): Double {
        return left.interpret().pow(right.interpret())
    }
}