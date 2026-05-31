package com.sjh14o3.composite.gui;

import java.util.ArrayList;

public class Window extends Component {
    ArrayList<Component> components = new ArrayList<Component>();


    @Override
    public void operation() {
        System.out.println("Window operation");
        for (Component component : components) {
            // each component will do something
            component.operation();
        }
    }

    public void add(Component c) {
        components.add(c);
    }

    public void remove(Component c) {
        components.remove(c);
    }
}
