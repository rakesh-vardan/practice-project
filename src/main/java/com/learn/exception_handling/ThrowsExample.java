package com.learn.exception_handling;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrowsExample {

    // Method that declares it might throw ParseException
    static Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.parse(dateString);
    }

    public static void main(String[] args) {
        try {
            String dateString = "2023-11-15";
            Date parsedDate = parseDate(dateString);
            System.out.println("Parsed Date: " + parsedDate);
        } catch (ParseException e) {
            System.out.println("ParseException: " + e.getMessage());
        }

    }
}
