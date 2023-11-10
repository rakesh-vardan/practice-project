package com.learn.oops.inheritance;

public class Vehicle {

    String type;

    Vehicle(String type) {
        this.type = type;
    }

    void start() {
        System.out.println(type+ " is starting");
    }

    void stop() {
        System.out.println(type+ " is stopping");
    }

}
