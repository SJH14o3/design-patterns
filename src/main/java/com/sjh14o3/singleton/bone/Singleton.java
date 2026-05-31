package com.sjh14o3.singleton.bone;

public class Singleton {
    // eager instantiation
    private static Singleton instance = new Singleton();
    private int data = 0;

    public static Singleton getInstance() {
        return instance;
    }

    /* this is a thread safe method for lazy instantiation */
    /*
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    System.out.println("first instance created");
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    */

    private Singleton() {}

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
