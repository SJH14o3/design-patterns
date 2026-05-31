package com.sjh14o3.observer.bone;

public class ConcreteObserver implements Observer {
    private int observerState;
    private ConcreteSubject subject;
    @Override
    public void update() {
        observerState = subject.getState();
        System.out.println("observer " + this + " set state to " + observerState);
    }

    public int getObserverState() {
        return observerState;
    }

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
    }
}