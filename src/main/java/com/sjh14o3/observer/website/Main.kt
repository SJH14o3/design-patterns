package com.sjh14o3.observer.website

fun main() {
    val forum1 = Forum("Gaming")
    val forum2 = Forum("programming")
    val website = Website(arrayListOf(forum1, forum2))
    val john = User("John")
    val bob = User("Bob")
    val alice = User("Alice")
    john.joinForum(forum1)
    john.joinForum(forum2)
    bob.joinForum(forum1)
    alice.joinForum(forum2)

    john.post("hi!", forum1) // bob receives notification
    bob.post("hello", forum1) // john receives notification
    alice.post("cool", forum2) // john receives notification

    john.leaveForum(forum1)
    alice.joinForum(forum1)
    bob.post("is anyone out there?", forum1) // alice will be notified


}