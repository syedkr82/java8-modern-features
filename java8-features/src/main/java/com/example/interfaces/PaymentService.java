package com.example.interfaces;

public interface PaymentService {
    void processPayment(double amount);

    default void showPaymentStatus() {
        System.out.println("Payment processing...");
    }

    // Static method in interface
    static boolean validatePayment(double amount) {
        return amount > 0;
    }
}
