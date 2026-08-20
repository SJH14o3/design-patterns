package com.sjh14o3.prototype.problem

import kotlin.collections.ArrayList

abstract class DocumentPrototype(
    // it was requested to use a nested mutable object
    var metaData: MutableList<String>
) : Cloneable {
    protected fun metaDataDeepCopy(): MutableList<String> {
        val newList = ArrayList<String>(metaData.size)
        for (m in metaData) {
            newList.add(m)
        }
        return newList
        // note that return metaData.toMutableList() also works
    }

    public abstract override fun clone(): DocumentPrototype
}