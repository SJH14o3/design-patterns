package com.sjh14o3.builder.bone

class ConcreteBuilder1: Builder {
    private val builtObject = BuiltObject()

    override fun addAttr1() {
        builtObject.attr1 = 1
    }

    override fun addAttr2() {
        builtObject.attr2 = "builder 1"
    }

    override fun getResult(): BuiltObject {
        return builtObject
    }
}