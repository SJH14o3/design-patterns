package com.sjh14o3.factory_method.problem;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("sending push notification -> " + message);
    }
}
