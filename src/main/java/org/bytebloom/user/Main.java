package org.bytebloom.user;

import org.bytebloom.inventory.InventoryItem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting User Registration Demo ---\n");

        // 1. Instantiate via minimal registration (Email only)
        System.out.println(">> Creating User 1 (Email Only)...");
        User user1 = new User("alice@bytebloom.org");
        System.out.println("User 1 ID: " + user1.getId());
        System.out.println("User 1 Readout -> " + user1.getEmail());

        System.out.println("\n--------------------------------------------------");

        // 2. Instantiate via phone & password only
        System.out.println(">> Creating User 2 (Phone & Password)...");
        User user2 = new User("+1-555-0199", "securePass123");
        System.out.println("User 2 ID: " + user2.getId());

        System.out.println("\n--------------------------------------------------");

        // 3. Instantiate via Chained Core Profile (4-parameter constructor)
        System.out.println(">> Creating User 3 (Full Profile - Triggers Chaining)...");
        // Passing valid details according to rules (Assuming validation logic fix applied)
        User user3 = new User("+1-555-9876", "passwordX", "bobTheCoder", "bob@bytebloom.org");
        System.out.println("User 3 ID: " + user3.getId());
        System.out.println("User 3 Readout -> " + user3.getEmail());
        System.out.println("User 3 Username: " + user3.getUsername());

        System.out.println("\n--------------------------------------------------");

        // 4. Checking Global Tracking
        System.out.println("Total Users Attempted/Registered in System: " + User.getTotalUser());
    }
}