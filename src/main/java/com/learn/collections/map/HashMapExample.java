package com.learn.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        //adding elements
        map.put(100, "Raj");
        map.put(101, "Ram");
        map.put(102, "Raheem");
        map.put(102, "Raheem1");

        System.out.println(map);

        //getting element value based on key
        System.out.println(map.get(100));

        //iterating the elements
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " +entry.getValue());
        }

        HashMap<Integer,String> fruitMap =new HashMap<>();
        fruitMap.put(1,"Mango");
        fruitMap.put(3,"Apple");
        fruitMap.put(2,"Banana");
        fruitMap.put(4,"Grapes");

        System.out.println("Iterating Hashmap");
        for(Map.Entry<Integer,String> m : fruitMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        fruitMap.putIfAbsent(4, "Grapes"); //won't add any element
        fruitMap.putIfAbsent(5, "Dates"); //adds a new element
        System.out.println(fruitMap);

        //removing element based on key
        fruitMap.remove(2);
        System.out.println(fruitMap);

        //removing element based on key & value
        fruitMap.remove(3, "Banana");
        System.out.println(fruitMap);

    }
}
