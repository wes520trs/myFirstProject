package com.seleniummaster.javabasics;

public class StringExample {
    public static void main(String[] args) {

        String greetings="Hello Selenium Master";
        int i=greetings.length();
        System.out.println("The string length is "+i);
        //convert to upper case
        String greetingsUpper=greetings.toUpperCase();
        System.out.println("Upper case of the string greetings is "+greetingsUpper);
        //convert to lower case
        String greetingsLowercase=greetings.toLowerCase();
        System.out.println("Lower case of the string greetings is "+greetingsLowercase);
        //concatanate
        String a=greetings.concat(" Java Webdriver Crash Course");
        System.out.println(a);
        //replace string
        String testPlan="Login Test";
        testPlan=testPlan.replace("Test","Plan");
        System.out.println(testPlan);
        //get sub string
        greetings=greetings.substring(0,4);
        System.out.println(greetings);
        // remove spaces in the beginning and end
        String country="    USA   ";
        System.out.println("Country is "+country);
        System.out.println("Country is "+country.trim());
        //check the letter in the string
        String x="abcfdef";
        char y='s';
        int location=x.indexOf(y);
        System.out.println(String.format("The location of %s in %s is %d",y,x,location));

        String testCase="Login Test";
        String subString="Logout";
        System.out.println(String.format("Test case: %s contains %s: %b",testCase,subString,testCase.contains(subString)));



    }
}
