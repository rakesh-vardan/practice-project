package com.learn.oops.abstraction;

public class AbstractionDemo {

    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Calculate and print the area for both shapes
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        // Accessing a concrete method
        System.out.println("Circle Color: " + circle.getColor());
        System.out.println("Rectangle Color: " + rectangle.getColor());
    }
}
