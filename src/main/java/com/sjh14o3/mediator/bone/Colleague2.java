package com.sjh14o3.mediator.bone;

public class Colleague2 extends Colleague {
    public Colleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void transmitMessage(String message, Colleague target) {
        System.out.println(("colleague 2 transmitted \"" + message + "\" to " + target));
        mediator.transmitMessage(message, target);
    }


}
