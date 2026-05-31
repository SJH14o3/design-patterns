package com.sjh14o3.singleton.subclassing;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = SingletonSub2.getInstance();
        singleton.setData(12);
        System.out.println(singleton);
    }
}

