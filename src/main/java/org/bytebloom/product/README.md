

# Product Class Implementation

Welcome to the **Product Class** assignment. This project is a simple Java implementation designed to model a real-world product with essential properties, auto-incrementing IDs, and overloaded constructors.


## Covered Topics

This assignment focuses on the following core Object-Oriented Programming (OOP) concepts in Java:

* **Encapsulation:** Using `private` access modifiers to protect class data.
* **Static Fields & Methods:** Utilizing a class-level counter to track product counts and generate unique IDs.
* **Constructor Overloading:** Providing multiple ways to initialize a object based on different inputs.

---

## Class Requirements & Specifications

The `Product` class maps to the following blueprint rules:

| Property | Data Type | Validation / Behavior |
| --- | --- | --- |
| `id` | `int` | **Auto-incrementing** integer, unique for every product instance. |
| `name` | `String` | Maximum length of **50 characters**. |
| `description` | `String` | Maximum length of **100 characters**. |
| `price` | `double` | Must be **greater than 0**. |
| `quantity` | `int` | Must be **greater than 0**. |

---

## Implementation Details

### 1. Auto-Incrementing ID

To ensure every product gets a unique ID without manual assignment, a `private static int counter` is used. Every time a constructor is called:

1. The current value of `counter` is assigned to the new product's `id`.
2. The `counter` is incremented by 1.

### 2. Overloaded Constructors

The class provides two ways to instantiate a `Product` object:

* **Minimal Product:** 
```java
  public Product(String name, double price)
```
*Initializes a product with just a name and price.*




* **Stock Product:** 
```java
  public Product(double price, int quantity, String description)
```
*Initializes a product focused on inventory tracking (price, quantity, and description).*




### 3. Global Product Count

You can retrieve the total number of products created during the application's lifecycle by calling the static utility method:

```java
Product.getTotalProductsCount();

```

### Expected Output

When compiled and run, the terminal output perfectly demonstrates the centralized logging behavior:

```text
--- Starting Inventory Item Demo ---

>> Created 2 initial items.

>> Updating item 1 name...
>> Updating item 1 name again...

--------------------------------------------------
SYSTEM STATS & AUDIT LOG
--------------------------------------------------
Total Items Tracked: 2

Global Audit Log History:
1. Item created with following details: Gaming Laptop 1299.99 Electronics
2. Item created with following details: Office Chair 150.0 Other
3. Item name changed to: Pro Gaming Laptop privous name is: Gaming Laptop
4. Item name changed to: Pro Gaming Laptop v2 privous name is: Pro Gaming Laptop

```

### Key Concepts for Students to Observe:

* **The "Other" Default Category:** Notice that `Office Chair` automatically received the `"Other"` category, proving that the constructor chaining smoothly initialized the fallback state.
* **Chronological Logging:** Even though actions happened across independent objects (`item1` and `item2`), they are all interlinked inside the same chronological `auditLog` stream because the log list is `static`.
* **State Preservation:** The log retains accurate records of exactly what the *previous* name was right before the mutation took place.