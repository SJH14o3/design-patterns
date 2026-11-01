package com.sjh14o3.designPatterns.adapterClass.problem;

public class PayPalAdapter implements PaymentProcessor {
    private final PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void pay(double amount) {
        payPal.makePayment(amount);
    }
}
