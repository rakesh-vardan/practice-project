package com.learn.control_flow.looping;

import java.util.Scanner;

public class WhileExample2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting count-down number: ");
        int count = scanner.nextInt();

        if(count < 0) {
            System.out.println("Invalid input, please enter positive number.");
        } else {
            System.out.println("Count-down started!");
            while(count > 0) {
                System.out.println(count);
                count --;
            }

            System.out.println("Booooommmmm!!!!");
        }
        scanner.close();
    }
}
