package com.sjh14o3.designPatterns.command.problem

class AirConditioner(private var isOn: Boolean =false): Switchable {
    override fun turnOn() {
        isOn = true
        println("Air Conditioner is ON")
    }

    override fun turnOff() {
        isOn = false
        println("Air Conditioner is OFF")
    }
}