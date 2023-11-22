package com.learn.collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();

        //adding elements
        list.add("Raj");
        list.add("Ravi");
        list.add("Ram");

        System.out.println(list);

        //iterating the elements
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //another way
        for(String person : list) {
            System.out.println(person);
        }

        //get first element
        System.out.println("First element: " +list.get(0));

        //get last element
        System.out.println("Last element: " +list.get(list.size() - 1));

        //update or change an element
        list.set(2, "Rakesh");
        System.out.println(list);

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Sekhar");
        list2.add("Somu");

        list.addAll(list2);
        System.out.println(list);

        list.remove(4);
        System.out.println(list);

        list.remove("Ravi");
        System.out.println(list);
    }
}
