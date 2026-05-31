package com.sjh14o3.mediator.bone;

import java.util.ArrayList;

public class ConcreteMediator implements Mediator {
    private final ArrayList<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addColleague(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
        }
    }

    @Override
    public void transmitMessage(String message, Colleague target) {
        target.receiveMessage(message);
    }


}
