package com.sjh14o3.designPatterns.facade.problem

fun main() {
    val restaurantService = RestaurantService(open = true)

    val pizza = MenuItem("Pizza", 15.0)
    val burger = MenuItem("Burger", 10.0)
    val salad = MenuItem("Salad", 5.0)
    val menuService = MenuService(mutableListOf(pizza, burger, salad))

    val paymentService = PaymentService()
    val deliveryService = DeliveryService(available = true)
    val notificationService = NotificationService()

    val orderFacade = OrderFacade(restaurantService, menuService, paymentService, deliveryService, notificationService)
    val customer = Customer("Alice", 50.0)

    // successful order
    val success = customer.placeOrder(orderFacade, listOf(pizza, salad), "123 Main Street")
    println("Result: $success")
    println("Remaining balance: ${customer.getBalance()}")

    println()

    // closed restaurant -> order fails
    restaurantService.setOpen(false)
    val failedOrder = customer.placeOrder(orderFacade, listOf(pizza),"123 Main Street")
    println("Result: $failedOrder")

    println()

    // unavailable order
    restaurantService.setOpen(true)
    pizza.isAvailable = false
    val unavailableItemOrder = customer.placeOrder(orderFacade, listOf(pizza), "123 Main Street")
    println("Result: $unavailableItemOrder")
}