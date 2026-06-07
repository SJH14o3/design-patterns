package com.sjh14o3.builder.car

class Car {
    var wheels: Array<Wheel>? = null
    var engine: Engine? = null
    var body: Body? = null

    override fun toString(): String {
        return "Car(wheels=${wheels?.get(0)}, engine=$engine, body=$body)"
    }
}