package org.bytebloom;

import java.util.ArrayList;

public class InventoryItem {

    private int id;
    private String itemName, category;
    private double price;

    private static int counter = 0;
    private static ArrayList<String> auditLog = new ArrayList<>();
    private static int totalItemsInSystem = 0;


    public InventoryItem(String itemName, double price, String category){
        totalItemsInSystem++;
        this.id = counter++;
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        auditLog.add("Item created with following details: " + itemName + " " + price + " " + category);
    }

    public InventoryItem(String itemName, double price){
        this(itemName, price, "Other");
    }


    public void setItemName(String itemName){
        String previousName = this.itemName;
        this.itemName = itemName;
        auditLog.add("Item name changed to: " + itemName + " privous name is: " + previousName);
    }

    public static ArrayList<String> getAuditLog(){
        return auditLog;
    }

    public static int getTotalItemsInSystem(){
        return totalItemsInSystem;
    }

}
