package org.bytebloom.product;


public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting Product Demo ---\n");

        // 1. Create products using the Name & Price constructor
        Product prod1 = new Product("Wireless Mouse", 29.99);
        Product prod2 = new Product("Mechanical Keyboard", 89.99);

        // 2. Create a product using the Price, Quantity, & Description constructor
        Product prod3 = new Product(499.99, 15, "4K Gaming Monitor");

        // 3. Display individual product IDs to verify auto-incrementation
        System.out.println("Product 1 Details:");
        System.out.println(" - Name: Wireless Mouse");
        System.out.println(" - Assigned ID: " + prod1.getTotalProductsCount()); // Note: In a full app, you'd use a getter like prod1.getId()

        System.out.println("\nProduct 2 Details:");
        System.out.println(" - Name: Mechanical Keyboard");

        System.out.println("\nProduct 3 Details:");
        System.out.println(" - Description: 4K Gaming Monitor");

        System.out.println("\n-----------------------------------");

        // 4. Verify the global tracking counter
        System.out.println("Total Products Created: " + Product.getTotalProductsCount());
    }
}