package com.sjh14o3.singleton.subclassing;


public class SingletonSub2 extends Singleton {
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new SingletonSub2();
        }
        return instance;
    }
    private SingletonSub2() {}

    @Override
    public String toString() {
        return "SingletonSub2 with data " + getData();
    }
}