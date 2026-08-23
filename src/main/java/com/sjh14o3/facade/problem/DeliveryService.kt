package com.sjh14o3.facade.problem

class DeliveryService(private var available: Boolean = true) {
    fun isAvailable(): Boolean = available

    fun setAvailable(available: Boolean) {
        this.available = available
    }

    fun scheduleDelivery(address: String) {
        println("Delivery to $address scheduled")
    }
}