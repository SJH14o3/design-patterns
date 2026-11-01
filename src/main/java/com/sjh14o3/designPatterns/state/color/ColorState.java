package com.sjh14o3.designPatterns.state.color;

public abstract class ColorState {

    public abstract ColorState changeColorState();

    public abstract String getColor();
}
