package com.learn.oops.basics;

public class Person {

    //data(attributes)
    String name;
    int age;

    //behavior(methods)
    void speak() {
        System.out.println(name+ " is speaking");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Rakesh";
        person.age = 31;
        person.speak();
    }
}
