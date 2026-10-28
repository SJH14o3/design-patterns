package com.sjh14o3.factory_method.problem;

class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email -> " + message);
    }
}