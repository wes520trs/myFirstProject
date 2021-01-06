package com.seleniummaster.datatypes;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //School name
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your school name");
        String schoolName=input.nextLine();
        System.out.println("Please enter your school address");
        String schoolAddress=input.nextLine();
        System.out.println("Please enter your post code");
        String zipCode=input.nextLine();
        System.out.printf("Your school full address is %s %s %s \n",schoolName,schoolAddress,zipCode);
        System.out.println("Plesase enter your school name, school address and zip code");
        String schoolName2=input.next();
        String schoolAddress2=input.next();
        String zipCode2=input.next();
        System.out.printf("Your school full address is %s %s %s",schoolName2,schoolAddress2,zipCode2);

    }
}
