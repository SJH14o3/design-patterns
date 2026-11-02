package com.sjh14o3.designPatterns.command.problem

class MacroCommand(
    private val commands: List<Command>
) : Command {

    override fun execute() {
        commands.forEach { it.execute() }
    }

    override fun undo() {
        commands.asReversed().forEach { it.undo() }
    }
}