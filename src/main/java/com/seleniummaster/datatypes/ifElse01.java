package com.seleniummaster.datatypes;

public class ifElse01 {
    public static void main(String[] args) {
       /* if (12==4) {
            System.out.println("12 is grater than 4");
        } else {
            System.out.println("12 is equal to 4");
        }*/

        int time=21;
        if (time<12) {
            System.out.println("Good morning Sir!");
        } else if (time<18) {
            System.out.println("Good afternoon Sir!");
        } else if (time<22) {
            System.out.println("Good evening Sir!");
        } else {
            System.out.println("Good night Sir!");
        }

        int saat=11;
        String result=(saat<12)?"Gunaydin!":"iyi gunler!";
        System.out.println(result);
    }

}
