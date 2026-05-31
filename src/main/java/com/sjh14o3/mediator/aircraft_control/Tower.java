package com.sjh14o3.mediator.aircraft_control;

import java.util.ArrayList;

public class Tower implements ITrafficControl {
    private final ArrayList<Aircraft> aircraft = new ArrayList<>();

    @Override
    public void registerAircraftUnderGuidance(Aircraft recipient) {
        if (!aircraft.contains(recipient)) { aircraft.add(recipient); }
    }

    @Override
    public void receiveAircraftLocation(Aircraft reportingAircraft) {
        for (Aircraft plane : aircraft) {
            if (reportingAircraft != plane && Math.abs(reportingAircraft.getAltitude() - plane.getAltitude()) < 1000) { // equals must be used...
                reportingAircraft.climb(1000);
                plane.warn(reportingAircraft);
            }
        }
    }

}