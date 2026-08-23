package com.sjh14o3.facade.problem

class MenuService(
    private val menuItems: MutableList<MenuItem>) {
    fun getItems(): List<MenuItem> = menuItems.toList()

    fun addItem(item: MenuItem) {
        menuItems.add(item)
    }

    fun removeItem(item: MenuItem) {
        menuItems.remove(item)
    }

    fun areItemsAvailable(items: List<MenuItem>): Boolean {
        return items.all { it.isAvailable }
    }

    fun getSum(items: List<MenuItem>): Double {
        return items.sumOf { it.price }
    }
}