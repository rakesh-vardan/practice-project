package com.learn.oops.basics;

public class Human {

    String name;
    int age;

    //constructor (parameterized)
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void speak() {
        System.out.println(name+ " is speaking");
    }

    void run() {
        System.out.println(name+ " is running");
    }

    void walk() {
        System.out.println(name+ " is walking");
    }


    public String toString() {
        return "Human [name = "+name+", age = "+age+"]";
    }

    public static void main(String[] args) {
        Human h1 = new Human("Rakesh", 31);
        Human h2 = new Human("Raja", 30);

        System.out.println(h1);
        System.out.println(h2);

        System.out.println(h1.name);
        System.out.println(h1.age);

        System.out.println(h2.name);
        System.out.println(h2.age);
    }
}
