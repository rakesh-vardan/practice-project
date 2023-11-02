package com.learn;

public class Operators {

    public static void main(String[] args) {

        /**
         * Arithmetic Operators:
         * 1. addition (+)
         * 2. subtraction (-)
         * 3. multiplication (*)
         * 4. division (/)
         * 5. modulus (%)
         * --> used to perform arithmetic operations
         *     on variables & data
         */

        int i = 10;
        int j = 5;

        int sum = i + j; //addition
        System.out.println("i + j = " + sum);

        int difference = i - j; //subtraction
        System.out.println("i - j = " + difference);

        int multiplication = i * j; //multiplication
        System.out.println("i * j = " + multiplication);

        int division = i / j; //division
        System.out.println("i / j = " + division);

        int remainder = i % j; //remainder
        System.out.println("i % j = " + remainder);

        /**
         * Relational Operators:
         * 1. Equal To (==)
         * 2. Not Equal To (!=)
         * 3. Greater Than (>)
         * 4. Less Than (<)
         * 5. Greater Than Equal To (>=)
         * 6. Less Than Equal To (<=)
         * --> used in decision-making and loops
         */
        System.out.println("Is i == j ? " + (i == j)); //false
        System.out.println("Is i != j ? " + (i != j)); //true
        System.out.println("Is i > j ? " + (i > j));   //true
        System.out.println("Is i < j ? " + (i < j));   //false
        System.out.println("Is i >= j ? " + (i >= j)); //true
        System.out.println("Is i <= j ? " + (i <= j)); //false

        /**
         * Assignment Operators:
         *  1. =
         *  2. +=
         *  3. -=
         *  4. *=
         *  5. /=
         *  6. %=
         *  --> used to assign values to variables
         */
        int a = 10;
        System.out.println(a);
        System.out.println();


        /**
         * Logical Operators:
         * 1. Logical AND (&&)
         * 2. Logical OR (||)
         * 3. Logical NOT (!)
         */

        /**
         * Unary, Increment & Decrement Operators:
         * 1. Unary Plus (+)
         * 2. Unary Minus (-)
         * 3. Increment (++)
         * 4. Decrement (--)
         */

        /**
         * Bitwise Operators:
         * 1. Bitwise complement (~)
         * 2. Left shift (<<)
         * 3. Right shift (>>)
         * 4. Unsigned right shift (>>>)
         * 5. Bitwise AND (&)
         * 6. Bitwise Exclusive OR (^)
         */

        /**
         * InstanceOf operator:
         */

        /**
         * Ternary Operator:
         */

        // Operator Precedence

    }
}
