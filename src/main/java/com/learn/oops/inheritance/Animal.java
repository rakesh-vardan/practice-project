package com.learn.oops.inheritance;

public class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name+ " is eating");
    }

    //method overriding
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
