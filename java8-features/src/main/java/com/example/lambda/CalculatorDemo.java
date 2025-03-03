package com.example.lambda;

public class CalculatorDemo {
    public static void main(String[] args) {
        // Lambda for addition
        Calculator add = (a, b) -> a + b;
        System.out.println("Addition: " + add.operate(10, 5));

        // Lambda for multiplication
        Calculator multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiply.operate(10, 5));
    }
}
