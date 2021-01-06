package com.onlinecourse.classesandobjects;

public class MyClass {
    final int x=5;
    String s="Java";


    public static void main(String[] args) {
        MyClass myObj=new MyClass();
        System.out.println(myObj.x);
        System.out.println(myObj.s);
        System.out.println("I love " + myObj.s);
        System.out.println("I am " + myObj.x);
//        myObj.x=10;  //cannot assign a value to final attributies
        System.out.println(myObj.x);
    }
}

