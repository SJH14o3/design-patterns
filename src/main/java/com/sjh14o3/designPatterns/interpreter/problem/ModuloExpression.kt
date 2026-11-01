package com.sjh14o3.designPatterns.interpreter.problem

class ModuloExpression(private val left: Expression, private val right: Expression): MathExpression(left, right) {
    override fun interpret(): Double {
        val rightValue = right.interpret()
        if (rightValue == 0.0) {
            throw ArithmeticException("Divide by zero")
        }
        return left.interpret() % rightValue
    }
}