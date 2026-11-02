package com.sjh14o3.designPatterns.iterator

data class Song(val title: String, val artist: String, val durationInSeconds: Int) {
    override fun toString(): String {
        return "$title - $artist"
    }
}
