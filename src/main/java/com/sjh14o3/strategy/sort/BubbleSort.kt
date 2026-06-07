package com.sjh14o3.strategy.sort

class BubbleSort<T : Comparable<T>> : Sorter<T> {

    override fun sort(items: MutableList<T>) {
        println("sorting with Bubble Sort")
        val n = items.size

        for (i in 0 until n - 1) {
            var swapped = false

            for (j in 0 until n - i - 1) {
                if (items[j] > items[j + 1]) {
                    val temp = items[j]
                    items[j] = items[j + 1]
                    items[j + 1] = temp
                    swapped = true
                }
            }

            if (!swapped) break
        }
    }
}