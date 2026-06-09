
## Complex Inheritance & Algorithmic Overriding

This module introduces an advanced application of **Inheritance** and **Method Overriding** using a transactional financial payment system. Instead of simply appending strings, subclasses here alter internal math behaviors and override functional execution logic based on unique real-world constraints.

## Covered Topics

* **Hierarchical Polymorphism:** Managing a collection of distinct sub-systems via a parent class type reference.
* **Algorithmic Overriding:** Modifying mathematical calculations while preserving the original method signature contract.
* **Multi-Layered `super` Delegation:** Combining customized mathematical logic with pre-calculated parent equations.
* **Complete Flow Modification:** Overriding display output methods while appending domain-specific warning notices.

---

## Architecture Design

```text
       ┌────────────────────────┐
       │    PaymentProcessor    │
       ├────────────────────────┤
       │ calculateTotalBill()   │
       │ printReceipt()         │
       └───────────▲────────────┘
                   │
         ┌─────────┴─────────┐
         │                   │
┌─────────────────┐ ┌─────────────────┐
│CreditCardProcess│ │ CryptoProcessor │
├─────────────────┤ ├─────────────────┤
│ (Adds % Fee)    │ │ (Scales Gas Fee)│
└─────────────────┘ └─────────────────┘

```

---

## Implementation Rules

1. **`PaymentProcessor`:** Defines the base contract. A typical transaction simply charges the `item price + flat base fee`.
2. **`CreditCardProcessor`:** Modifies the price logic. It utilizes parent computations but forces an additional percentage-based merchant protection charge (`itemPrice * fraudInsuranceRate`).
3. **`CryptoProcessor`:** Scales structurally. Blockchain transaction fees are highly volatile; this processor overrides logic to multiply the *base transaction fee* by a network congestion variable, completely independent of the item's purchase value.

---

# Part 2: Running the Program Demo

### The Demo Code (`Main.java`)

```java
package org.bytebloom.payment;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Advanced Billing & Payment System Demo ---\n");

        double checkoutAmount = 100.00;

        // 1. Base Processing (Flat $5.00 fee)
        PaymentProcessor standardWay = new PaymentProcessor("Standard Stripe", 5.00);
        System.out.println(">> Scenario A: Standard Gateway Processing...");
        standardWay.printReceipt(checkoutAmount);
        
        System.out.println("\n--------------------------------------------------");

        // 2. Credit Card Processing (Flat $5.00 fee + 3% Fraud Insurance Protection)
        PaymentProcessor visaWay = new CreditCardProcessor("Visa Gateway", 5.00, 0.03);
        System.out.println(">> Scenario B: Credit Card Processing (With 3% Insurance)...");
        visaWay.printReceipt(checkoutAmount);

        System.out.println("\n--------------------------------------------------");

        // 3. Crypto Processing (Flat $5.00 base gas fee * 2.5x high network traffic multiplier)
        PaymentProcessor bitcoinWay = new CryptoProcessor("Bitcoin Core API", 5.00, 2.5);
        System.out.println(">> Scenario C: Crypto Gateway Processing (During High Traffic Network Spike)...");
        bitcoinWay.printReceipt(checkoutAmount);
    }
}

```

### Expected Output

```text
--- Advanced Billing & Payment System Demo ---

>> Scenario A: Standard Gateway Processing...
[Standard Stripe Receipt]
Item Price: $100.00
Total Charged: $105.00

--------------------------------------------------
>> Scenario B: Credit Card Processing (With 3% Insurance)...
[Visa Gateway Receipt]
Item Price: $100.00
Total Charged: $108.00

--------------------------------------------------
>> Scenario C: Crypto Gateway Processing (During High Traffic Network Spike)...
[Bitcoin Core API Receipt]
Item Price: $100.00
Total Charged: $112.50
⚠️ Warning: Crypto transactions are irreversible once validated on-chain.

```

### Advanced Discussion Points for Students:

* **The Power of Polymorphism:** Notice how `Main.java` declares every processor type variable as a generic `PaymentProcessor` (e.g., `PaymentProcessor visaWay = ...`). Even though Java sees them all as general processors on the outside, it correctly runs the highly specialized sub-formulas at execution time.
* **Strategic Re-use via `super`:** Point out that `CreditCardProcessor` uses `super.calculateTotalBill()`. It allows students to appreciate that overriding doesn't mean deleting parent work—it allows us to build cleanly on top of it.

---
package org.bytebloom.payment;

public class PaymentProcessor {
protected String gatewayName;
protected double baseTransactionFee; // Fixed flat fee in dollars

    public PaymentProcessor(String gatewayName, double baseTransactionFee) {
        this.gatewayName = gatewayName;
        this.baseTransactionFee = baseTransactionFee;
    }

    // Calculates total cost to charge the customer
    public double calculateTotalBill(double itemPrice) {
        return itemPrice + baseTransactionFee;
    }

    public void printReceipt(double itemPrice) {
        System.out.println("[" + gatewayName + " Receipt]");
        System.out.printf("Item Price: $%.2f\n", itemPrice);
        System.out.printf("Total Charged: $%.2f\n", calculateTotalBill(itemPrice));
    }
}


package org.bytebloom.payment;

public class CreditCardProcessor extends PaymentProcessor {
private double fraudInsuranceRate; // e.g., 0.02 for 2%

    public CreditCardProcessor(String gatewayName, double baseTransactionFee, double fraudInsuranceRate) {
        super(gatewayName, baseTransactionFee);
        this.fraudInsuranceRate = fraudInsuranceRate;
    }

    @Override
    public double calculateTotalBill(double itemPrice) {
        // Overridden logic: Adds a percentage-based fraud fee to the base billing structure
        double percentageFee = itemPrice * fraudInsuranceRate;
        return super.calculateTotalBill(itemPrice) + percentageFee;
    }
}

package org.bytebloom.payment;

public class CryptoProcessor extends PaymentProcessor {
private double networkCongestionMultiplier; // Simulates volatile blockchain gas/miner fees

    public CryptoProcessor(String gatewayName, double baseTransactionFee, double networkCongestionMultiplier) {
        super(gatewayName, baseTransactionFee);
        this.networkCongestionMultiplier = networkCongestionMultiplier;
    }

    @Override
    public double calculateTotalBill(double itemPrice) {
        // Overridden logic: Volatile network traffic scales the base transaction fee instead of item price
        double scaledGasFee = this.baseTransactionFee * networkCongestionMultiplier;
        return itemPrice + scaledGasFee;
    }

    @Override
    public void printReceipt(double itemPrice) {
        // Completely custom receipt override
        super.printReceipt(itemPrice);
        System.out.println("⚠️ Warning: Crypto transactions are irreversible once validated on-chain.");
    }
}