package com.sjh14o3.singleton.subclassing;

public class Singleton {
    // eager instantiation
    protected static Singleton instance;
    private int data = 0;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = SingletonSub1.getInstance();
        }
        return instance;
    }

    protected Singleton() {}

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}