package com.learn;

import java.util.Arrays;

public class DataTypesNonPrimitive {

    public static void main(String[] args) {

        /*
          String:
           - is an object that represents a sequence of characters
           - 2 ways to create
               1. by string literal
               2. by new keyword
           - string constant pool (special memory area)
           - many useful methods are available on strings
         */
        String name = "Rakesh Vardan";
        System.out.println(name);

        String str = new String("something");
        System.out.println(str);

        System.out.println(name.substring(5));

        /*
          Array:
           - is a data type (object) which stores multiple homogeneous variables
           - collection of similar type of elements which has contiguous memory location
           - can store only fixed set of elements
           - index based, can access the elements based on index
           - first element is at index 0, second element is at 1, and so on.
           - can be single dimensional & multidimensional
         */

        //all these are valid array declarations
        int[] marks1;
        int marks2[];
        int []marks3;

        int numbers[] = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;

        System.out.println(Arrays.toString(numbers));

        int[] marks = {34, 50, 40, 98, 4};
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        String[] genders = {"male", "female", "other"};
        System.out.println(Arrays.toString(genders));

        /*
          Class:
           - user defined data type created by the user/developer
           - is a blueprint or template for creating objects
           - can have fields (variables) and methods (functions) that describe the attributes and
             behavior of objects created from class.
         */

        /*
          Object:
           - is a variable/instance of the class
           - using this we can access the variables & methods in a class
           - can create multiple objects from the same class, each with its own set of data and characteristics.
         */

        /*
          Interface:
           - is a contract for classes that implement it
           - consists of static constants and abstract methods
           - used to achieve abstraction
         */
    }
}
