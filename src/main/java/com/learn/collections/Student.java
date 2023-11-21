package com.learn.collections;

public class Student {

    int rollNo;
    String name;

    public Student() {
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student[rollNo: " + this.rollNo + ", name: " + name
                + "]";
    }
}
