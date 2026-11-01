package com.sjh14o3.designPatterns.factoryMethod.problem;

class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email -> " + message);
    }
}