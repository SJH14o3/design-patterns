package com.sjh14o3.facade.problem

class OrderFacade(
    private val restaurantService: RestaurantService,
    private val menuService: MenuService,
    private val paymentService: PaymentService,
    private val deliveryService: DeliveryService,
    private val notificationService: NotificationService) {

    fun placeOrder(customer: Customer, items: List<MenuItem>, deliveryAddress: String): Boolean {
        // 1. Check restaurant
        if (!restaurantService.isAcceptingOrders()) {
            println("Order failed: restaurant is not accepting orders")
            return false
        }

        // 2. Check menu items
        if (!menuService.areItemsAvailable(items)) {
            println("Order failed: an item is not available")
            return false
        }

        // 3. Calculate price
        val total = menuService.getSum(items)

        // 4. Process payment
        if (!paymentService.processPayment(customer, total)) {
            println("Order failed: insufficient balance")
            return false
        }

        // 5. Check delivery
        if (!deliveryService.isAvailable()) {
            println("Order failed: delivery service not available")
            return false
        }

        // 6. Schedule delivery
        deliveryService.scheduleDelivery(deliveryAddress)

        // 7. Notify customer
        notificationService.sendOrderConfirmation(customer)

        println("Order successful!")
        return true
    }
}