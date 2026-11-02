package com.sjh14o3.designPatterns.iterator

class SongIterator(private val list: List<Song>): Iterator<Song> {
    private var currentIndex = 0

    override fun hasNext(): Boolean {
        return currentIndex < list.size
    }

    override fun next(): Song {
        if (!hasNext()) {
            throw NoSuchElementException("No element remain to iterate")
        }
        return list[currentIndex++]
    }
}