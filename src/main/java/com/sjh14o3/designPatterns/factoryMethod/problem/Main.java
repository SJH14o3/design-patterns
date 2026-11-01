package com.sjh14o3.designPatterns.factoryMethod.problem;

public class Main {
    public static void main(String[] args) {
        ApplicationService emailService =
                new ApplicationService(new EmailNotificationCreator());

        ApplicationService smsService =
                new ApplicationService(new SMSNotificationCreator());

        ApplicationService pushService =
                new ApplicationService(new PushNotificationCreator());

        emailService.sendNotification("Hello, user!");
        smsService.sendNotification("Your code is 1234");
        pushService.sendNotification("New message received");
    }
}
