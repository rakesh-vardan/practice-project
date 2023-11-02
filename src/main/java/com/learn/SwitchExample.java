package com.learn;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        //ask the user to choose any value from 1-7
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1-7 to find the day of the week.");

        //read the user input and store to a variable
        int dayNumber = scanner.nextInt();

        //implement the logic to identify the day using switch

        /*
            logic:
            dayNumber == 1 --> Monday
            dayNumber == 2 --> Tuesday
            dayNumber == 3 --> Wednesday
            dayNumber == 4 --> Thursday
            dayNumber == 5 --> Friday
            dayNumber == 6 --> Saturday
            dayNumber == 7 --> Sunday
         */

        String day;

        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;

            case 2:
                day = "Tuesday";
                break;

            case 3:
                day = "Wednesday";
                break;

            case 4:
                day = "Thursday";
                break;

            case 5:
                day = "Friday";
                break;

            case 6:
                day = "Saturday";
                break;

            case 7:
                day = "Sunday";
                break;

            default:
                day = "Invalid input!, enter any number between 1 to 7 only";
                break;
        }
        System.out.println("The day of the week is: " + day);
        scanner.close();
    }
}
