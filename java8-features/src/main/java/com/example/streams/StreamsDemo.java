package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        // Sample List of Numbers
        List<Integer> numbers = Arrays.asList(10, 20, 15, 40, 5, 50);

        // 1️⃣ FILTER - Get even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers); // [10, 20, 40, 50]

        // 2️⃣ MAP - Square each number
        List<Integer> squaredNumbers = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println("Squared Numbers: " + squaredNumbers); // [100, 400, 225, 1600, 25, 2500]

        // 3️⃣ COLLECT - Convert list to comma-separated string
        String numberString = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println("Comma-separated Numbers: " + numberString); // "10, 20, 15, 40, 5, 50"

        // Sample List of Names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // 4️⃣ FILTER + MAP - Convert names to uppercase if length > 3
        List<String> uppercaseNames = names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase Names: " + uppercaseNames); // [ALICE, CHARLIE, DAVID]
    }
}
