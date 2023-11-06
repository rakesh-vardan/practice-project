package com.learn.control_flow.looping;

public class ForExample {

    public static void main(String[] args) {

        for(int i=0; i <= 10; i++) {
            System.out.println(i);
        }

        String[] genders = {"male", "female", "other"};
        for (int i = 0; i < genders.length; i++) {
            System.out.println(genders[i]);
        }
    }
}
