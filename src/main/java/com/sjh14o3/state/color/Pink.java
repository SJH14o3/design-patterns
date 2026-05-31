package com.sjh14o3.state.color;

public class Pink extends ColorState {
    private final static ColorState instance = new Pink();
    public static ColorState Instance() {
        return instance;
    }

    private Pink() {}

    @Override
    public ColorState changeColorState() {
        return Red.Instance();
    }

    @Override
    public String getColor() {
        return "Pink";
    }
}