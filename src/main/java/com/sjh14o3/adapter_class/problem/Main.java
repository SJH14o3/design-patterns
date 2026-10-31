package com.sjh14o3.adapter_class.problem;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCardPayment = new CreditCardPayment();
        PaymentProcessor payPalAdapter = new PayPalAdapter(new PayPal());
        PaymentProcessor stripeAdapter = new StripeAdapter(new Stripe());

        Payment.pay(100.0, creditCardPayment);
        Payment.pay(200.0, payPalAdapter);
        Payment.pay(300.0, stripeAdapter);
    }
}
