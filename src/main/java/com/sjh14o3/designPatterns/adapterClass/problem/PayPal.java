package com.sjh14o3.designPatterns.adapterClass.problem;

public class PayPal {

    public void makePayment(double paymentAmount) {
        System.out.println("Paid $" + paymentAmount + " using PayPal.");
    }
}