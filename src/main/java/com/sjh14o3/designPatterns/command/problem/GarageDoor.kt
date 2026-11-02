package com.sjh14o3.designPatterns.command.problem

class GarageDoor(private var isOpen: Boolean = false): Openable {
    override fun open() {
        isOpen = true
        println("Garage Door is OPEN")
    }

    override fun close() {
        isOpen = false
        println("Garage Door is CLOSED")
    }
}