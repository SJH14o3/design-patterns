package com.sjh14o3.designPatterns.adapterClass.problem;

public class Payment {
    public static void pay(double amount, PaymentProcessor paymentMethod) {
        paymentMethod.pay(amount);
    }
}
