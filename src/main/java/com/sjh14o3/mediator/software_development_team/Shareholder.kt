package com.sjh14o3.mediator.software_development_team

abstract class Shareholder(protected val _name: String, protected val _mediator: Mediator) {

    val mediator: Mediator
        get() = _mediator

    val name: String
        get() = _name

    abstract fun receiveMessage(message: String)
    abstract override fun equals(other: Any?): Boolean

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun toString(): String {
        return name
    }
}