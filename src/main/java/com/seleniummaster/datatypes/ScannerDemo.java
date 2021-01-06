package com.seleniummaster.datatypes;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        int password=1234;
        int existingAmount=1000;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter you pin number");
        int pin=scanner.nextInt();
        if(pin==password){
            System.out.println("Password is correct, you can enter the system.");
            System.out.println("Please enter the amount of money: ");
            int amount=scanner.nextInt();
            if(amount<=existingAmount) {
                System.out.println("you can draw the money.");
                } else
            System.out.println("Youe existing amount is not enough.");
        }else{
            System.out.println("Invalid password, please try again!");
        }





    }
}
