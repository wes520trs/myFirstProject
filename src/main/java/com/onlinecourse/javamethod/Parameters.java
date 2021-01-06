package com.onlinecourse.javamethod;

public class Parameters {
    static int myMethod(String fname, int age){
        System.out.println(fname+" is "+age);
        System.out.println(age);
        return age*2;
//        int t=r*2;  after return keyword, we cannot add any row

    }

    public static void main(String[] args) {
        System.out.println( myMethod("John",10));
        System.out.println("wihtout sout");
        myMethod("David",30);
    }
}
