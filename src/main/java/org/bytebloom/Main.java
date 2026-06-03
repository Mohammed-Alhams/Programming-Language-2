package org.bytebloom;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        new InventoryItem("Apple", 1.99, "Fruit");
        new InventoryItem("Orange", 1.50, "Fruit");
        new InventoryItem("Banana", 1.25, "Fruit");
        InventoryItem item = new InventoryItem("Pear", 1.75, "Fruit");
        item.setItemName("Pineapple");
        new InventoryItem("Tomato", 15.0);

        ArrayList<String> logs = InventoryItem.getAuditLog();

        for (String logRecord : logs) {
            System.out.println(logRecord);
        }

        System.out.println("Total items in system: " + InventoryItem.getTotalItemsInSystem());
    }

}