package com.sjh14o3.strategy.sort

interface Sorter<T : Comparable<T>> {
    fun sort(items: MutableList<T>)
}