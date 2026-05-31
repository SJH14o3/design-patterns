package com.sjh14o3.mediator.aircraft_control;

public class Fokker extends Aircraft{
    public Fokker(ITrafficControl mediator, String callSign) {
        super(mediator, callSign);
    }

    @Override
    public String toString() {
        return "Fokker " + this.callSign;
    }


    @Override
    public int getCeiling() {
        return 40000;
    }
}
