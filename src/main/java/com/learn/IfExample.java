package com.learn;

public class IfExample {

    public static void main(String[] args) {

        int num = 10;

        if(num > 0) {
            System.out.println("Inside if statement");
        }

        System.out.println("Statement outside if block");

        if(num > 20) {
            System.out.println("You will never reach me!!!");
        }
    }
}
