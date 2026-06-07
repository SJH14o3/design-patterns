package com.sjh14o3.strategy.sort

class QuickSort<T : Comparable<T>> : Sorter<T> {

    override fun sort(items: MutableList<T>) {
        println("sorting with Quick Sort")
        quickSort(items, 0, items.lastIndex)
    }

    private fun quickSort(items: MutableList<T>, low: Int, high: Int) {
        if (low < high) {
            val pivotIndex = partition(items, low, high)

            quickSort(items, low, pivotIndex - 1)
            quickSort(items, pivotIndex + 1, high)
        }
    }

    private fun partition(
        items: MutableList<T>,
        low: Int,
        high: Int
    ): Int {
        val pivot = items[high]
        var i = low - 1

        for (j in low until high) {
            if (items[j] <= pivot) {
                i++
                swap(items, i, j)
            }
        }

        swap(items, i + 1, high)
        return i + 1
    }

    private fun swap(items: MutableList<T>, i: Int, j: Int) {
        val temp = items[i]
        items[i] = items[j]
        items[j] = temp
    }
}