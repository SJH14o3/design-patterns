package com.sjh14o3.decorator.gui;

public class TextView extends Component {
    private final String text;
    public void display() {
        System.out.println("text view has the text: " + text);
    }

    public TextView(String text) {
        this.text = text;
    }
}
