package com.sjh14o3.factory_method.problem;

class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS -> " + message);
    }
}