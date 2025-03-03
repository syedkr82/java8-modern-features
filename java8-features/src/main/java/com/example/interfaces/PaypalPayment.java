package com.example.interfaces;

public class PaypalPayment implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }

    // Overriding the default method
    @Override
    public void showPaymentStatus() {
        System.out.println("PayPal Payment: Transaction successful!");
    }
}
