package com.sjh14o3.designPatterns.adapterClass.problem;

public class Stripe {

    public void executeTransaction(double amount) {
        System.out.println(
                "Paid $" + amount + " using Stripe."
        );
    }
}