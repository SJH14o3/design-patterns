# Kotlin Design Pattern Challenge: Command Pattern
Behavioral Design Pattern

## Problem: Smart Home Remote Controller

You are developing a smart home application.
The application has a remote controller with multiple buttons.
Each button can execute a different action on a smart home device.

Your task is to implement this system using the Command Design Pattern in Kotlin.

## 1. Requirements

Your application should support three devices:

- Light – Can be turned on and off.
- Air Conditioner – Can be turned on and off.
- Garage Door – Can be opened and closed.

The remote controller has programmable buttons.
Each button should execute a command without knowing the details of the device.

### Functional requirements

1. Create a command interface.
2. Implement separate command classes for each device operation.
3. Each command must encapsulate the action it performs.
4. Create a remote controller that can store and execute commands.
5. The remote controller must not depend on concrete device classes.
6. Allow users to change which command is assigned to a button at runtime.

## 2. Expected behavior

For example, imagine the following sequence:

```
val light = Light()
val airConditioner = AirConditioner()
val garageDoor = GarageDoor()

val remote = RemoteController()

remote.setCommand(1, /* Light ON command */)
remote.setCommand(2, /* AC ON command */)
remote.setCommand(3, /* Garage OPEN command */)

remote.pressButton(1)
remote.pressButton(2)
remote.pressButton(3)
```

Expected output:

```
Light is ON
Air Conditioner is ON
Garage Door is OPEN
```

You should also be able to reassign a button:

```
remote.setCommand(1, /* Light OFF command */)
remote.pressButton(1)
```

Expected output:

```
Light is OFF
```

## 3. Constraints

Follow these design constraints:

- Use Kotlin.
- Do not use `when` or `if/else` in the remote controller to identify device types.
- The remote controller must depend on an abstraction rather than concrete commands.
- Every device operation should have its own command class.
- Keep device logic separate from command logic.
- Do not put device operations directly inside the remote controller.

## 4. Bonus challenges

Once the basic implementation works, try these extensions:

Level 1 — Undo functionality

Add an `undo()` operation to the command interface. Pressing undo should reverse the last executed command.

Level 2 — Command history

Store previously executed commands and allow the remote controller to undo multiple operations.

Level 3 — Macro commands

Create a command that executes multiple commands together.

Example: "Leaving Home" should turn off the light, turn off the AC, and close the garage door.

Level 4 — Kotlin improvements

Explore whether Kotlin interfaces, lambdas, or function types can simplify your implementation without
losing the Command Pattern's benefits.

## 5. What you should learn

After completing this exercise, you should understand:

- The roles of Command, Concrete Command, Receiver, and Invoker.
- How to decouple the sender of a request from its receiver.
- How to encapsulate operations as objects.
- How the Command Pattern enables undo, redo, and command history.