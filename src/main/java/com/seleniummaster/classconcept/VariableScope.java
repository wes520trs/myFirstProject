package com.seleniummaster.classconcept;

public class VariableScope {
    //globle variable - class level variable
    String name="Tom";
//    static String name="Tom";
    int age=20;

    public static void main(String[] args) {
        int i=10; // local variable
        System.out.println(i+6);
        System.out.println(i);

        VariableScope variableScope=new VariableScope();
        System.out.println(variableScope.name);
//        System.out.println(name); // global variable
//        System.out.println(age);  // global variable, should static String name="Tom";

        variableScope.sum();
    }

    public void sum() {
        // local variable only accessable within the method
        int i=10;
        int j=20;
        int age=30;
    }

}
