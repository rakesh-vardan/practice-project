package com.learn.oops.encapsulation;

public class Demo {

        public static void main(String[] args) {
            Student student1 = new Student();

            // Using setter methods to set values
            student1.setName("Alice");
            student1.setAge(25);

            // Using getter methods to retrieve values
            System.out.println("Name: " + student1.getName());
            System.out.println("Age: " + student1.getAge());

            // Attempting to set an invalid age
            student1.setAge(150);  // Outputs "Invalid age."
        }
}
