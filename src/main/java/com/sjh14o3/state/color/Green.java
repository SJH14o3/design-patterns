package com.sjh14o3.state.color;

public class Green extends ColorState{
    private final static ColorState instance = new Green();
    public static ColorState Instance() {
        return instance;
    }

    private Green() {}

    @Override
    public ColorState changeColorState() {
        return Pink.Instance();
    }

    @Override
    public String getColor() {
        return "Green";
    }
}
