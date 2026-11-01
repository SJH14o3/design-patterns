package com.sjh14o3.designPatterns.factoryMethod.problem;

public class PushNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
