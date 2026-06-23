package com.cognizant.strategy;

public class StrategyTest {

    public static void main(String[] args) {

        PaymentContext creditCard = new PaymentContext(new CreditCardPayment());
        creditCard.makePayment(5000);

        PaymentContext paypal = new PaymentContext(new PayPalPayment());
        paypal.makePayment(2500);

    }

}