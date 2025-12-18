# Java Application Learning Repository

A comprehensive collection of Java programming concepts, design patterns, and practical implementations demonstrating core Java principles and object-oriented programming fundamentals.

## 📋 Table of Contents

- [Overview](#overview)
- [Projects](#projects)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Topics Covered](#topics-covered)
- [Contributing](#contributing)

## 🎯 Overview

This repository serves as a practical learning resource for Java developers, covering fundamental to advanced concepts including:
- Object-Oriented Programming (OOP) principles
- Design Patterns
- Java Collections Framework
- Concurrency and Multithreading
- Abstraction and Interfaces
- Real-world application scenarios

## 📁 Projects

### 1. **Abstraction**
Implementation of abstract classes and methods demonstrating abstraction principles in Java.
- **Path:** `abstraction/`
- **Key Files:** `TestAbstract.java`, `main.java`
- **Concepts:** Abstract classes, method abstraction

### 2. **Challenge - Organ System**
OOP challenge implementing a human organ system with inheritance and polymorphism.
- **Path:** `challenge/`
- **Key Files:** `Organ.java`, `Eye.java`, `Heart.java`
- **Concepts:** Inheritance, polymorphism, class hierarchy

### 3. **Challenge2 - Contact & Message Manager**
A practical application for managing contacts and messages.
- **Path:** `challenge2/`
- **Key Files:** 
  - `Contact.java` - Contact entity
  - `ContactManager.java` - Contact management logic
  - `Message.java` - Message entity
  - `MessageManager.java` - Message management logic
- **Concepts:** CRUD operations, class relationships, management systems

### 4. **Collections**
Exploration of Java Collections Framework with practical examples.
- **Path:** `Collections/`
- **Key Files:** `student.java`, `newamin.java`
- **Concepts:** Lists, Sets, Maps, Collection operations

### 5. **Concurrency**
Implementation of concurrent programming concepts and multithreading.
- **Path:** `Concurrency/`
- **Key Files:** `Main.java`
- **Concepts:** Threads, synchronization, concurrent execution

### 6. **Hello World - OOP Fundamentals**
Foundational OOP concepts with real-world examples.
- **Path:** `hello world/`
- **Key Files:** 
  - `animal.java`, `bird.java` - Animal hierarchy
  - `phone.java` - Phone class
  - `oops.java` - OOP demonstrations
- **Concepts:** Classes, objects, inheritance, encapsulation

### 7. **Interface**
Interface implementation and polymorphism demonstrations.
- **Path:** `interface/`
- **Key Files:** 
  - `Carinterface.java` - Car interface definition
  - `ElectricCar.java` - Interface implementation
- **Concepts:** Interfaces, implementation, contract-based programming

### 8. **OOPs3 - Composition**
Advanced OOP concepts focusing on composition and relationships.
- **Path:** `oops3/`
- **Key Files:** 
  - `Car.java`
  - `Engine.java`
- **Concepts:** Composition, has-a relationships, object collaboration

### 9. **Singleton**
Implementation of the Singleton design pattern.
- **Path:** `Singleton/`
- **Key Files:** `Database.java`
- **Concepts:** Singleton pattern, instance control, design patterns

## 🔧 Prerequisites

- **Java Development Kit (JDK):** Version 8 or higher
- **IDE:** IntelliJ IDEA (recommended) or any Java-compatible IDE
- **Build Tool:** Maven or Gradle (optional)
- **Operating System:** Windows, macOS, or Linux

## 🚀 Getting Started

### Clone the Repository
```bash
git clone <repository-url>
cd JavaApplication
```

### Running Individual Projects

Each project is structured as an independent module:

1. Navigate to the project directory:
   ```bash
   cd <project-name>
   ```

2. Compile the Java files:
   ```bash
   javac -d bin src/**/*.java
   ```

3. Run the main class:
   ```bash
   java -cp bin com.example.<package>.Main
   ```

### Using IntelliJ IDEA

1. Open IntelliJ IDEA
2. Select **File → Open**
3. Navigate to the `JavaApplication` directory
4. Select the project you want to explore
5. Right-click on the Main class and select **Run**

## 📂 Project Structure

```
JavaApplication/
│
├── abstraction/          # Abstract classes and methods
├── challenge/            # OOP challenge - Organ system
├── challenge2/           # Contact & Message Manager
├── Collections/          # Java Collections examples
├── Concurrency/          # Multithreading and concurrency
├── hello world/          # Basic OOP concepts
├── interface/            # Interface implementations
├── oops3/                # Advanced OOP - Composition
├── Singleton/            # Singleton design pattern
└── README.md             # This file
```

Each module contains:
- `*.iml` - IntelliJ IDEA module file
- `src/` - Source code directory
- `.idea/` - IDE configuration files
- `.gitignore` - Git ignore rules

## 📚 Topics Covered

| Concept | Projects |
|---------|----------|
| **Abstraction** | abstraction |
| **Inheritance** | challenge, hello world |
| **Polymorphism** | challenge, interface |
| **Encapsulation** | All projects |
| **Interfaces** | interface |
| **Composition** | oops3 |
| **Collections** | Collections |
| **Concurrency** | Concurrency |
| **Design Patterns** | Singleton |
| **CRUD Operations** | challenge2 |

## 💡 Learning Path

**Recommended order for beginners:**

1. **hello world** - Start with basic OOP fundamentals
2. **abstraction** - Learn abstraction concepts
3. **interface** - Understand interfaces and contracts
4. **oops3** - Explore composition and relationships
5. **challenge** - Apply inheritance and polymorphism
6. **Collections** - Master Java Collections Framework
7. **challenge2** - Build practical applications
8. **Concurrency** - Dive into multithreading
9. **Singleton** - Learn design patterns

## 🤝 Contributing

This is a learning repository. Feel free to:
- Add new examples
- Improve existing code
- Fix bugs
- Enhance documentation

## 📝 Notes

- Each project is self-contained and can be run independently
- Code follows Java naming conventions and best practices
- Comments are included for clarity and learning purposes

## 📄 License

This project is created for educational purposes.

---

**Happy Coding! ☕**
