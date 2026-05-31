package com.sjh14o3.mediator.bone;

public class Colleague1 extends Colleague {
    public Colleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void transmitMessage(String message, Colleague target) {
        System.out.println(("colleague 1 transmitted \"" + message + "\" to " + target));
        mediator.transmitMessage(message, target);
    }


}
