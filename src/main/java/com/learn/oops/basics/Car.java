package com.learn.oops.basics;

public class Car {

    String make;
    String model;

    void start() {
        //implementation to start the car
        System.out.println("Car "+make+" started");
    }

    void stop() {
        //implementation to stop the car
        System.out.println("Car "+make+" stopped");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Camry";

        car1.start();
        car1.stop();

        Car car2 = new Car();
        car2.make = "Ford";
        car2.model = "Mustang";

        car2.start();
        car2.stop();

    }
}
