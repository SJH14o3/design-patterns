package com.sjh14o3.designPatterns.builder.bone

interface Builder {

    fun addAttr1()

    fun addAttr2()

    fun getResult(): BuiltObject
}