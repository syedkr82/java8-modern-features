package com.example.lambda;

import java.util.function.*;

public class MethodReferencesDemo {
    // Static Method
    public static void staticGreet(String name) {
        System.out.println("Hello, " + name);
    }

    // Instance Method
    public void instanceGreet(String name) {
        System.out.println("Hi, " + name);
    }

    public static void main(String[] args) {
        // 1️⃣ Static Method Reference
        Consumer<String> staticRef = MethodReferencesDemo::staticGreet;
        staticRef.accept("Alice");

        // 2️⃣ Instance Method Reference (Using Object)
        MethodReferencesDemo obj = new MethodReferencesDemo();
        Consumer<String> instanceRef = obj::instanceGreet;
        instanceRef.accept("Bob");

        // 3️⃣ Instance Method Reference (Using Arbitrary Object)
        Function<String, Integer> stringLength = String::length;
        System.out.println("Length of 'Java': " + stringLength.apply("Java"));

        // 4️⃣ Constructor Reference
        Supplier<MethodReferencesDemo> constructorRef = MethodReferencesDemo::new;
        MethodReferencesDemo newObj = constructorRef.get();
        newObj.instanceGreet("Charlie");
    }
}
