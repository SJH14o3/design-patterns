package com.sjh14o3.strategy.sort

fun main() {
    var sorter = BubbleSort<Int>()
    val ah = ArrayHolder(sorter)
    ah.sort()

    ah.sorter = QuickSort<Int>()
    ah.reset()
    ah.sort()


    ah.sorter = MergeSort<Int>()
    ah.reset()
    ah.sort()
}