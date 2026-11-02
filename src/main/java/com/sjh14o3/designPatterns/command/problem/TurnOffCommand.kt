package com.sjh14o3.designPatterns.command.problem

class TurnOffCommand(private val device: Switchable): Command {
    override fun execute() {
        device.turnOff()
    }

    override fun undo() {
        device.turnOn()
    }
}