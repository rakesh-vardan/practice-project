package com.learn.keywords;

public class FinalExample {
    public static void main(String[] args) {
        final int constantValue = 10;
        // constantValue = 20; // This line would result in a compilation error

        final String message = "Hello, ";
        String name = "John";
        // message = "";
        String greeting = message + name;
        System.out.println(greeting); // Outputs: Hello, John
    }
}
