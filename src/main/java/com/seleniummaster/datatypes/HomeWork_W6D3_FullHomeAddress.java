package com.seleniummaster.datatypes;

import java.util.Scanner;

public class HomeWork_W6D3_FullHomeAddress {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your name?");
        String name=input.nextLine();
        System.out.println("What is you house street address?");
        String street=input.nextLine();
        System.out.println("What is the name of the city?");
        String city=input.nextLine();
        System.out.println("What is the state?");
        String state=input.nextLine();
        System.out.printf("%s, your full address is %s, %s, %s",name,street,city,state);




    }
}
