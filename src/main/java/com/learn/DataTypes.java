package com.learn;

public class DataTypes {

    public static void main(String[] args) {
        /**
         * boolean:
         *  - used to store only 2 possible values --> true/false
         *  - size is 1 bit
         */
        boolean flag = true;
        boolean flag2 = false;

        System.out.println(flag);
        System.out.println(flag2);

        /**
         * byte:
         *  -> 8-bit signed 2's complement integer
         *  -> can hold values from -128 (-2^7) to 127 (2^7 -1)
         *  -> default value is 0
         */
        byte value = 10;
        byte value1 = 20;

        System.out.println(value);
        System.out.println(value1);

        /**
         * short:
         *  -> 16-bit signed 2's complement integer
         *  -> can hold values from -32768 (-2^15) to 32767 (2^15 - 1)
         *  -> default value is 0
         */
        short shortVariable1 = 32767;
        short shortVariable2 = -32768;

        System.out.println(shortVariable1);
        System.out.println(shortVariable2);

        /**
         * int:
         *  -> 32-bit signed 2's complement integer
         *  -> can hold values from (-2^31)-2147483648 to (2^31 - 1)2147483647
         *  -> default value is 0
         */
        int intVariable1 = 2147483647;
        int intVariable2 = -2147483648;

        System.out.println(intVariable1);
        System.out.println(intVariable2);

        /**
         * long:
         *  -> 64-bit signed 2's complement integer
         *  -> can hold values from (-2^63)-9223372036854775808 to (2^63 - 1)9223372036854775807
         *  -> default value is 0L
         */
        long longVariable1 = 9223372036854775807L;
        long longVariable2 = -9223372036854775808L;

        System.out.println(longVariable1);
        System.out.println(longVariable2);

        /**
         * float:
         *  -> 32-bit single precision floating point
         *  -> it's range is unlimited
         *  -> default value is 0.0f
         */
        float floatVariable1 = 232.4f;
        float floatVariable2 = 100.0f;

        System.out.println(floatVariable1);
        System.out.println(floatVariable2);

        /**
         * double:
         *  -> 64-bit single precision floating point
         *  -> it's range is unlimited
         *  -> default value is 0.0d
         */
        double doubleVariable1 = 12533632.3d;
        double doubleVariable2 = 10453.453d;

        System.out.println(doubleVariable1);
        System.out.println(doubleVariable2);

        /**
         * char:
         *  -> 16-bit (2 byte) unicode character
         *  -> it's range is from '\u0000' (0) to '\uffff' (65535)
         *  -> used to store characters
         */
        char charVariable1 = 'a';
        char charVariable2 = 'A';

        System.out.println(charVariable1);
        System.out.println(charVariable2);

        int age = 20;
        float weight = 150.5f;
        double height = 6.0;
        char gender = 'M';
        boolean isMarried = true;

        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Gender: " + gender);
        System.out.println("Is Married: " + isMarried);
    }
}
