package com.sjh14o3.decorator.gui;

public class BorderDecorator extends Decorator {

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        System.out.println("Displaying a border");
        component.display();
    }
}
