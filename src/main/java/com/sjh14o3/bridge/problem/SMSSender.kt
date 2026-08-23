package com.sjh14o3.bridge.problem

class SMSSender: NotificationSender {
    override fun deliver(n: Notification) {
        println("Notification $n delivered with SMS")
    }
}