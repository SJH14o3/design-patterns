package com.sjh14o3.designPatterns.factoryMethod.problem;

class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS -> " + message);
    }
}