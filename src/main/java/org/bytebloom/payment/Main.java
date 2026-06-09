package org.bytebloom.payment;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting Payment Demo ---\n");

        CryptoProcessor cryptoProcessor = new CryptoProcessor(10.00, 100.00, 1.50);

        CreditCardProcessor creditCardProcessor = new CreditCardProcessor(10.00, 100.00, 0.15);

        ArrayList<PaymentProcessor> paymentProcessors = new ArrayList<>();

        paymentProcessors.add(cryptoProcessor);
        paymentProcessors.add(creditCardProcessor);

        for (PaymentProcessor processor : paymentProcessors) {
            processor.printReceipt();
            System.out.println("---------------");
        }

    }
}