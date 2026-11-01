package com.sjh14o3.designPatterns.decorator.gui;

public abstract class Decorator extends Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}
