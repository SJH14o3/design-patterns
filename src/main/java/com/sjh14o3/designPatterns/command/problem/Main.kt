package com.sjh14o3.designPatterns.command.problem

fun main() {
    val light = Light()
    val airConditioner = AirConditioner()
    val garageDoor = GarageDoor()

    val remote = RemoteController()

    remote.setCommand(1, TurnOnCommand(light))
    remote.setCommand(2, TurnOnCommand(airConditioner))
    remote.setCommand(3, OpenCommand(garageDoor))

    remote.pressButton(1)
    remote.pressButton(2)
    remote.pressButton(3)
    remote.pressButton(4)

    remote.undo()
    remote.undo()
    remote.undo()
    remote.undo()

    println()

    val enteringHome = MacroCommand(
        listOf(
            TurnOnCommand(light),
            TurnOnCommand(airConditioner),
            OpenCommand(garageDoor)
        )
    )

    remote.setCommand(1, enteringHome)
    remote.pressButton(1)
    remote.undo()
}