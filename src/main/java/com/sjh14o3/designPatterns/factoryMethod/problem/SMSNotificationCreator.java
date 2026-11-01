package com.sjh14o3.designPatterns.factoryMethod.problem;

public class SMSNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
