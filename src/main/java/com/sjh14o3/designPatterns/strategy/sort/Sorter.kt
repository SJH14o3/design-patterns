package com.sjh14o3.designPatterns.strategy.sort

interface Sorter<T : Comparable<T>> {
    fun sort(items: MutableList<T>)
}