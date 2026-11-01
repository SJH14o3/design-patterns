package com.sjh14o3.designPatterns.mediator.chatroom

class MobileColleague(mediator: Mediator) : Colleague(mediator) {
    override fun receive(message: String) {
        println("mobile colleague received message: \"$message\"")
    }
}