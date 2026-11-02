package com.sjh14o3.designPatterns.command.problem

class TurnOnCommand(private val device: Switchable): Command {
    override fun execute() {
        device.turnOn()
    }

    override fun undo() {
        device.turnOff()
    }
}