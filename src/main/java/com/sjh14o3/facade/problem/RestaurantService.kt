package com.sjh14o3.facade.problem

class RestaurantService(private var open: Boolean) {
    fun isAcceptingOrders(): Boolean = open

    fun setOpen(open: Boolean) {
        this.open = open
    }
}