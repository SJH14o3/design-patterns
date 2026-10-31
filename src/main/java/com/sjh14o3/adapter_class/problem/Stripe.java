package com.sjh14o3.adapter_class.problem;

public class Stripe {

    public void executeTransaction(double amount) {
        System.out.println(
                "Paid $" + amount + " using Stripe."
        );
    }
}