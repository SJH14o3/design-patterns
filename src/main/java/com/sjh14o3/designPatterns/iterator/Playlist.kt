package com.sjh14o3.designPatterns.iterator

class Playlist(private val list: MutableList<Song>): Iterable<Song> {

    fun addSong(song: Song) {
        list.add(song)
    }

    fun addSong(song: Song, index: Int) {
        list.add(index, song)
    }

    /**
     * @return my implementation of iterator
     */
    fun songIterator(): SongIterator {
        return SongIterator(list)
    }


    /**
     * @return my implementation of iterator but with elements in reverse
     */
    fun reversedIterator(): SongIterator {
        return SongIterator(list.reversed())
    }

    /**
     * @return my implementation of iterator but with shuffled elements
     */
    fun shuffledIterator(): SongIterator {
        return SongIterator(list.shuffled())
    }

    /**
     * @return the Kotlin's iterator
     */
    override fun iterator(): Iterator<Song> {
        return list.iterator()
    }
}