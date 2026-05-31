package com.sjh14o3.mediator.aircraft_control;

public interface ITrafficControl {
    public void registerAircraftUnderGuidance(Aircraft recipient);
    public void receiveAircraftLocation(Aircraft reportingAircraft);
}