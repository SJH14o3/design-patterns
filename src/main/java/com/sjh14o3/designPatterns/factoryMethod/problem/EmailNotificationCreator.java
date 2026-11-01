package com.sjh14o3.designPatterns.factoryMethod.problem;

public class EmailNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
