package com.sjh14o3.designPatterns.decorator.bone;

public class Main {
    public static void main(String[] args) {
        ConcreteComponent text = new ConcreteComponent();
        Decorator scrollBar = new ConcreteDecorator(text);
        Decorator border = new ConcreteDecorator(scrollBar);
        border.operation();
    }
}