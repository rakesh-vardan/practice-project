package com.learn.exception_handling;

public class FinallyBlockExample2 {

    public static void main(String[] args) {

        try {
            //below code throw Arithmetic exception
            int data = 25 / 0;
            System.out.println(data);
        }

        //cannot handle Arithmetic type exception
        //can only accept Null Pointer type exception
        catch (NullPointerException e) {
            System.out.println(e);
        }
        //executed regardless of exception occurred or not
        finally {
            System.out.println("Finally block is always executed");
        }
        System.out.println("Rest of the code");
    }
}
