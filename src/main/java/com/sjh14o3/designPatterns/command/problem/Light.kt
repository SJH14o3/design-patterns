package com.sjh14o3.designPatterns.command.problem

class Light(private var isOn: Boolean = false): Switchable {
    override fun turnOn() {
        isOn = true
        println("Light is ON")
    }

    override fun turnOff() {
        isOn = false
        println("Light is OFF")
    }
}