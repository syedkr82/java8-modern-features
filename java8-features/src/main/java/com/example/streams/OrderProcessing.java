package com.example.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrderProcessing {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(101, "Alice", 250.5, "COMPLETED"),
                new Order(102, "Bob", 300.0, "PENDING"),
                new Order(103, "Charlie", 150.75, "COMPLETED"),
                new Order(104, "David", 500.0, "CANCELLED"),
                new Order(105, "Eve", 700.25, "COMPLETED"),
                new Order(106, "Frank", 400.0, "PENDING")
        );

        // 1️⃣ FILTER - Get all COMPLETED orders
        List<Order> completedOrders = orders.stream()
                .filter(order -> order.getStatus().equals("COMPLETED"))
                .collect(Collectors.toList());
        System.out.println("Completed Orders: " + completedOrders);

        // 2️⃣ MAP - Extract customer names from completed orders
        List<String> completedCustomers = completedOrders.stream()
                .map(Order::getCustomerName)
                .collect(Collectors.toList());
        System.out.println("Customers with Completed Orders: " + completedCustomers);

        // 3️⃣ REDUCE - Calculate total revenue from completed orders
        double totalRevenue = completedOrders.stream()
                .map(Order::getAmount)
                .reduce(0.0, Double::sum);
        System.out.println("Total Revenue from Completed Orders: $" + totalRevenue);

        // 4️⃣ SORT - Sort orders by amount (Ascending)
        List<Order> sortedOrders = orders.stream()
                .sorted(Comparator.comparingDouble(Order::getAmount))
                .collect(Collectors.toList());
        System.out.println("Sorted Orders by Amount: " + sortedOrders);

        // 5️⃣ GROUP BY - Count orders by status
        Map<String, Long> orderCountByStatus = orders.stream()
                .collect(Collectors.groupingBy(Order::getStatus, Collectors.counting()));
        System.out.println("Order Count by Status: " + orderCountByStatus);
    }
}
