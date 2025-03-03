package com.example.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class BasicCompletableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1️⃣ Asynchronous Task
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            sleep(2000); // Simulate delay
            return "Hello from CompletableFuture!";
        });

        // 2️⃣ Non-blocking thenAccept() - Runs after future completes
        future.thenAccept(result -> System.out.println("Result: " + result));

        // 3️⃣ Block and get result (not recommended for async processing)
        String value = future.get();
        System.out.println("Blocking Get: " + value);
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
