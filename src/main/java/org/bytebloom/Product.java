package org.bytebloom;

public class Product {

    private static int counter = 0;

    private int id;
    private String name, description;
    private double price;
    private int quantity;


    public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.id = counter;
        counter++;
    }

    public Product(double price, int quantity, String description){
        this.id = counter;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        counter++;
    }

    public static int getTotalProductsCount(){
        return counter;
    }

}
