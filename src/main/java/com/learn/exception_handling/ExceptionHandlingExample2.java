package com.learn.exception_handling;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {
        try {
            int[] arr= {1,3,5,7};
            System.out.println(arr[10]); //may throw exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
        System.out.println("Rest of the code");
    }
}
