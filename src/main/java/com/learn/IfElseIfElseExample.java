package com.learn;

public class IfElseIfElseExample {

    public static void main(String[] args) {
        /*
            Student marks:
            marks >= 90      --> grade A
            80 <= marks < 90 --> grade B
            70 <= marks < 80 --> grade C
            60 <= marks < 70 --> grade D
            marks < 60       --> grade E
         */

        int marks = 92;
        char grade;

        if(marks >= 90) {
            grade = 'A';
        } else if(marks < 90 && marks >= 80) {
            grade = 'B';
        } else if(marks < 80 && marks >= 70) {
            grade = 'C';
        } else if(marks < 70 && marks >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        System.out.println("Grade of the student is: " + grade);
    }
}
