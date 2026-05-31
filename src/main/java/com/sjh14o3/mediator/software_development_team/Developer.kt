package com.sjh14o3.mediator.software_development_team

class Developer(_name: String, _mediator: Mediator) : Shareholder(_name, _mediator) {
    fun commit(message: String) {
        mediator.notifyForCommit(message, this)
    }

    override fun receiveMessage(message: String) {
        println("(D) $this received \"$message\"")
    }

    override fun equals(other: Any?): Boolean {
        if (other is Developer) {
            return this.mediator == other.mediator && this.name === other.name
        }
        return false
    }

    override fun toString(): String {
        return "Developer \"${super.toString()}\""
    }
}