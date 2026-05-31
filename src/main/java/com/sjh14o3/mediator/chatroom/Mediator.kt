package com.sjh14o3.mediator.chatroom

interface Mediator {
    fun sendMessage(message: String, colleague: Colleague)
}