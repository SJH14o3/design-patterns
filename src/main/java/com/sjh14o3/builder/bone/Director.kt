package com.sjh14o3.builder.bone

class Director(var builder: Builder) {
    fun Construct(): BuiltObject {
        builder.addAttr1()
        builder.addAttr2()
        return builder.getResult()
    }
}