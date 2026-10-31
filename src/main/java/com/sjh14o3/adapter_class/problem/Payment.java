package com.sjh14o3.adapter_class.problem;

public class Payment {
    public static void pay(double amount, PaymentProcessor paymentMethod) {
        paymentMethod.pay(amount);
    }
}
