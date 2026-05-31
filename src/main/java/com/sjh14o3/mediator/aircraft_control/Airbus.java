package com.sjh14o3.mediator.aircraft_control;

public class Airbus extends Aircraft{
    public Airbus(ITrafficControl mediator, String callSign) {
        super(mediator, callSign);
    }

    @Override
    public String toString() {
        return "Airbus " + this.callSign;
    }

    @Override
    public int getCeiling() {
        return 40000;
    }
}

