package com.example.lambda;

import java.util.function.*;

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {

        // 1️⃣ Predicate<T> - Checks if a number is even
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));  // true
        System.out.println("Is 15 even? " + isEven.test(15));  // false

        // 2️⃣ Function<T, R> - Converts string to uppercase
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        System.out.println("hello -> " + toUpperCase.apply("hello"));  // "HELLO"

        // 3️⃣ Consumer<T> - Prints a message (side-effect function)
        Consumer<String> printMessage = msg -> System.out.println("Message: " + msg);
        printMessage.accept("Java 8 is awesome!");

        // 4️⃣ Supplier<T> - Supplies a default value (random number)
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random Number: " + randomSupplier.get());

        // 5️⃣ UnaryOperator<T> - Modifies a value (square of a number)
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));  // 25

        // 6️⃣ BinaryOperator<T> - Performs an operation on two values (addition)
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("10 + 20 = " + add.apply(10, 20));  // 30
    }
}
