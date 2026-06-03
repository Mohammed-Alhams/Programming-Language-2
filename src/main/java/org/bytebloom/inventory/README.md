# InventoryItem Class Implementation

Welcome to the **InventoryItem** assignment. This project expands on object-oriented design by introducing a shared central **Audit Log** using lists, chaining constructors, and monitoring mutable state changes across instances.


## Covered Topics
This assignment focuses on the following core Object-Oriented Programming (OOP) concepts in Java:
* **Constructor Chaining (`this(...)`):** Reducing code duplication by having one constructor call another within the same class.
* **Shared Class State (`static` collections):** Using a `static ArrayList` to record events globally across all instances.
* **State Mutation Tracking:** Capturing previous and new states within setter methods to log object updates.

---

## Class Requirements & Specifications

The `InventoryItem` class manages tracking data according to these structural rules:

| Property / Field | Type | Context | Description |
| :--- | :--- | :--- | :--- |
| `id` | `int` | Instance | Unique ID auto-incremented by a class-level counter. |
| `itemName` | `String` | Instance | The specific name of the inventory item. |
| `category` | `String` | Instance | Grouping category (defaults to `"Other"` if omitted). |
| `price` | `double` | Instance | The cost value of the item. |
| `auditLog` | `ArrayList<String>` | **Static** | A shared global log tracking item creations and name updates. |
| `totalItemsInSystem`| `int` | **Static** | A global tracker counting active items created. |

---

## Implementation Details

### 1. Constructor Chaining
Instead of repeating setup logic across multiple constructors, the two-parameter constructor leverages constructor chaining:
```java
public InventoryItem(String itemName, double price) {
    this(itemName, price, "Other"); // Calls the main 3-parameter constructor
}
```

### 2. The Global Audit Log

Because `auditLog` is marked `static`, it acts as a single centralized ledger. Whether you create a new item or modify the name of an existing item via `setItemName()`, the action is tracked chronologically in this shared list.

### 3. Dynamic State Auditing

The `setItemName(String)` method doesn't just overwrite data; it retains history by holding a reference to `previousName` before assigning the update, committing both variables to the history log.