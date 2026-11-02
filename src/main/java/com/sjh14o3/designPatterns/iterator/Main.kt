package com.sjh14o3.designPatterns.iterator

fun main() {
    val song1 = Song("Believer", "Imagine Dragons", 300)
    val song2 = Song("Numb", "Linkin Park", 250)
    val song3 = Song("Yellow", "Coldplay", 150)
    val song4 = Song("The Scientist", "Coldplay", 180)

    val playlist = Playlist(mutableListOf(song1, song2, song3, song4))

    println("Playing playlist:\n")
    val iterator = playlist.songIterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
    println("\nEnd of playlist.")

    try {
        iterator.next()
    } catch (e: NoSuchElementException) {
        println(e.message)
    }

    println("\nPlaying playlist:\n")
    val reverseIterator = playlist.reversedIterator()
    while (reverseIterator.hasNext()) {
        println(reverseIterator.next())
    }
    println("\nEnd of playlist.")


    println("\nPlaying playlist:\n")
    val shuffledIterator = playlist.shuffledIterator()
    while (shuffledIterator.hasNext()) {
        println(shuffledIterator.next())
    }
    println("\nEnd of playlist.")

    println("\ntwo iterators iterating together:\n")
    val iterator1 = playlist.songIterator()
    val iterator2 = playlist.iterator()
    while (iterator1.hasNext()) {
        println("iterator 1: ${iterator1.next()}")
        println("iterator 2: ${iterator2.next()}")
    }
}