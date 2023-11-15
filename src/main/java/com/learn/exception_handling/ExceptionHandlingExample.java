package com.learn.exception_handling;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // This line will throw an ArithmeticException
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArithmeticException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b; // This code may throw an ArithmeticException
    }
}
