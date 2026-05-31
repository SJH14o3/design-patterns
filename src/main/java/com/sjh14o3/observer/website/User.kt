package com.sjh14o3.observer.website

class User(val name: String) {
    fun update(context: String) {
        println("$name received: \"$context\"")
    }

    fun joinForum(forum: Forum) {
        forum.attach(this)
    }

    fun leaveForum(forum: Forum) {
        forum.detach(this)
    }

    fun post(context: String, forum: Forum) {
        forum.addPost(Post(context, this))
    }
}