package com.seleniummaster.datatypes;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // define a scanner object
        Scanner inputName=new Scanner(System.in);
        System.out.println("What is your name?");
        String nameValue=inputName.nextLine();
        System.out.println("Your name is "+nameValue);
        System.out.printf("Turkce adiniz %s \n",nameValue);

        //define another Scanner object*
        System.out.println("What is the value of the expression 8*7?" );
        Scanner inputValue=new Scanner(System.in);
        int value=inputValue.nextInt();
        System.out.printf("The value of 8*7 is %d \n",value);
        System.out.printf("Your answer is %b \n",value==56);



    }
}
