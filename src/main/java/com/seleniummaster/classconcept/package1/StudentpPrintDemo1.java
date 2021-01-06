package com.seleniummaster.classconcept.package1;

public class StudentpPrintDemo1 {
    public static void main(String[] args) {
        Student student1=new Student("Tom","Sawyer","Male");
        System.out.println(student1.getFirstName());
        System.out.println(student1.getLastName());
        System.out.println(student1.getGender());
    }
}
