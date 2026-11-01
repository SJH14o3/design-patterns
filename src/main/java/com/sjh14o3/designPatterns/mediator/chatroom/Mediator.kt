package com.sjh14o3.designPatterns.mediator.chatroom

interface Mediator {
    fun sendMessage(message: String, colleague: Colleague)
}