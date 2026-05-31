package com.sjh14o3.composite.bone;

import java.util.ArrayList;

public class Composite extends Component {
    ArrayList<Component> components = new ArrayList<Component>();


    @Override
    public void operation() {
        // do something
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
