package com.sjh14o3.builder.bone

fun main() {
    val cb1 = ConcreteBuilder1()
    val cb2 = ConcreteBuilder2()

    val director = Director(cb1)
    val obj1 = director.Construct()

    director.builder = cb2
    val obj2 = director.Construct()

    println(obj1)
    println(obj2)
}