## Bridge Design Pattern — Learning Problem

### Problem: Cross-Platform Notification System

You are designing a **notification system** for a company that sends notifications through different platforms.

The system supports two types of notifications:

* **Alert**
* **Reminder**

Notifications can be delivered through different channels:

* **Email**
* **SMS**
* **Push Notification**

The company expects both dimensions to grow independently. For example, a new notification type such as `Promotion` might be added, while a new delivery channel such as `WhatsApp` could also be introduced.

### Your Task

Design the system using the **Bridge Design Pattern**.

Your solution should:

1. Define an abstraction for notifications.
2. Define an implementation interface for notification delivery.
3. Implement at least two notification types.
4. Implement at least three delivery channels.
5. Allow notification types and delivery channels to vary independently.
6. Demonstrate how a notification can be sent without the notification class knowing the concrete delivery mechanism.

### Expected Structure

Think about separating the system into two dimensions:

**Abstraction — What is being sent?**

* `Alert`
* `Reminder`

**Implementation — How is it delivered?**

* `EmailSender`
* `SmsSender`
* `PushSender`

For example:

```text
                 Notification
                      |
             +--------+--------+
             |                 |
           Alert            Reminder
             |                 |
             +--------+--------+
                      |
              NotificationSender
                      |
        +-------------+-------------+
        |             |             |
      Email          SMS          Push
```

### Questions to Consider

Before looking at a solution, try answering these:

1. Why would inheritance alone become problematic if you created classes such as:

    * `EmailAlert`
    * `SmsAlert`
    * `PushAlert`
    * `EmailReminder`
    * `SmsReminder`
    * `PushReminder`

2. Which two dimensions should be separated by the Bridge Pattern?

3. What should the `Notification` abstraction contain?

4. What methods should the `NotificationSender` implementation interface expose?

5. How would you add a new `Promotion` notification **without modifying** the existing email, SMS, or push sender classes?

6. How would you add `WhatsAppSender` **without modifying** `Alert` or `Reminder`?

### Challenge

Implement the design in a programming language of your choice.

Then demonstrate this usage:

```text
alert = Alert(emailSender)
alert.send("Server CPU usage is above 90%")

reminder = Reminder(smsSender)
reminder.send("Your appointment is tomorrow")

alert = Alert(pushSender)
alert.send("Your order has shipped")
```

**Learning objective:** The key idea is to make **notification type** and **delivery mechanism** independent dimensions, so that both can evolve without causing a combinatorial explosion of subclasses.
