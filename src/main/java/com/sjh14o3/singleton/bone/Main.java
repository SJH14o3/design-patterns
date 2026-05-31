package com.sjh14o3.singleton.bone;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.setData(10);
        System.out.println(s1.getData());
        System.out.println(s2.getData());
    }
}