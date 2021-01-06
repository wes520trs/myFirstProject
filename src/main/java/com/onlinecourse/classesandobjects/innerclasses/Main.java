package com.onlinecourse.classesandobjects.innerclasses;

public class Main {
    public static void main(String[] args) {
        OuterClass outerObj=new OuterClass();
//        OuterClass.InnerClass innerObj=outerObj.new InnerClass();
//        System.out.println(outerObj.x+innerObj.y);
        OuterClass.InnerClass myInner=new OuterClass.InnerClass();
        System.out.println(myInner.y);
    }
}
