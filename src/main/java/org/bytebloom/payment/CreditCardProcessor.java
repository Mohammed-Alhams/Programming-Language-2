package org.bytebloom.payment;

public class CreditCardProcessor extends PaymentProcessor {

    private double taxRate;

    public CreditCardProcessor(double basicFee, double itemPrice, double taxRate){
        super(basicFee, itemPrice);
        this.taxRate = taxRate;
    }

    @Override
    public double calculateTotalBill(){
        return taxRate * super.itemPrice + super.itemPrice;
    }

}
