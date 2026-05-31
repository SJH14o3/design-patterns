package com.sjh14o3.singleton.multiton;

import java.util.HashMap;
import java.util.Map;

public class Multiton {
    private static final Map<Object, Multiton> instances = new HashMap<>();
    private Multiton() {}
    public static synchronized Multiton getInstance(Object key) {
        Multiton instance = instances.get(key);
        if (instance == null) {
            // lazy instantiation
            instance = new Multiton();
            instances.put(key, instance);
        }
        return instance;
    }
}