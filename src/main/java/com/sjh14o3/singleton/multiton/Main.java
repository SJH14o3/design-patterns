package com.sjh14o3.singleton.multiton;

public class Main {
    public static void main(String[] args) {
        Integer k1 = 12;
        Integer k2 = 25;
        Multiton m1 = Multiton.getInstance(k1);
        Multiton m2 = Multiton.getInstance(k2);
        System.out.println(m1.equals(m2));
    }
}
