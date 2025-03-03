package com.example.concurrency;

import java.util.concurrent.CompletableFuture;

public class CombinedCompletableFuture {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            sleep(2000);
            return "Product Data";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            sleep(1500);
            return "Pricing Data";
        });

        // Combine results from two futures
        CompletableFuture<String> combined = future1.thenCombine(future2, (product, price) ->
                "Combined Result: " + product + " + " + price);

        combined.thenAccept(System.out::println);

        sleep(3000); // Wait for async tasks
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
