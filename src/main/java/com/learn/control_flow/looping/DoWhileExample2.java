package com.learn.control_flow.looping;

import java.util.Scanner;

public class DoWhileExample2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = 32;
        int userGuess;
        boolean isGuessCorrect = false;

        System.out.println("Welcome to Number Guessing Game!");

        do {
            userGuess = scanner.nextInt();

            if(userGuess == secretNumber) {
                System.out.println("Congratulations! you guessed the number correctly");
                isGuessCorrect = true;
            } else {
                System.out.println("Sorry, your guess is incorrect. Play again!");
            }
        } while(!isGuessCorrect);
        scanner.close();
    }
}
