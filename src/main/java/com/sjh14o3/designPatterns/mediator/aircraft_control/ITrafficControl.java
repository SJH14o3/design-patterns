package com.sjh14o3.designPatterns.mediator.aircraft_control;

public interface ITrafficControl {
    public void registerAircraftUnderGuidance(Aircraft recipient);
    public void receiveAircraftLocation(Aircraft reportingAircraft);
}