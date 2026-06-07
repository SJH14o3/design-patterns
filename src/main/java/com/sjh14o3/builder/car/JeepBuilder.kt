package com.sjh14o3.builder.car

class JeepBuilder: Builder {
    override fun getWheels(): Array<Wheel> {
        val wheel = Wheel(22)
        return arrayOf(wheel, wheel, wheel, wheel)
    }

    override fun getEngine(): Engine {
        return Engine(400)
    }

    override fun getBody(): Body {
        return Body("SUV")
    }
}