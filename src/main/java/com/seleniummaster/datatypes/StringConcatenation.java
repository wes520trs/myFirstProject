package com.seleniummaster.datatypes;

public class StringConcatenation {
    public static void main(String[] args) {
//        int a=100;
//        int b=200;
//        String x="Hi";
//        String y="Java";
//        String z="50";
//        System.out.println(a+b);
//        System.out.println(a+z);
//        System.out.println(x+y);
//        System.out.println(a+b+z+x+y);
//        System.out.println(x+y+a+b);
//        System.out.println(x+y+(a+b));
//        System.out.println(a+b+x+y+a+b);

        // String concatenation -join two string - +, concat method, String.format
        String s1="United ";
        String s2="Coder";
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));
        System.out.println(String.format("Welcome to %s %s",s1,s2));

        String country="USA";
        String city="LA";
        System.out.println(String.format("I live in %s %s",country,city));

        String name="Tursun";
        String surname="SABIR";
        System.out.println(String.format("My name is %s %S",name,surname));




    }
}
