package com.onlinecourse.classesandobjects.innerclasses;

public class Main01 {
    public static void main(String[] args) {
        OuterClass01 myOuter=new OuterClass01();
        OuterClass01.InnerClass01 myInner=myOuter.new InnerClass01();
        System.out.println(myInner.myInnerMethod());
    }
}
