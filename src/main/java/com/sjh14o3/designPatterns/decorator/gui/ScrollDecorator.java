package com.sjh14o3.designPatterns.decorator.gui;

public class ScrollDecorator extends Decorator {

    public ScrollDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        System.out.println("Displaying a vertical scroller");
        component.display();
    }
}
