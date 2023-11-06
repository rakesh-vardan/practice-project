package com.learn.control_flow.looping;

public class NestedForExample {
    public static void main(String[] args) {

        int table = 10;

        for (int i = 1; i <= table; i++) {
            for (int j = 1; j <= table; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
