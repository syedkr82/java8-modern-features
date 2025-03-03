package com.example.lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        // Traditional Anonymous Class Implementation
        Greeting traditionalGreeting = new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello, " + name + " (Traditional)");
            }
        };
        traditionalGreeting.sayHello("Alice");

        // Lambda Expression Implementation
        Greeting lambdaGreeting = name -> System.out.println("Hello, " + name + " (Lambda)");
        lambdaGreeting.sayHello("Bob");
    }
}
