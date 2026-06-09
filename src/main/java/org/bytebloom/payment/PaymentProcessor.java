package org.bytebloom.payment;

public abstract class PaymentProcessor {

    private double basicFee;
    protected double itemPrice;

    public PaymentProcessor(double basicFee, double itemPrice){
        this.basicFee = basicFee;
        this.itemPrice = itemPrice;
    }

    public double calculateTotalBill(){
        return basicFee + itemPrice;
    }

    public void printReceipt(){
        System.out.println("Basic fee: " + basicFee);
        System.out.println("Item price: " + itemPrice);
        System.out.println("Total bill: " + calculateTotalBill());
    }

}
