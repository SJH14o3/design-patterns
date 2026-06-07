package com.sjh14o3.strategy.sort

class ArrayHolder (var sorter: Sorter<Int>) {
    var arr = mutableListOf(1,12,34,0,-123,293, -129)
    fun sort() {
        sorter.sort(arr)
        printArray()
    }

    fun reset() {
        arr = mutableListOf(1,12,34,0,-123,293, -129)
    }

    fun printArray() {
        val sb = StringBuilder()
        sb.append("[ ")
        for (item in arr) {
            sb.append(item).append(", ")
        }
        sb.replace(sb.length - 2, sb.length, " ]")
        println(sb)
    }
}