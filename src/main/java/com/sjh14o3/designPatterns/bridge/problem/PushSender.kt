package com.sjh14o3.designPatterns.bridge.problem

class PushSender: NotificationSender {
    override fun deliver(n: Notification) {
        println("Notification $n delivered with Push")
    }
}