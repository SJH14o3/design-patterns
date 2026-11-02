package com.sjh14o3.designPatterns.command.problem

class CloseCommand(private val device: Openable): Command {
    override fun execute() {
        device.close()
    }

    override fun undo() {
        device.open()
    }
}