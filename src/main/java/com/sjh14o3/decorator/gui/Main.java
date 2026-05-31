package com.sjh14o3.decorator.gui;

public class Main {
    public static void main(String[] args) {
        TextView tv = new TextView("this is a text");
        tv.display();
        System.out.println();

        BorderDecorator bd = new BorderDecorator(tv);
        bd.display();
        System.out.println();

        ScrollDecorator sd = new ScrollDecorator(bd);
        sd.display();
    }
}
