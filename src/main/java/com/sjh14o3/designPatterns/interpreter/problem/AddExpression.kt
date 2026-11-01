package com.sjh14o3.designPatterns.interpreter.problem

class AddExpression(private val left: Expression, private val right: Expression): MathExpression(left, right) {
    override fun interpret(): Double {
        return left.interpret() + right.interpret()
    }
}