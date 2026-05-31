package com.sjh14o3.composite.bone;

abstract public class Component {
    // optional, keep parent in case for implementation needs
    // you could also use Component class, but you must check
    // that We are not setting a leaf as parent
    Composite parent;

    public abstract void operation();

    // for transparent implementation, these functions will go here,
    // but we are implementing safe method
//    public abstract void add(Component c);
//    public abstract void remove(Component c);


}