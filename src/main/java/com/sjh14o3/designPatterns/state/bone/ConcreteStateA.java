package com.sjh14o3.designPatterns.state.bone;

public class ConcreteStateA implements State {
    @Override
    public void handle() {
        System.out.println("Handling with state A");
    }
}