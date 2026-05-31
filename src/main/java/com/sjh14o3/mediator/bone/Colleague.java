package com.sjh14o3.mediator.bone;

public abstract class Colleague {
    protected final Mediator mediator;

    public abstract void transmitMessage(String message, Colleague target);

    public void receiveMessage(String message) {
        System.out.println("message \"" + message  + "\" received");
    }

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}