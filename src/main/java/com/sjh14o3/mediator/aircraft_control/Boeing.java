package com.sjh14o3.mediator.aircraft_control;

public class Boeing extends Aircraft {

    public Boeing(ITrafficControl mediator, String callSign) {
        super(mediator, callSign);
    }

    @Override
    public String toString() {
        return "Boeing " + this.callSign;
    }

    @Override
    public int getCeiling() {
        return 33000;
    }

}
