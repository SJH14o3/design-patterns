# Design Pattern: Build an Expression Interpreter
Behavioral Design Pattern

## 1. Problem: Mini Calculator Interpreter

You are going to build a simple expression interpreter using the Interpreter Design Pattern.

Your task is to create a mini calculator that can interpret and evaluate mathematical expressions.

The calculator should support:

- Addition (`+`)
- Subtraction (`-`)
- Multiplication (`*`)
- Division (`/`)
- Numeric values

For example:

```
10 + 5
10 + 5 * 2
(10 + 5) * 2
20 / 4 + 3
```

The goal is not simply to calculate these expressions.
The goal is to design a system where each grammar rule is represented by an expression class.

## 2. Requirements

Your interpreter must understand the following grammar:

```
expression ::= number
             | expression + expression
             | expression - expression
             | expression * expression
             | expression / expression
```

You should implement the following components:

| Component          | Responsibility                       |
|--------------------|--------------------------------------|
| Expression         | Common interface for all expressions |
| NumberExpression   | Represents a numeric value           |
| AddExpression      | Performs addition                    |
| SubtractExpression | Performs subtraction                 |
| MultiplyExpression | Performs multiplication              |
| DivideExpression   | Performs division                    |

Each expression must implement a common method:

```
fun interpret(): Double
```

## 3. Expected behavior

Your implementation should produce the following results:

| Expression     | Expected result |
|----------------|-----------------|
| `10 + 5`       | 15.0            |
| `10 - 5`       | 5.0             |
| `10 * 5`       | 50.0            |
| `10 / 5`       | 2.0             |
| `(10 + 5) * 2` | 30.0            |
| `10 + (5 * 2)` | 20.0            |

## 4. Example usage

Your final implementation should allow developers to construct expressions like this:

```
fun main() {

    val expression =
        MultiplyExpression(
            AddExpression(
                NumberExpression(10.0),
                NumberExpression(5.0)
            ),
            NumberExpression(2.0)
        )

    println(expression.interpret())
}
```

Expected output:

```
30.0
```

Notice that the developer doesn't need to know how the calculation is performed internally.

Each expression knows how to interpret itself.

## 5. Your tasks

Complete the following tasks in order.

Task 1 — Define the abstraction

Create an `Expression` interface with an `interpret()` method.

Task 2 — Implement terminal expressions

Create `NumberExpression`, which represents a number and returns its value.

Task 3 — Implement non-terminal expressions

Create the four mathematical expression classes:

- `AddExpression`
- `SubtractExpression`
- `MultiplyExpression`
- `DivideExpression`

Each class should receive two `Expression` objects.

Task 4 — Test nested expressions

Build a nested expression:

```
(10 + 5) * (20 - 10)
```

Expected result: `150.0`

Task 5 — Handle edge cases

Consider:

- Division by zero.
- Negative numbers.
- Decimal numbers.
- Nested expressions.

## 6. Bonus challenges

Once you finish the basic implementation, try these extensions:

Level 1: Add modulo

Support the `%` operator.

Level 2: Add power

Support exponentiation (`^`).

## 7. Learning objectives

After completing this exercise, you should understand:

1. What the Interpreter Design Pattern is.
2. The difference between terminal and non-terminal expressions.
3. How to represent grammar rules using classes.
4. How recursive composition works.
5. How the pattern separates expression structure from interpretation logic.