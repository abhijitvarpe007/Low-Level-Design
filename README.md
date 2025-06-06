# Low-Level-Design

# Observer Design Pattern: Real-Time Notification Example

This module demonstrates the **Observer** design pattern, a fundamental behavioral pattern frequently discussed in interviews. The pattern defines a one-to-many relationship between objects so that when one object (the Subject) changes state, all its dependents (Observers) are notified and updated automatically.

## Interview-Relevant Concepts

- **Loose coupling:** The subject and observers are decoupled; the subject knows only a list of observers, not their concrete implementations.
- **Dynamic subscription:** Observers can subscribe or unsubscribe at runtime.
- **Push vs Pull:** The subject can push data to observers or allow them to pull the latest state.

## Use Case: Notification System

Suppose you want to implement a notification system where multiple components (e.g., email, SMS, push notifications) must react to a particular event (e.g., user registration). The Observer pattern lets you add or remove notification channels without changing the core logic.

## Common Interview Questions

- **What is the Observer pattern?**
  - It allows an object (subject) to notify a list of dependent objects (observers) about state changes, promoting loose coupling.

- **What are the advantages?**
  - Promotes loose coupling, supports dynamic subscription, and simplifies broadcasting events to multiple listeners.

- **How would you add a new notification type (e.g., Slack notification)?**
  - Implement a new Observer (e.g., `SlackNotificationObserver`) and register it with the Subject.

---

## References

- [Design Patterns: Observer](https://refactoring.guru/design-patterns/observer)
- [Source Code](https://github.com/abhijitvarpe007/Low-Level-Design/tree/bb2eca31ad80ac4f279a1e5897f54ab2a4772078/src/main/java/ObserverPattern)

# Chain of Responsibility Design Pattern: Logging Example

This module demonstrates the **Chain of Responsibility** design pattern, a behavioral pattern commonly covered in interviews. The pattern allows a request to pass through a chain of handlers, where each handler decides either to process the request or to pass it to the next handler in the chain.

## Interview-Relevant Concepts

- **Decoupling of sender and receiver:** Sender does not need to know which handler will process the request.
- **Flexible chain arrangement:** Handlers can be combined dynamically.
- **Single-responsibility principle:** Each handler addresses a specific concern.

## Use Case: Logging System

Suppose you want to implement a logging framework where log messages of different severity (INFO, DEBUG, ERROR) should be handled by corresponding processors. The Chain of Responsibility pattern allows for this extensibility and flexibility.

## Common Interview Questions

- **What is the Chain of Responsibility pattern?**
  - It passes requests along a chain of handlers, allowing multiple objects to handle a request without coupling sender to receiver.

- **What are the advantages?**
  - Reduces coupling, increases flexibility in assigning responsibilities to objects, and allows dynamic changes in handling logic.

- **How would you add a new log level (e.g., WARNING)?**
  - Create a new `WarningLogProcessor` extending `LogProcessor` and insert it into the chain.

---

## References

- [Design Patterns: Chain of Responsibility](https://refactoring.guru/design-patterns/chain-of-responsibility)
- [Source Code](https://github.com/abhijitvarpe007/Low-Level-Design/tree/63a42c972aea6190dac9bf8cf02a1e1fedd459a3/src/main/java/ChainResponsibilityDesignPattern)

# Decorator Design Pattern: Pizza Customization Example

This module demonstrates the **Decorator** design pattern, a structural pattern frequently discussed in interviews. The pattern allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class.

## Interview-Relevant Concepts

- **Open/Closed Principle:** Classes are open for extension but closed for modification.
- **Flexible composition:** Functionality can be combined at runtime by wrapping objects.
- **Single-responsibility principle:** Each decorator adds a specific feature.

## Use Case: Pizza Customization System

Suppose you want to implement a pizza ordering system where customers can add various toppings (e.g., cheese, mushrooms) to their pizza. The Decorator pattern allows you to add new toppings without changing the core pizza classes.

## Common Interview Questions

- **What is the Decorator pattern?**
  - It allows you to add new functionality to objects dynamically by placing them inside special wrapper objects (decorators).

- **What are the advantages?**
  - Promotes code reuse, supports flexible and dynamic feature addition, and avoids class explosion from many subclasses.

- **How would you add a new topping (e.g., Olives)?**
  - Implement a new decorator (e.g., `Olives`) extending the base decorator and wrap it around the pizza object.

---

## References

- [Design Patterns: Decorator](https://refactoring.guru/design-patterns/decorator)
- [Source Code](https://github.com/abhijitvarpe007/Low-Level-Design/tree/main/src/main/java/DecoratorDesignPattern)
