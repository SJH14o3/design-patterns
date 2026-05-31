package com.sjh14o3.mediator.aircraft_control;

public class Main {
    public static void main(String[] args) {
        ITrafficControl tower = new Tower();
        Aircraft flight1 = new Airbus(tower, "AC159");
        Aircraft flight2 = new Boeing(tower, "WS203");
        Aircraft flight3 = new Fokker(tower, "AC602");
        flight1.setAltitude(flight1.getAltitude() + 1000);
    }
}
