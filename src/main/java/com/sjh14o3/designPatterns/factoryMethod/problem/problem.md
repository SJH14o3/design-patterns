# Design Pattern Exercise: Factory Method

Difficulty: Beginner → Intermediate · OOP · Creational Design Pattern

## Problem: Notification Service

You are developing a notification system for an application. The application must send notifications through different channels, such as Email, SMS, and Push Notifications.

Initially, the application only sends email notifications. Later, the business requires SMS and push notifications as well.

Your task is to design the system using the Factory Method design pattern so that adding a new notification type does not require modifying the core notification-sending logic.

## 1. Requirements

Your implementation must satisfy these functional requirements:

1. Define a common `Notification` interface.
2. Implement three concrete notifications:
    - `EmailNotification`
    - `SMSNotification`
    - `PushNotification`
3. Each notification must implement a `send(message)` method.
4. Define an abstract creator class that declares a factory method for creating notifications.
5. Implement concrete creators that decide which notification object to instantiate.
6. The application must send a notification without depending directly on concrete notification classes.

### Example expected behavior

```
EmailNotification: Sending email -> Hello, user!
SMSNotification: Sending SMS -> Your code is 1234
PushNotification: Sending push notification -> New message received
```

## 2. Starter code

Use Java for this exercise. The code below intentionally leaves important parts for you to implement.

```

interface Notification {
    void send(String message);
}

// TODO 1: Implement EmailNotification
class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        // Your implementation
    }
}

// TODO 2: Implement SMSNotification
class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        // Your implementation
    }
}

// TODO 3: Create an abstract NotificationCreator
// It must declare a factory method that returns Notification.

// TODO 4: Implement EmailNotificationCreator
// It should create an EmailNotification.

// TODO 5: Implement SMSNotificationCreator
// It should create an SMSNotification.

// TODO 6: Implement an application service that accepts
// a NotificationCreator and sends a message without
// instantiating concrete notification classes.

```

## 3. Your tasks

### Exercise checklist

1. Implement the products

    - Create EmailNotification and SMSNotification. Each class should print a different message when send() is called.

2. Implement the factory method

    - Create an abstract NotificationCreator with a createNotification() factory method that returns a Notification.

3. Implement concrete creators

    - Create EmailNotificationCreator and SMSNotificationCreator, each responsible for instantiating its own notification type.

4. Implement the client

    - Create a service that uses NotificationCreator to obtain a notification and send a message without knowing the concrete product class.

5. Extend the system

    - Add PushNotification and PushNotificationCreator without modifying the existing notification classes or the client service.

## 4. Design constraints

Your solution should follow these rules:

- Program to an interface: Client code should depend on `Notification`, not `EmailNotification` or `SMSNotification`.
- Encapsulate object creation: Concrete creators decide which notification product to create.
- Follow the Open/Closed Principle: Adding a new notification type should not require changing the existing client service.
- Avoid conditional creation logic in the client: The client should not contain a `switch` or `if/else` statement to choose the notification type.

## 5. Hints

Hint 1: Separate product and creator

The `Notification` interface represents the product. `NotificationCreator` represents the creator.

Hint 2: Use an abstract factory method

```
abstract class NotificationCreator {
    public abstract Notification createNotification();
}
```

Hint 3: Let the creator handle construction

The client asks the creator for a notification, then calls `send()`. It does not instantiate the concrete notification itself.

## 6. Bonus challenge

Suppose you now need to support Slack notifications and WhatsApp notifications.

Can you add both without changing the existing `NotificationApplication` service?

Think about which classes you need to add, which interfaces remain unchanged, and where object construction belongs.

Learning objective: By completing this exercise, you should understand how the Factory Method pattern separates object creation from object usage, supports extensibility, and reduces coupling between client code and concrete implementations.