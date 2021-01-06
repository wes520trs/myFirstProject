package com.onlinecourse.classesandobjects.multipleinterface;

class MethodBodyClass implements FirstInterface, SecondInterface {
    public void myFirstMethod(){
        System.out.println("This is first method body.");
    }

    public void mySecondMethod(){
        System.out.println("This is second method body.");
    }
}
