package com.sjh14o3.state.color;

public class Red extends ColorState {
    private final static ColorState instance = new Red();
    public static ColorState Instance() {
        return instance;
    }

    private Red() {}

    @Override
    public ColorState changeColorState() {
        return Blue.Instance();
    }

    @Override
    public String getColor() {
        return "Red";
    }
}
