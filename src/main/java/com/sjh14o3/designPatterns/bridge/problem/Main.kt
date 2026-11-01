package com.sjh14o3.designPatterns.bridge.problem

fun main() {
    val alert1 = Alert("CPU Usage Warning", "Server CPU usage is over 90%",
        "Technical", EmailSender())
    alert1.send()

    val reminder1 = Reminder("Appointment Reminder", "Your appointment is tomorrow",
        "08/24/2026-10:00AM", SMSSender())
    reminder1.send()

    val alert2 = Alert("Order Shipped", "Your order has shipped",
        "Information", PushSender())
    alert2.send()
}