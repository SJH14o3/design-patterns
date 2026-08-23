package com.sjh14o3.facade.problem

class PaymentService {

    fun processPayment(customer: Customer, amount: Double): Boolean {
        if (!customer.canPay(amount)) {
            return false
        }

        customer.pay(amount)
        println("Payment of $amount processed")
        return true
    }
}