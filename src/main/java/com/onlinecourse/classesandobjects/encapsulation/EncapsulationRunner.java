package com.onlinecourse.classesandobjects.encapsulation;

public class EncapsulationRunner {
    public static void main(String[] args) {
        EncapsulationMain myObj=new EncapsulationMain();
//        myObj.name(); //Error because of private access
//        myObj.name="John";
//        System.out.println(myObj.name);

        myObj.setName("David");
        System.out.println(myObj.getName());

    }
}
