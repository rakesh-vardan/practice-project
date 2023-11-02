package com.learn;

public class Operators {

    public static void main(String[] args) {

        //Operators are symbols that perform operations on variables and values

        /*
          Arithmetic Operators:
          1. addition (+)
          2. subtraction (-)
          3. multiplication (*)
          4. division (/)
          5. modulus (%)
          --> used to perform arithmetic operations
              on variables & data
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

        /*
          Relational Operators:
          1. Equal To (==)
          2. Not Equal To (!=)
          3. Greater Than (>)
          4. Less Than (<)
          5. Greater Than Equal To (>=)
          6. Less Than Equal To (<=)
          --> used in decision-making and loops
         */
        System.out.println("Is i == j ? " + (i == j)); //false
        System.out.println("Is i != j ? " + (i != j)); //true
        System.out.println("Is i > j ? " + (i > j));   //true
        System.out.println("Is i < j ? " + (i < j));   //false
        System.out.println("Is i >= j ? " + (i >= j)); //true
        System.out.println("Is i <= j ? " + (i <= j)); //false

        /*
          Assignment Operators:
           1. =
           2. +=
           3. -=
           4. *=
           5. /=
           6. %=
           --> used to assign values to variables
         */
        int a = 10;
        int b = 4;
        System.out.println("Value of a: " + a);
        System.out.println("Value of a+=b is: " + (a+=b)); //a = a + b

        a = 10;
        System.out.println("Value of a-=b is: " + (a-=b)); //a = a - b

        a = 10;
        System.out.println("Value of a*=b is: " + (a*=b)); //a = a * b

        a = 10;
        System.out.println("Value of a/=b is: " + (a/=b)); //a = a / b

        a = 10;
        System.out.println("Value of a%=b is: " + (a%=b)); //a = a % b


        /*
          Logical Operators:
          1. Logical AND (&&)
          2. Logical OR (||)
          3. Logical NOT (!)
         */
        System.out.println( 5 > 3 && 5 > 2); // true AND true --> true
        System.out.println( 3 > 8 && 5 > 1); // false AND true --> false

        System.out.println( 5 > 3 || 5 > 2); // true OR true --> true
        System.out.println( 3 > 8 || 5 > 1); // false OR true --> true

        System.out.println(!(3 > 8)); //true

        /*
          Unary, Increment & Decrement Operators:
          1. Unary Plus (+)
          2. Unary Minus (-)
          3. Increment (++)
          4. Decrement (--)
         */

        System.out.println( +2 + +3 ); //5
        System.out.println( +2 + -3 ); //-1

        int num = 2;
        System.out.println(num++); //2 num++ means num + 1
        System.out.println(num); //3

        System.out.println(num--); //3 num-- means num - 1
        System.out.println(num); //2

        /*
          Bitwise Operators:
          - used to perform operations on individual bits
          1. Bitwise complement (~)
          2. Left shift (<<)
          3. Right shift (>>)
          4. Unsigned right shift (>>>)
          5. Bitwise AND (&)
          6. Bitwise OR (|)
          6. Bitwise Exclusive OR (^)
          https://www.programiz.com/java-programming/bitwise-operators
         */

        /*
          InstanceOf operator:
          - used to check if the given object is instance of a
            particular class or not
         */
        String name = "Hello";
        System.out.println(name instanceof String); //true

        Operators operators = new Operators();
        boolean isSame = operators instanceof Operators;
        System.out.println(isSame);//true

        /*
          Ternary Operator:
          - can be used instead of an if/else statement
         */
        int marks = 40;
        String output = (marks > 35) ? "PASS": "FAIL";
        System.out.println(output);


        // Operator Precedence
        int myInt = 12 - 4 * 2; //BODMAS
        System.out.println(myInt);

    }
}
