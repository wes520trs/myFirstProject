package com.seleniummaster.oopconcepts.inheritancetutorial;

import java.util.ArrayList;
import java.util.List;

public class StudentInformation {
    public static void main(String[] args) {
        Student student=new Student();
        student.setFirstName("AA");
        student.setLastName("BB");

        GraduateStudent graduateStudent=new GraduateStudent();
        graduateStudent.setFirstName("Tom");
        graduateStudent.setLastName("Mike");
        graduateStudent.setMajor("Test Automation");
        graduateStudent.setResearchField("Programming");

        System.out.println(graduateStudent.toString());

        GraduateStudent graduateStudent1=new GraduateStudent();
        graduateStudent1.setFirstName("Tursun");
        graduateStudent1.setLastName("Sabir");
        graduateStudent1.setMajor("Math");
        graduateStudent1.setResearchField("RandomNumbers");


        List<GraduateStudent> studentList=new ArrayList<>();
        studentList.add(graduateStudent);
        studentList.add(graduateStudent1);
        for ( GraduateStudent students:studentList
             ) {
            System.out.println(students.toString());
        }

    }
}
