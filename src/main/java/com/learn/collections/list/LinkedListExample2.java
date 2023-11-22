package com.learn.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {

    public static void main(String[] args) {
        //Creating list of Books
        List<Book> list=new LinkedList<>();

        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

        list.add(b1);
        list.add(b2);
        list.add(b3);

        for(Book book : list) {
            System.out.println(book);
        }

    }
}
