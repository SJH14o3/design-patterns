package com.sjh14o3.mediator.chatroom

abstract class Colleague(mediator: Mediator) {
    protected val _mediator = mediator
    val mediator: Mediator
        get() = _mediator


    fun sendMessage(message: String) {
        mediator.sendMessage(message, this)
    }
    abstract fun receive(message: String)
}