package com.sjh14o3.designPatterns.interpreter.problem

abstract class MathExpression(private val left: Expression, private val right: Expression) : Expression