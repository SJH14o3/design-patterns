package com.sjh14o3.designPatterns.command.problem

import java.util.*

class RemoteController {
    private val commands = mutableMapOf<Int, Command>() /* assuming controller has infinite buttons.
    Otherwise, an array with size of total buttons should be used. */
    private val actions = ArrayDeque<Command>()

    fun setCommand(buttonNumber: Int, command: Command) {
        commands[buttonNumber] = command
    }

    fun pressButton(buttonNumber: Int) {
        val command = commands[buttonNumber]
        if (command != null) {
            command.execute()
            actions.add(command)
        } else {
            println("No command is set for $buttonNumber")
        }
    }

    fun undo() {
        val command = actions.pollLast()

        if (command == null) {
            println("There is no command to undo")
            return
        }

        command.undo()
    }
}