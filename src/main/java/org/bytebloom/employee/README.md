
# Employee Inheritance Task

Welcome to the **Inheritance & Overriding** assignment. Here, we move from single-class logic to hierarchical design.

## Covered Topics
* **Inheritance (`extends`):** Sharing attributes and methods from a parent `Employee` class.
* **`super` Keyword:** Calling parent constructors to initialize shared fields.
* **Method Overriding (`@Override`):** Redefining parent behavior in child classes to meet specific needs.

## The Hierarchy
| Class | Relationship | Custom Behavior |
| :--- | :--- | :--- |
| `Employee` | Base Class | Standard 10% bonus calculation. |
| `Manager` | Extends `Employee` | Overrides `calculateBonus` to 25%. |
| `Developer`| Extends `Employee` | Overrides `displayInfo` for specialized output. |

---
## 🚀 Demo
Run the following `Main.java` to see Polymorphism in action:
```java
Employee emp = new Employee("John", 5000);
Employee mgr = new Manager("Sarah", 8000);
Employee dev = new Developer("Alex", 7000);

// Notice how each object uses its own version of the methods!
emp.displayInfo(); System.out.println("Bonus: " + emp.calculateBonus());
mgr.displayInfo(); System.out.println("Bonus: " + mgr.calculateBonus());
dev.displayInfo();