package com.onlinecourse.classesandobjects;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExClassDemo {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("تۇرسۇن",Pattern.CASE_INSENSITIVE);
        //Pattern.CASE_INSENSITIVE is optional
        Matcher match=pattern.matcher("Welcome to تۇرسۇن");
        boolean matchFound=match.find();
        if (matchFound){
            System.out.println("Match found.");
        }else {
            System.out.println("Match not found.");
        }
    }
}
