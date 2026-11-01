package com.sjh14o3.designPatterns.state.bone;

public class ConcreteStateB implements State {
    @Override
    public void handle() {
        System.out.println("Handling with State B");
    }
}
