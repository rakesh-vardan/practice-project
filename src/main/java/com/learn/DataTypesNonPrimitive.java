package com.learn;

public class DataTypesNonPrimitive {

    public static void main(String[] args) {

        /**
         * String:
         *  - is an object that represents a sequence of characters
         *  - 2 ways to create
         *      1. by string literal
         *      2. by new keyword
         *  - string constant pool (special memory area)
         *  -
         *
         */
        String name = "Rakesh Vardan";
        System.out.println(name);

        String str = new String("something");
        System.out.println(str);

        System.out.println(name.substring(5));

        /**
         * Array:
         *  - is a data type which stores multiple homogeneous variables
         *  -
         *
         */
//        int[] marks;
        int[] marks = {34, 50, 40, 98, 4};
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        /**
         * Class:
         *  - user defined data type created by the user/developer
         *  - acts as a template to the data which consists of member variables & methods
         */

        /**
         * Object:
         *  - is a variable/instance of the class
         *  - using this we can access the variables & methods in a class
         */

        /**
         * Interface:
         *  - is a blue-print/contract of a class
         *  - consists of static constants and abstract methods
         */
    }
}
