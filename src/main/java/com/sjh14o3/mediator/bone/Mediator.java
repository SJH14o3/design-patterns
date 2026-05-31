package com.sjh14o3.mediator.bone;

public interface Mediator {

    public abstract void addColleague(Colleague colleague);

    public abstract void transmitMessage(String message, Colleague target);
}
