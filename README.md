# Object-Oriented Programming (OOP) Core Challenges

Welcome to the foundational Java OOP training repository. This repository contains three practical labs designed to teach core object-oriented design principles, state encapsulation, constructor mechanics, and data validation.

---

## 📂 Repository Structure

The project is organized into modular packages, each containing its own isolated executable domain and dedicated instructions:

```text
root/
├── README.md                          # Central repository dashboard (This file)
├── inventory/
│   ├── InventoryItem.java             # Shared state & global logging logic
│   ├── Main.java                      # Execution script for inventory testing
│   └── README.md                      # Detailed inventory task guidelines
├── product/
│   ├── Product.java                   # Basic encapsulation & static sequence logic
│   ├── Main.java                      # Execution script for product testing
│   └── README.md                      # Detailed product task guidelines
└── user/
    ├── User.java                      # Advanced chaining & validation mechanics
    ├── Main.java                      # Execution script for user profiles testing
    └── README.md                      # Detailed user task guidelines

```

---

## 🛠️ Modules Overview & Navigation

| Task Package | Difficulty | Core OOP Concepts Explored | Direct Link                                                            |
| --- | --- | --- |------------------------------------------------------------------------|
| **`product`** | 🟢 Beginner | Encapsulation, `private` modifiers, simple `static` counters for ID generation. | [Go to Product Task ➔](/src/main/java/org/bytebloom/product/README.md) |
| **`inventory`** | 🟡 Intermediate | Constructor chaining (`this()`), global tracking lists via `static ArrayList`. | [Go to Inventory Task ➔](/src/main/java/org/bytebloom/inventory/README.md)                         |
| **`user`** | 🔴 Advanced | Matrix constructor overloading, input validation guard clauses, state data masking. | [Go to User Task ➔](/src/main/java/org/bytebloom/user/README.md)                                   |

---

## 📝 Learning Objectives Checklist

Before completing this laboratory course, ensure you fully understand:

1. The difference between **Instance Fields** (unique per object) and **Static Fields** (shared across the entire class).
2. Why **Constructor Chaining** is preferred over duplicating field-assignment lines across overloaded constructors.
3. How to protect data integrity inside **Setters** using conditional logic predicates.