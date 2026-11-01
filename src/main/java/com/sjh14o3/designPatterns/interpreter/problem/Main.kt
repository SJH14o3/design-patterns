package com.sjh14o3.designPatterns.interpreter.problem

fun main() {
    val exp1 = AddExpression(
        NumberExpression(10.0),
        NumberExpression(5.0)
    )
    println(exp1.interpret())

    val exp2 = SubtractExpression(
        NumberExpression(10.0),
        NumberExpression(5.0)
    )
    println(exp2.interpret())

    val exp3 = MultiplyExpression(
        NumberExpression(10.0),
        NumberExpression(5.0)
    )
    println(exp3.interpret())

    val exp4 = DivideExpression(
        NumberExpression(10.0),
        NumberExpression(5.0)
    )
    println(exp4.interpret())

    val exp5 = MultiplyExpression(
        AddExpression(
            NumberExpression(10.0),
            NumberExpression(5.0)
        ),
        NumberExpression(2.0)
    )
    println(exp5.interpret())

    val exp6 = AddExpression(
        NumberExpression(10.0),
        MultiplyExpression(
            NumberExpression(5.0),
            NumberExpression(2.0)
        )
    )
    println(exp6.interpret())

    val exp7 = MultiplyExpression(
        AddExpression(
            NumberExpression(10.0),
            NumberExpression(5.0)
        ),
        SubtractExpression(
            NumberExpression(20.0),
            NumberExpression(10.0)
        )
    )
    println(exp7.interpret())
}