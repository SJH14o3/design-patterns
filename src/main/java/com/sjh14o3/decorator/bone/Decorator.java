package com.sjh14o3.decorator.bone;

public abstract class Decorator implements Component {
    protected Component component;
    @Override
    public abstract void operation();

    public Decorator(Component component) {
        this.component = component;
    }
}
