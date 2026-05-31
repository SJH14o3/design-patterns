package com.sjh14o3.mediator.bone;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague c1 = new Colleague1(mediator);
        Colleague c2 = new Colleague2(mediator);
        c1.transmitMessage("hi c2", c2);
    }
}
