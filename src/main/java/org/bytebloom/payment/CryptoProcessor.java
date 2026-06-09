package org.bytebloom.payment;

public class CryptoProcessor extends PaymentProcessor{

    private double basicCryptoFee;

    public CryptoProcessor(double basicFee, double itemPrice, double basicCryptoFee){
        super(basicFee, itemPrice);
        this.basicCryptoFee = basicCryptoFee;
    }

    @Override
    public double calculateTotalBill(){
        return basicCryptoFee + super.itemPrice;
    }

}
