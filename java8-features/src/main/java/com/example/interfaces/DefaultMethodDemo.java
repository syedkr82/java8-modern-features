package com.example.interfaces;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        PaymentService creditCard = new CreditCardPayment();
        creditCard.processPayment(100);
        creditCard.showPaymentStatus();

        PaymentService paypal = new PaypalPayment();
        paypal.processPayment(150);
        paypal.showPaymentStatus();

        // Using Static Method
        boolean isValid = PaymentService.validatePayment(200);
        System.out.println("Is payment valid? " + isValid);
    }
}
