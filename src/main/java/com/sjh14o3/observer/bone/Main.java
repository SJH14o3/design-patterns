package com.sjh14o3.observer.bone;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject1 = new ConcreteSubject();
        ConcreteSubject subject2 = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver(subject1);
        Observer observer2 = new ConcreteObserver(subject2);

        subject1.attach(observer1);
        subject2.attach(observer2);

        subject1.setState(5);
        subject1.notifyObservers();

        subject2.setState(-1);
        subject2.notifyObservers();
    }
}
