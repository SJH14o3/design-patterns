# Design Patterns
In this repository, I have practiced OOP design patterns in Java/Kotlin. I have also tried to solve a simple problem for
each pattern.  
current available patterns are:
- Mediator
- Observer
- Singleton
- Composite
- Decorator
- State
- Strategy
- Builder

Some larger problem that uses multiple patterns are also available. They include:
- a turned based combat game similar to Dungeons & Dragons,
solved with builder, decorator, state and strategy patterns.

## Mediator Pattern Problems
### Aircraft Control
Consider a scenario where incoming aircraft need to carefully
communicate with each other for safety reasons. They constantly
need to know the position of all other planes, meaning that each
aircraft needs to communicate with all other aircraft. You have 3
types of aircraft in your domain model: Boeing, Airbus and
Fokker. Consider that each type needs to communicate with the
other two types.

### Chatroom
You can think of the mediator as a chat room, each participant can
register to different chat rooms and send messages to the chat
rooms. Only the participants in the chat room will receive the
message

### Software Development Team
Consider in a software development team, there are project
manager, developer and quality engineer. When the developer
completes coding for a new feature, the codes are committed to the
repository. Other shareholders like quality engineer and project
manager need to be notified.

## Observer Pattern Problem
There is a website with many forums. users can follow forums. when there is a new post in a forum,
all the followers must be notified.

## Singleton Pattern Problem
We have a single music player that can only play a style at a time. the styles are pop,
classic and country. by default, it plays classic style.

## Composite Problem
In a GUI, we have windows and widgets. windows can contain widgets and windows.

## Decorator Problem
We have a gui element. the gui element could possibly have a vertical scroll bar and
border. 

## State Problem
Let say we have a class that its initial state is color blue.
changing state from blue color will result in color green.
green to pink, pink to red and red to blue.

## Strategy Problem
A class wants to decide at run-time what algorithm it
should use to sort an array. Many different sort algorithms are
already available.

## Builder Problem
There are two cars.
We have a jeep and a nissan.
These cars parts have different attributes.
Create two builders for each car.