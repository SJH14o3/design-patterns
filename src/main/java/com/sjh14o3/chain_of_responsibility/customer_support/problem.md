## Chain of Responsibility — Learning Problem

### Problem: Customer Support Ticket Handler

You are building a **customer support system** where incoming support tickets must be processed by different levels of employees.

Each ticket has:

* `priority`: `LOW`, `MEDIUM`, `HIGH`, or `CRITICAL`
* `message`
* `customerName`

The ticket should pass through a chain of support handlers:

1. **First-Level Support**

    * Handles `LOW` priority tickets.
    * If it cannot handle the ticket, passes it to the next handler.

2. **Technical Support**

    * Handles `MEDIUM` priority tickets.
    * Otherwise passes it onward.

3. **Senior Support**

    * Handles `HIGH` priority tickets.
    * Otherwise passes it onward.

4. **Manager**

    * Handles `CRITICAL` priority tickets.
    * If nobody can handle the ticket, print `"No handler available"`.

### Your Task

Implement this using the **Chain of Responsibility design pattern**.

Your solution should contain:

* A `SupportTicket` class.
* A `SupportHandler` interface or abstract class.
* Concrete handlers:

    * `FirstLevelSupport`
    * `TechnicalSupport`
    * `SeniorSupport`
    * `Manager`
* A mechanism for setting the **next handler**.
* A client that creates the chain and sends tickets through it.

### Expected Behavior

For these tickets:

```text
Ticket 1: LOW
Ticket 2: MEDIUM
Ticket 3: HIGH
Ticket 4: CRITICAL
```

The output should be conceptually:

```text
First-Level Support handled the ticket.
Technical Support handled the ticket.
Senior Support handled the ticket.
Manager handled the ticket.
```

### Challenge

After implementing the basic version, modify the problem so that **a handler can decide whether to handle a ticket based on both priority and ticket content**.

For example:

```text
LOW + "password reset" → First-Level Support
MEDIUM + "database error" → Technical Support
HIGH + "system outage" → Senior Support
CRITICAL + "security breach" → Manager
```

This extension helps demonstrate the main benefit of Chain of Responsibility: **the sender does not need to know which concrete object will handle the request.**
