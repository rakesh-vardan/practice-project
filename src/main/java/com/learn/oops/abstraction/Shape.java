package com.learn.oops.abstraction;

abstract class Shape {

    String color;

    public Shape(String color) {
        this.color = color;
    }

    //abstract method that needs implementation by child classes
    public abstract double calculateArea();

    //concrete method
    public String getColor() {
        return  color;
    }

}
