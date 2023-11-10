package com.learn.oops.inheritance;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name+ " is barking");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks!");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Charlie");
        myDog.bark(); //from this class
        myDog.eat();  //from super/parent class
        myDog.makeSound();

        System.out.println(myDog.name);

        Animal myAnimal = new Dog("");
        myAnimal.makeSound();

    }
}
