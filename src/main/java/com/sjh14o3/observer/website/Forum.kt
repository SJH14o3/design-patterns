package com.sjh14o3.observer.website

class Forum(val posts: ArrayList<Post>, val followers: ArrayList<User>, val name: String) {
    fun attach(observer: User) {
        followers.add(observer)
    }

    fun detach(observer: User) {
        followers.remove(observer)
    }

    fun notify(poster: User) {
        for (observer in followers) {
            // won't notify the poster him/herself
            if (observer != poster) {
                observer.update("new post at $name forum")
            }
        }
    }

    fun addPost(post: Post) {
        if (post.user in followers) {
            posts.add(post)
            notify(post.user)
        }
    }

    constructor(name: String) : this(ArrayList(), ArrayList(), name)
}