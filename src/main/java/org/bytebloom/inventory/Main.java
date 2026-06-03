package org.bytebloom.inventory;


public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting Inventory Item Demo ---\n");

        // 1. Creating an item using the full 3-parameter constructor
        InventoryItem item1 = new InventoryItem("Gaming Laptop", 1299.99, "Electronics");

        // 2. Creating an item using the 2-parameter constructor (Demonstrating Constructor Chaining)
        InventoryItem item2 = new InventoryItem("Office Chair", 150.00);

        System.out.println(">> Created 2 initial items.\n");

        // 3. Mutating state (Demonstrating state tracking in setters)
        System.out.println(">> Updating item 1 name...");
        item1.setItemName("Pro Gaming Laptop");

        System.out.println(">> Updating item 1 name again...");
        item1.setItemName("Pro Gaming Laptop v2");

        System.out.println("\n--------------------------------------------------");
        System.out.println("SYSTEM STATS & AUDIT LOG");
        System.out.println("--------------------------------------------------");

        // 4. Display total items tracked in system
        System.out.println("Total Items Tracked: " + InventoryItem.getTotalItemsInSystem());
        System.out.println("\nGlobal Audit Log History:");

        // 5. Print the global audit trail
        int logIndex = 1;
        for (String logEntry : InventoryItem.getAuditLog()) {
            System.out.println(logIndex + ". " + logEntry);
            logIndex++;
        }
    }
}