package com.sjh14o3.strategy.sort

class MergeSort<T : Comparable<T>> : Sorter<T> {

    override fun sort(items: MutableList<T>) {
        println("Sorting with Merge Sort")
        if (items.size <= 1) return

        val sorted = mergeSort(items)
        items.clear()
        items.addAll(sorted)
    }

    private fun mergeSort(list: List<T>): List<T> {
        if (list.size <= 1) return list

        val mid = list.size / 2

        val left = mergeSort(list.subList(0, mid))
        val right = mergeSort(list.subList(mid, list.size))

        return merge(left, right)
    }

    private fun merge(left: List<T>, right: List<T>): List<T> {
        val result = mutableListOf<T>()

        var i = 0
        var j = 0

        while (i < left.size && j < right.size) {
            if (left[i] <= right[j]) {
                result.add(left[i++])
            } else {
                result.add(right[j++])
            }
        }

        while (i < left.size) {
            result.add(left[i++])
        }

        while (j < right.size) {
            result.add(right[j++])
        }

        return result
    }
}