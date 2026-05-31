package com.sjh14o3.mediator.software_development_team

class QualityEngineer(_name: String, _mediator: Mediator) : Shareholder(_name, _mediator) {
    override fun receiveMessage(message: String) {
        println("(QE) $this received \"$message\"")
    }

    override fun equals(other: Any?): Boolean {
        if (other is QualityEngineer) {
            return this.mediator == other.mediator && this.name === other.name
        }
        return false
    }

    override fun toString(): String {
        return "Quality Engineer \"${super.toString()}\""
    }
}