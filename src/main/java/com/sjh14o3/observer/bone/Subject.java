package com.sjh14o3.observer.bone;

import java.util.ArrayList;

public abstract class Subject {
    private final ArrayList<Observer> observers = new ArrayList<>();
    public void attach(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    // in the diagram, it is notify() but notify is a built in function for object class
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
