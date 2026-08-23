package com.sjh14o3.bridge.problem

class PushSender: NotificationSender {
    override fun deliver(n: Notification) {
        println("Notification $n delivered with Push")
    }
}