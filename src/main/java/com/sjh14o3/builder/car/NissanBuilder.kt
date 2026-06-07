package com.sjh14o3.builder.car

class NissanBuilder: Builder {
    override fun getWheels(): Array<Wheel> {
        val wheel = Wheel(16)
        return arrayOf(wheel, wheel, wheel, wheel)
    }

    override fun getEngine(): Engine {
        return Engine(150)
    }

    override fun getBody(): Body {
        return Body("Hatchback")
    }
}