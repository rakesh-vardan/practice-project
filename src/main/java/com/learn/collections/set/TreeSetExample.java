package com.learn.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Raj");
        set.add("Ram");
        set.add("Raheem");
        set.add("Raj");

        System.out.println(set);

    }
}
