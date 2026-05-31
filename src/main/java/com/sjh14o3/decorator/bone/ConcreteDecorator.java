package com.sjh14o3.decorator.bone;

public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        // do something
        System.out.println("Concrete Decorator operation");
        component.operation();
    }
}