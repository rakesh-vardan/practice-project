package com.learn.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample2 {
    public static void main(String[] args) {
        HashMap<Integer, Book> bookMap =new LinkedHashMap<>();

        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

        bookMap.put(1, b1);
        bookMap.put(2, b2);
        bookMap.put(3, b3);

        System.out.println("Iterating LinkedHashmap");
        for(Map.Entry<Integer, Book> m : bookMap.entrySet()){
            int key = m.getKey();
            Book book = m.getValue();
            System.out.println("Book-" + key + " Details:");
            System.out.println(book.id+ " " + book.name+ " " + book.author+ " " + book.publisher+ " " + book.quantity);
        }
    }
}
