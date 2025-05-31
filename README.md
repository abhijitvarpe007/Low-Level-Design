# Low-Level-Design

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
