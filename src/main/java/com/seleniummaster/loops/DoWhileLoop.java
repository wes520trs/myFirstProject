package com.seleniummaster.loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        //1-100 even number
        int i=1;
        do {
            if (i%2==0) {
                System.out.println(i);
            }
            i+=5;
        } while (i<=10);

        int number1=10;
        while (number1>10) {
            System.out.println("Hello --while");
            i--;
        }

        int number2=10;
        do {
            System.out.println("Hello -do-while");
            number2--;
        } while (number2>10);

    }
}
