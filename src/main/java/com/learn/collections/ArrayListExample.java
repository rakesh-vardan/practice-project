package com.learn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();

        //adding elements
        list.add("Mango");
        list.add("Banana");
        list.add("Apple");

        System.out.println(list);

        //iterating the elements
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //another way
        for(String fruit : list) {
            System.out.println(fruit);
        }

        //get first element
        System.out.println(list.get(0));

        //get last element
        System.out.println(list.get(list.size() - 1));

        //update or change an element
        list.set(2, "Dates");
        System.out.println(list);

        //sorting the arraylist
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(2);
        numList.add(3);
        numList.add(1);
        System.out.println(numList);
        Collections.sort(numList); //predefined class with utilities
        System.out.println(numList);

        //custom objects
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student(1, "Raj");
        Student student2 = new Student(2, "Ram");
        Student student3 = new Student(3, "Raheem");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        for(Student student : studentList) {
            System.out.println(student);
        }

    }
}
