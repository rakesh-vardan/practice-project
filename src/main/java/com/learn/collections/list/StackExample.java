package com.learn.collections.list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //checking if the stack is empty or not
        System.out.println(stack.isEmpty());

        //adding elements with push
        stack.push(10);
        stack.push(23);
        stack.push(45);

        System.out.println(stack);
        System.out.println(stack.isEmpty());

        //size of stack
        System.out.println(stack.size());

        //removing elements with pop
        stack.pop();
        System.out.println(stack);

        //checking the top most element in the stack
        System.out.println(stack.peek());

        //searching for an element
        System.out.println(stack.search(23));
        System.out.println(stack.search(10));

        System.out.println("Looping/traversing elements");
        for(Integer i : stack) {
            System.out.println(i);
        }
    }
}
