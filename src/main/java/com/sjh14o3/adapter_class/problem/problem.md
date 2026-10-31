# Design Pattern Exercise: Adapter Pattern

## Problem: Integrating a Third-Party Payment Gateway

### Scenario

You are developing an e-commerce application that supports multiple payment providers.

Your application already uses a standard payment interface:

```java
public interface PaymentProcessor {
    void pay(double amount);
}
```

Your application has its own implementation:

```java
public class CreditCardPayment implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}
```

Now, the business wants to integrate a third-party payment service called `PayPal`.

However, the PayPal library was developed by another company, and its interface is different from your application's interface.

The PayPal library provides this class:

```java
public class PayPal {

    public void makePayment(double paymentAmount) {
        System.out.println("Paid $" + paymentAmount + " using PayPal.");
    }
}
```

### The problem

Your application expects objects implementing `PaymentProcessor`, which have a `pay()` method.

But the PayPal class provides `makePayment()` instead.

You cannot modify the PayPal class because it belongs to a third-party library.

How can you integrate PayPal into your application without changing your existing code or the third-party library?

## Your tasks

1. Create an adapter class called `PayPalAdapter`.
2. Make `PayPalAdapter` implement `PaymentProcessor`.
3. The adapter should internally contain a reference to a `PayPal` object.
4. Implement the `pay()` method by delegating the payment operation to PayPal's `makePayment()` method.
5. Modify the client code so that it can use both credit card payments and PayPal payments through the same `PaymentProcessor` interface.

## Expected output

```
Paid $100.0 using Credit Card.
Paid $200.0 using PayPal.
```

## Starter code

Here is the complete starting point. Your job is to implement the missing adapter class and client code.

## Optional advanced challenge

Extend the application to support Stripe.

The Stripe library has a different API:

```
public class Stripe {

    public void executeTransaction(double amount) {
        System.out.println(
            "Paid $" + amount + " using Stripe."
        );
    }
}
```

Create a `StripeAdapter` so the client can use Credit Card, PayPal, and Stripe without knowing their different APIs.

Learning objective: Understand how the Adapter Pattern allows incompatible interfaces to work together without modifying existing classes.

## a Quick Note
Since java does not support multiple inheritance for classes, it is not
possible to implement the class adapter method and object adapter
method can only be used.