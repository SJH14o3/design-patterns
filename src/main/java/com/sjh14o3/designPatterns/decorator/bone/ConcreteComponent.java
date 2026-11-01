package com.sjh14o3.designPatterns.decorator.bone;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        //do something
        System.out.println("ConcreteComponent operation");
    }
}

