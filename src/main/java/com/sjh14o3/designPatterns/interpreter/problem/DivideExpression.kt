package com.sjh14o3.designPatterns.interpreter.problem

class DivideExpression(private val left: Expression, private val right: Expression): MathExpression(left, right) {
    override fun interpret(): Double {
        val right = right.interpret()
        if (right == 0.0) {
            throw ArithmeticException("Divide by zero")
        }
        return left.interpret() / right
    }
}