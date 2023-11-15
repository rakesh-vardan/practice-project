package com.learn.exception_handling;

public class MultipleExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // This line will throw an ArithmeticException
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b; // This code may throw an ArithmeticException
    }
}