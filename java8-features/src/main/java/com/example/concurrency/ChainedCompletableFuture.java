package com.example.concurrency;

import java.util.concurrent.CompletableFuture;

public class ChainedCompletableFuture {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetching User...");
            sleep(2000);
            return "User123";
        }).thenApply(user -> {
            System.out.println("Processing Order for " + user);
            sleep(1500);
            return "Order ID: 98765";
        }).thenAccept(order -> System.out.println("Order Processed: " + order));

        sleep(4000); // Wait for tasks to complete
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
