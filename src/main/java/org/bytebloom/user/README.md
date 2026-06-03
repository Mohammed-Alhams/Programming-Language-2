# User Class Implementation

Welcome to the **User Management** assignment. This project dives deeper into constructor design variations, input validation, data normalization, and state management using custom helper methods.


## Covered Topics
This assignment focuses on the following core Object-Oriented Programming (OOP) concepts in Java:
* **Advanced Constructor Overloading:** Providing highly flexible initialization options (such as registering with just an email, just credentials, or a full profile).
* **Constructor Chaining via `this()`:** Forwarding constructor execution flows to maximize code reusability.
* **Encapsulation with Guard Clauses:** Utilizing internal validation methods to protect object fields from corrupted or poorly formatted input.
* **Data Transformation in Getters:** Altering the format of returned strings during reading operations (data masking/formatting).

---

## Class Requirements & Specifications

The `User` class adheres to the following structural specifications:

| Property | Data Type | Visibility | Constraints / Formatting |
| :--- | :--- | :--- | :--- |
| `id` | `int` | `private` | **Auto-incrementing** unique identifier. |
| `email` | `String` | `private` | Validated to ensure it contains an `@` symbol. |
| `password` | `String` | `private` | Must be a minimum length of **6 characters**. |
| `username` | `String` | `private` | Must be a minimum length of **3 characters**. |
| `phoneNumber`| `String` | `private` | Optional field depending on constructor route. |

---

## Technical Highlights

### 1. Complex Chaining Flows
This class showcases intricate construction routing. For instance, creating a complete user triggers a chain that initializes core credentials first:
```java
public User(String phoneNumber, String password, String username, String email){
    this(email, password, username); // Forwards data to the 3-parameter constructor
    this.phoneNumber = phoneNumber;
    counter++; 
}
```


### 2. Formatted Readers (Getters)

Getters are not always simple mirrors of data. In this implementation, fetching a user's email dynamically prepends structural contexts to the returned value:

```java
public String getEmail(){
    return "Email: " + this.email;
}

```

### 3. Business Rule Enforcement

Mutations through setters and constructors pass through dedicated structural predicates (`isValidEmail`, `isValidPassword`, `isValidUsername`) preventing bad initial data overwrites.



### Expected Output

When compiled and executed, the system output displays the following sequencing:

```text
--- Starting User Registration Demo ---

>> Creating User 1 (Email Only)...
User 1 ID: 0
User 1 Readout -> Email: alice@bytebloom.org

--------------------------------------------------
>> Creating User 2 (Phone & Password)...
User 2 ID: 1

--------------------------------------------------
>> Creating User 3 (Full Profile - Triggers Chaining)...
User 3 ID: 2
User 3 Readout -> Email: bob@bytebloom.org
User 3 Username: bobTheCoder

--------------------------------------------------
Total Users Attempted/Registered in System: 4

```

### Key Concepts for Students to Observe:

* **The `getEmail()` Transform:** Notice that calling `user1.getEmail()` outputted `Email: alice@bytebloom.org` rather than just the raw string. This highlights how getters can manage string styling.
* **Double Increment Catch:** In your current code block for the 4-parameter constructor, both `this(email...` and the constructor itself call `counter++`. This causes the internal count to jump forward by 2 during full profile creation (which explains why the system total registers `4` after only 3 users are manually typed). This serves as a great teaching moment for tracking execution flow side effects during constructor chaining!