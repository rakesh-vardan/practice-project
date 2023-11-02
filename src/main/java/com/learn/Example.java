package com.learn;

public class Example {

    //define and initialize the variables
    int a = 10;
    int b = 20;
    int c;

    public void add() {
        c = a + b;
        System.out.println("Sum is: " + c);
    }

    public void sub() {
        c = a - b;
        System.out.println("Difference is: " + c);
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.add();
        example.sub();
    }
}
