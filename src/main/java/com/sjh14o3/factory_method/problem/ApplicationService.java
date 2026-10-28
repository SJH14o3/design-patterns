package com.sjh14o3.factory_method.problem;

// Client class
public class ApplicationService {
    private final Notification notification;

    public ApplicationService(NotificationCreator creator) {
        this.notification = creator.createNotification();
    }

    public void sendNotification(String message) {
        notification.send(message);
    }
}
