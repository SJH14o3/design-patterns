package com.sjh14o3.designPatterns.bridge.problem

class Reminder(title: String, body: String, val time: String, notificationSender: NotificationSender) : Notification(title, body, notificationSender) {
    override fun toString(): String {
        return "Reminder(title='$title', body='$body', time='$time')"
    }
}