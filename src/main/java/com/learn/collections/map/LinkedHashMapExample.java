package com.learn.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> fruitMap =new LinkedHashMap<>();
        fruitMap.put(1,"Mango");
        fruitMap.put(3,"Apple");
        fruitMap.put(2,"Banana");
        fruitMap.put(4,"Grapes");

        System.out.println("Iterating LinkedHashmap");
        for(Map.Entry<Integer,String> m : fruitMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        fruitMap.putIfAbsent(4, "Grapes"); //won't add any element
        fruitMap.putIfAbsent(5, "Dates"); //adds a new element
        System.out.println(fruitMap);

        //removing element based on key
        fruitMap.remove(3);
        System.out.println(fruitMap);

        //removing element based on key & value
        fruitMap.remove(2, "Banana");
        System.out.println(fruitMap);

    }
}
