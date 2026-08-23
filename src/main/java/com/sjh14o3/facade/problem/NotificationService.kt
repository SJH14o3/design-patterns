package com.sjh14o3.facade.problem

class NotificationService {
    fun sendOrderConfirmation(customer: Customer) {
        println("Order confirmation sent to ${customer.name}")
    }
}