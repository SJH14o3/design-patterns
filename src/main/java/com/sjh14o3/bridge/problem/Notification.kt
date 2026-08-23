package com.sjh14o3.bridge.problem

abstract class Notification(val title: String, val body: String, val notificationSender: NotificationSender) {
    fun send() {
        notificationSender.deliver(this)
    }
}