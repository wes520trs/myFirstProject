package com.seleniummaster.conditions;

public class ConditionDemo4 {
    public static void main(String[] args) {
        int month=9;
        if (month>=3&&month<=5) {
            System.out.println("You are in spring");
        }
        else if (month>=6&&month<=8){
            System.out.println("You are in summer");
        }
        else if (month>=9&&month<=11) {
            System.out.println("You are in autumn");
        }
        else
            System.out.println("You are in winter");
    }
}
