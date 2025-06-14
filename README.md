# Low-Level-Design

# Strategy Design Pattern: Computer System Example

This module demonstrates the **Strategy** design pattern, a behavioral pattern frequently discussed in interviews. The pattern enables selecting an algorithm's behavior at runtime by encapsulating each algorithm in a separate class and making them interchangeable.

## Interview-Relevant Concepts

- **Encapsulation of algorithms:** Each strategy is implemented in its own class.
- **Interchangeability:** Strategies can be swapped at runtime without modifying the context.
- **Open/Closed Principle:** New strategies can be added without changing existing code.

## Use Case: Computer System

Suppose you want to implement different power management behaviors (e.g., for different computer models like HP, Apple, Chromebook). The Strategy pattern lets you encapsulate each power management algorithm and switch between them dynamically.

## Common Interview Questions

- **What is the Strategy pattern?**
  - It defines a family of algorithms, encapsulates each one, and makes them interchangeable. The client can choose which algorithm to use at runtime.

- **What are the advantages?**
  - Promotes code reuse, supports dynamic algorithm selection, and avoids conditional statements for algorithm selection.

- **How would you add a new computer type (e.g., Dell)?**
  - Implement a new strategy class for Dell and integrate it with the context.

---

## References

- [Design Patterns: Strategy](https://refactoring.guru/design-patterns/strategy)
- [Source Code](https://github.com/abhijitvarpe007/Low-Level-Design/tree/main/src/main/java/StrategyDesignPattern)

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

# Factory Design Pattern: Shape Creation Example

This module demonstrates the **Factory** design pattern, a creational pattern frequently discussed in interviews. The pattern provides an interface for creating objects, allowing subclasses to decide which class to instantiate.

## Interview-Relevant Concepts

- **Encapsulation of object creation:** Centralizes and abstracts the instantiation logic.
- **Loose coupling:** Client code depends on interfaces, not concrete classes.
- **Open/Closed Principle:** New product types can be added with minimal changes.

## Use Case: Shape Creation System

Suppose you want to create different shapes (e.g., Square, Rectangle) based on user input. The Factory pattern lets you encapsulate the creation logic and return the appropriate shape object.

## Common Interview Questions

- **What is the Factory pattern?**
  - It defines an interface for creating objects but lets subclasses decide which class to instantiate.

- **What are the advantages?**
  - Promotes loose coupling, centralizes object creation, and makes code easier to extend.

- **How would you add a new shape (e.g., Circle)?**
  - Implement the `Shape` interface and update the factory to handle the new type.

---

## References

- [Design Patterns: Factory](https://refactoring.guru/design-patterns/factory-method)
- [Source Code](https://github.com/abhijitvarpe007/Low-Level-Design/tree/main/src/main/java/FactoryDesignPattern)

# Null Object Design Pattern: Vehicle Example

This module demonstrates the **Null Object** design pattern, a behavioral pattern often discussed in interviews. The pattern provides an object as a surrogate for the lack of an object, implementing default or "do nothing" behavior to avoid null checks.

## Interview-Relevant Concepts

- **Avoids null checks:** Client code can use the Null Object without worrying about `null` references.
- **Polymorphism:** The Null Object implements the same interface as real objects.
- **Default behavior:** Encapsulates the absence of an object with safe default actions.

## Use Case: Vehicle System

Suppose you want to fetch a vehicle object (e.g., Car, Bike) based on user input. If the requested vehicle does not exist, the Null Object pattern lets you return a default object with safe values, avoiding `NullPointerException` and extra null checks.

## Common Interview Questions

- **What is the Null Object pattern?**
  - It provides a non-functional object in place of a `null` reference, implementing default behavior.

- **What are the advantages?**
  - Eliminates the need for null checks, prevents runtime errors, and simplifies client code.

- **How would you add a new vehicle type (e.g., Truck)?**
  - Implement the `Vehicle` interface for Truck and update the factory to handle the new type.

---

## References

- [Design Patterns: Null Object](https://refactoring.guru/design-patterns/null-object)
- [Source Code](https://github.com/abhijitvarpe007/Low-Level-Design/tree/main/src/main/java/NullObjectPattern)

# Adapter Design Pattern: Bird and Duck Example

This module demonstrates the **Adapter** design pattern, a structural pattern frequently discussed in interviews. The pattern allows incompatible interfaces to work together by providing a wrapper that translates one interface into another.

## Interview-Relevant Concepts

- **Interface compatibility:** Enables classes with incompatible interfaces to collaborate.
- **Wrapper/Adapter class:** Implements the expected interface and delegates calls to the adaptee.
- **Single Responsibility Principle:** Keeps conversion logic separate from business logic.

## Use Case: Bird and Duck System

Suppose you have a system where `Bird` objects are expected, but you want to use a `Duck` object. The Adapter pattern lets you wrap a `Duck` in a `DuckAdapter` so it can be used wherever a `Bird` is required.

## Real-World Example

A common real-world example is using different types of power plugs and sockets. For instance, if you have a European plug but only an American socket, you use a plug adapter to connect them. The adapter converts the interface of the European plug to match the American socket, allowing compatibility without modifying either.

## Common Interview Questions

- **What is the Adapter pattern?**
  - It allows objects with incompatible interfaces to work together by wrapping the incompatible object with an adapter that implements the expected interface.

- **What are the advantages?**
  - Promotes code reusability, supports integration of legacy or third-party code, and adheres to the Open/Closed Principle.

- **How would you adapt another animal (e.g., Turkey) to the Bird interface?**
  - Implement a new adapter class (e.g., `TurkeyAdapter`) that implements the `Bird` interface and delegates calls to the `Turkey` methods.

---

## References

- [Design Patterns: Adapter](https://refactoring.guru/design-patterns/adapter)
- [Source Code](https://github.com/abhijitvarpe007/Low-Level-Design/tree/main/src/main/java/AdapterDesignPattern)

# Builder Design Pattern: Student Creation Example

This module demonstrates the **Builder** design pattern, a creational pattern frequently discussed in interviews. The pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

## Interview-Relevant Concepts

- **Step-by-step construction:** Builds complex objects step by step.
- **Immutability:** Final object can be made immutable after construction.
- **Separation of concerns:** Construction logic is separated from the object itself.

## Use Case: Student Creation System

Suppose you want to create `Student` objects with many optional and mandatory fields (e.g., name, age, parents' names, subjects). The Builder pattern lets you construct different types of students (e.g., CS, Mechanical) with varying attributes, without a telescoping constructor.

## Real-World Example

A real-world example is building a meal at a fast-food restaurant. You can choose different components (burger, drink, fries) in any order, and the builder assembles the final meal object.

## Common Interview Questions

- **What is the Builder pattern?**
  - It separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

- **What are the advantages?**
  - Avoids telescoping constructors, improves code readability, and supports the creation of immutable objects.

- **How would you add a new student type (e.g., ElectricalStudent)?**
  - Implement a new builder subclass for `ElectricalStudent` and define its specific construction steps.

---

## References

- [Design Patterns: Builder](https://refactoring.guru/design-patterns/builder)
- [Source Code](https://github.com/abhijitvarpe007/Low-Level-Design/tree/main/src/main/java/BuilderDesignPattern)