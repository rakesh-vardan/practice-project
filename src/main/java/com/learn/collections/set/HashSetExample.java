package com.learn.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");
        hashSet.add("One");

        System.out.println(hashSet);

        for(String s : hashSet) {
            System.out.println(s);
        }
    }
}
