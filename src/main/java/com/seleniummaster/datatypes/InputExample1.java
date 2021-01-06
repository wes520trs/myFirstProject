package com.seleniummaster.datatypes;

import java.util.Scanner;

public class InputExample1 {
    public static void main(String[] args) {
        Scanner time=new Scanner(System.in);
        System.out.println("What time is it?");
        int timeHour=time.nextInt();
        if (timeHour<6) {
            System.out.println("It is too early, please keep sleeping.");
        }else if (timeHour<10) {
            System.out.println("It is time to get up, come on!");
        }else if (timeHour<18){
            System.out.println("It is nice day, go to work!");
        }else {
            System.out.println("You are tired, please have a rest.");
        }


    }
}
