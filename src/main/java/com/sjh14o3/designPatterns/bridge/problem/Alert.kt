package com.sjh14o3.designPatterns.bridge.problem

class Alert(title: String, body: String, val alertType: String, notificationSender: NotificationSender) : Notification(title, body, notificationSender) {
    override fun toString(): String {
        return "Alert($title, $body, $alertType)"
    }
}