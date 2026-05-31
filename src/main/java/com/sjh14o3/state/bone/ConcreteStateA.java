package com.sjh14o3.state.bone;

public class ConcreteStateA implements State {
    @Override
    public void handle() {
        System.out.println("Handling with state A");
    }
}