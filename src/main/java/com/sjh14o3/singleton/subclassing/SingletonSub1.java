package com.sjh14o3.singleton.subclassing;


public class SingletonSub1 extends Singleton {
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new SingletonSub1();
        }
        return instance;
    }
    private SingletonSub1() {}

    @Override
    public String toString() {
        return "SingletonSub1 with data " + getData();
    }
}