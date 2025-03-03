package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AdvancedStreamsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 10, 20, 5, 30, 40, 25, 50);

        // 1️⃣ DISTINCT - Remove duplicates
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct Numbers: " + distinctNumbers); // [5, 10, 15, 20, 30, 40, 25, 50]

        // 2️⃣ SORTED - Sort numbers in ascending and descending order
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Numbers (Ascending): " + sortedNumbers);

        List<Integer> reverseSortedNumbers = numbers.stream()
                .sorted((a, b) -> b - a) // Custom comparator
                .collect(Collectors.toList());
        System.out.println("Sorted Numbers (Descending): " + reverseSortedNumbers);

        // 3️⃣ REDUCE - Sum of all numbers
        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println("Sum of Numbers: " + sum.orElse(0)); // 210

        // 4️⃣ REDUCE - Find max number
        Optional<Integer> maxNumber = numbers.stream()
                .reduce(Integer::max);
        System.out.println("Max Number: " + maxNumber.orElse(-1)); // 50

        // 5️⃣ PARALLEL STREAM - Process numbers in parallel
        List<Integer> squaredNumbersParallel = numbers.parallelStream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println("Squared Numbers (Parallel Processing): " + squaredNumbersParallel);
    }
}
