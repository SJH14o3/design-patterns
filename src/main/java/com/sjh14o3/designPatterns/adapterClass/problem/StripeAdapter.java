package com.sjh14o3.designPatterns.adapterClass.problem;

public class StripeAdapter implements PaymentProcessor {
    private final Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void pay(double amount) {
        stripe.executeTransaction(amount);
    }
}
