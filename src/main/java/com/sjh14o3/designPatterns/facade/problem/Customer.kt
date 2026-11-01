package com.sjh14o3.designPatterns.facade.problem

class Customer(val name: String, private var balance: Double) {
    fun placeOrder(facade: OrderFacade, items: List<MenuItem>, deliveryAddress: String) : Boolean {
        return facade.placeOrder(this, items, deliveryAddress)
    }

    fun canPay(cost: Double): Boolean {
        return balance >= cost
    }

    fun pay(cost: Double) {
        balance -= cost
    }

    fun getBalance(): Double = balance
}