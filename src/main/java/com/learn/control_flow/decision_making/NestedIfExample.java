package com.learn.control_flow.decision_making;

import java.util.Scanner;

public class NestedIfExample {

    public static void main(String[] args) {

        //ask user for age
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");

        //read the user input and store in a variable
        int age = scanner.nextInt();



        //build logic based on the condition
        if(age > 18) {
            //eligible to vote
            //ask the user if they are a citizen of this country?
            System.out.println("Are you a citizen (yes/no)? ");

            //read the input and store in a variable
            String isCitizen = scanner.next();
            if(isCitizen.equalsIgnoreCase("yes")) {
                System.out.println("Hurray! You are eligible to vote!");
            } else {
                System.out.println("Sorry, only citizens are allowed to vote :(");
            }

        } else {
            //not eligible to vote
            System.out.println("Sorry, you are not allowed to vote!");
        }
        scanner.close();
    }
}
