package com.sjh14o3.state.bone;

import java.lang.reflect.InvocationTargetException;

public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(String in) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> state = Class.forName(in);
        this.state = (State) state.getDeclaredConstructor().newInstance();
    }

    public void request() {
        state.handle();
    }

    public Context(String initialState) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> state = Class.forName(initialState);
        this.state = (State) state.getDeclaredConstructor().newInstance();
    }
}