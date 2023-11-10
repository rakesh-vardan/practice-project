package com.learn.oops.polymorphism;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    //method overloading
    public double add(double a, double b) {
        return a + b;
    }

    //method overloading
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Result-1: ");
        int r1 = calculator.add(1, 2); //3
        System.out.println(r1);

        System.out.println("Result-2: ");
        double r2 = calculator.add(3.5, 2.7); //6.2
        System.out.println(r2);

        System.out.println("Result-3: ");
        int r3 = calculator.add(3, 2, 1); //6
        System.out.println(r3);

        main();
    }

    public static void main() {
        System.out.println("Overloading the main method");
    }
}
