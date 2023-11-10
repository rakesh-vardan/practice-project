package com.learn.oops.inheritance;

public class Car extends Vehicle {

    String brand;

    Car(String type, String brand) {
        super(type); //call the superclass constructor
        this.brand = brand;
    }

    @Override
    void start() {
        System.out.println("A brand " +brand+ " car is starting");
    }

    void accelerate() {
        System.out.println(brand+ " car is accelerating");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Car", "Toyota");

        myCar.start(); //calls the overridden start method from this class
        myCar.accelerate(); //calls the subclass method
        myCar.stop(); //calls the superclass method
    }

}
