package com.seleniummaster.classconcept.package2;

import com.seleniummaster.classconcept.package1.Student;

public class StudentPrintDemo2 {
    public static void main(String[] args) {
        Student student2=new Student("David","Beckham","Male");
        System.out.println(student2.getFirstName());
        System.out.println(student2.getLastName());
        System.out.println(student2.getGender());


    }
}
