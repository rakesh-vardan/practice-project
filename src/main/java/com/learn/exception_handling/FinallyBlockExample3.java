package com.learn.exception_handling;

public class FinallyBlockExample3 {

    public static void main(String[] args) {

        try {
            //below code throw Arithmetic exception
            int data = 25 / 0;
            System.out.println(data);
        }

        //handles the Arithmetic type exception
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        //executed regardless of exception occurred or not
        finally {
            System.out.println("Finally block is always executed");
        }
        System.out.println("Rest of the code");
    }
}
