## Facade Design Pattern — Learning Problem

### Problem: Online Food Ordering System

You are developing an **online food ordering system**. The application currently has several independent subsystems:

- `RestaurantService` — checks whether the restaurant is open and accepts orders.
- `MenuService` — retrieves menu items and verifies item availability.
- `PaymentService` — processes payments.
- `DeliveryService` — finds a delivery driver and schedules delivery.
- `NotificationService` — sends order confirmation notifications.

A client currently has to interact with all of these services directly:

```text
Client
  │
  ├── RestaurantService
  ├── MenuService
  ├── PaymentService
  ├── DeliveryService
  └── NotificationService
```

For example, placing an order requires the client to perform approximately these steps:

1. Check whether the restaurant is open.
2. Check whether all requested menu items are available.
3. Calculate the total price.
4. Process the customer's payment.
5. Create a delivery request.
6. Send an order confirmation.

This makes the client tightly coupled to the internal subsystems. If the ordering workflow changes, the client code must also change.

### Your Task

**Design and implement a Facade** that provides a simple interface:

```text
placeOrder(customer, restaurant, items, paymentInfo, deliveryAddress)
```

The facade should hide the complexity of the underlying services.

The client should only need to do something conceptually similar to:

```text
orderingFacade.placeOrder(...)
```

### Requirements

1. Create separate classes for:
    - `RestaurantService`
    - `MenuService`
    - `PaymentService`
    - `DeliveryService`
    - `NotificationService`

2. Create an `OrderFacade` that coordinates these services.

3. The client should **not directly interact** with the subsystem classes.

4. If the restaurant is closed, the order should fail.

5. If an item is unavailable, the order should fail.

6. If payment fails, the order should fail without scheduling delivery.

7. If everything succeeds:
    - payment is processed,
    - delivery is scheduled,
    - confirmation is sent,
    - the client receives a successful order result.

### Learning Questions

After implementing the solution, answer:

1. **What problem does the Facade pattern solve in this example?**
2. Which class acts as the **Facade**?
3. Which classes are the **subsystems**?
4. Why is the client less coupled after introducing the Facade?
5. Does the Facade replace the subsystem classes? Why or why not?
6. What would happen if the payment workflow changed internally?
7. What is the difference between the **Facade pattern** and simply creating a helper/service class?

### Challenge

Add a new subsystem:

```text
LoyaltyService
```

It awards loyalty points after a successful order.

Modify the system so that the client still only calls:

```text
orderingFacade.placeOrder(...)
```

**The client should not need to know that `LoyaltyService` exists.**