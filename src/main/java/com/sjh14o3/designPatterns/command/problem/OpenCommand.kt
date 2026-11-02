package com.sjh14o3.designPatterns.command.problem

class OpenCommand(private val device: Openable): Command {
    override fun execute() {
        device.open()
    }
    override fun undo() {
        device.close()
    }
}