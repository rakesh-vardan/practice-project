package com.learn;

import java.util.Scanner;

public class SwitchExample2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a three-letter month abbreviation: ");
        String monthAbbreviation = scanner.next();
        String fullMonthName;

        switch (monthAbbreviation.toLowerCase()) {
            case "jan":
                fullMonthName = "January";
                break;
            case "feb":
                fullMonthName = "February";
                break;
            case "mar":
                fullMonthName = "March";
                break;
            case "apr":
                fullMonthName = "April";
                break;
            case "may":
                fullMonthName = "May";
                break;
            case "jun":
                fullMonthName = "June";
                break;
            case "jul":
                fullMonthName = "July";
                break;
            case "aug":
                fullMonthName = "August";
                break;
            case "sep":
                fullMonthName = "September";
                break;
            case "oct":
                fullMonthName = "October";
                break;
            case "nov":
                fullMonthName = "November";
                break;
            case "dec":
                fullMonthName = "December";
                break;
            default:
                fullMonthName = "Invalid abbreviation. Please enter a valid three-letter month abbreviation.";
                break;
        }

        System.out.println("The full month name is " + fullMonthName);
        scanner.close();
    }
}
