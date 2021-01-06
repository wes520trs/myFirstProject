package com.seleniummaster.datastructure;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("book1");
        stack.push("book2");
        stack.push("book3");
        stack.push("book4");
        // Last in first out LIFO
        System.out.println(stack.toString());
        //remove book
        String removedbook=stack.pop();
        System.out.println("the removed book is "+removedbook);
        System.out.println(stack.toString());
        stack.remove(1);
        System.out.println(stack.toString());
        System.out.println(stack.search("book3"));

    }
}
