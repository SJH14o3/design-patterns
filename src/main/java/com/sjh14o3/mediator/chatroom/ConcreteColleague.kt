package com.sjh14o3.mediator.chatroom

class ConcreteColleague(mediator: Mediator) : Colleague(mediator) {
    override fun receive(message: String) {
        println("concrete colleague received message: \"$message\"")
    }
}