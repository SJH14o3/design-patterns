package com.sjh14o3.facade.problem

data class MenuItem(
    val title: String,
    val price: Double,
    var isAvailable: Boolean = true
)