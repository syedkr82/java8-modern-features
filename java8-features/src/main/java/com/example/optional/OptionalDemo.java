package com.example.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        // 1️⃣ of() - Create an Optional with a non-null value
        Optional<String> nonEmptyOptional = Optional.of("Java 8");
        System.out.println("Value in Optional: " + nonEmptyOptional.get()); // Java 8

        // 2️⃣ ofNullable() - Create Optional that may hold a null value
        Optional<String> nullableOptional = Optional.ofNullable(null);
        System.out.println("Nullable Optional is present? " + nullableOptional.isPresent()); // false

        // 3️⃣ empty() - Create an empty Optional
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Empty Optional is present? " + emptyOptional.isPresent()); // false

        // 4️⃣ ifPresent() - Execute an action if value exists
        nonEmptyOptional.ifPresent(value -> System.out.println("Uppercase: " + value.toUpperCase()));

        // 5️⃣ orElse() - Provide a default value if empty
        String result = nullableOptional.orElse("Default Value");
        System.out.println("Result using orElse: " + result); // Default Value

        // 6️⃣ orElseGet() - Provide a computed default value
        String computedResult = nullableOptional.orElseGet(() -> "Computed Default");
        System.out.println("Result using orElseGet: " + computedResult); // Computed Default

        // 7️⃣ orElseThrow() - Throw an exception if empty
        try {
            String errorResult = emptyOptional.orElseThrow(() -> new IllegalArgumentException("No value found"));
            System.out.println(errorResult);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage()); // No value found
        }
    }
}
