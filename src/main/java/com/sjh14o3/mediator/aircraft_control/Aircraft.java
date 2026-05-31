package com.sjh14o3.mediator.aircraft_control;

public abstract class Aircraft {
    protected final ITrafficControl mediator;
    private int altitude;
    public String callSign;

    public abstract int getCeiling();

    public int getAltitude() { return altitude; }
    public void setAltitude(int altitude) {
        this.altitude = altitude;
        mediator.receiveAircraftLocation(this);
    }

    public String getCallSign() { return this.callSign; }
    private void setCallSign(String callSign) { this.callSign =  callSign; }

    public void climb(int heightToClimb) { altitude += heightToClimb; }
    public void warn(Aircraft reportingAircraft) {
        System.out.println(this + " received a warn, close call from " + reportingAircraft);
    }

    protected Aircraft(ITrafficControl mediator, String callSign) {
        this.mediator = mediator;
        this.callSign = callSign;
        mediator.registerAircraftUnderGuidance(this);
    }
}
