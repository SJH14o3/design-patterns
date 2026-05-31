package com.sjh14o3.state.color;

public class Blue extends ColorState {
    private final static ColorState instance = new Blue();
    public static ColorState Instance() {
        return instance;
    }

    private Blue() {}

    @Override
    public ColorState changeColorState() {
        return Green.Instance();
    }

    @Override
    public String getColor() {
        return "Blue";
    }
}
