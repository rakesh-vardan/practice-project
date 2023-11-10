package com.learn.oops.polymorphism;

public class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car is starting");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();

        Vehicle car1 = new Car();
        car1.start();
    }
}
