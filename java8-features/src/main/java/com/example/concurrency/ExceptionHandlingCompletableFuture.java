package com.example.concurrency;

import java.util.concurrent.CompletableFuture;

public class ExceptionHandlingCompletableFuture {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            sleep(2000);
            if (true) throw new RuntimeException("Something went wrong!");
            return "Success!";
        }).exceptionally(ex -> {
            System.out.println("Handled Exception: " + ex.getMessage());
            return "Fallback Result";
        }).thenAccept(System.out::println);

        sleep(3000); // Wait for async task
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
