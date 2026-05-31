package com.sjh14o3.state.bone;

public class Main {
    public static void main(String[] args) {
        try {
            Context c = new Context("state.bone.ConcreteStateA");
            c.request();
            c.setState("state.bone.ConcreteStateB");
            c.request();
        } catch (Exception e) {
            System.out.println("ran into exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
