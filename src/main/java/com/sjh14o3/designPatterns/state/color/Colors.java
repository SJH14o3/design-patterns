package com.sjh14o3.designPatterns.state.color;

public class Colors {
    private ColorState colorState;
    public Colors() {
        colorState = Blue.Instance();
    }

    public void ChangeColor() {
        this.colorState = colorState.changeColorState();
        System.out.println("state was changed to " + colorState.getColor());
    }
}
