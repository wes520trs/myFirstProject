package com.seleniummaster.loops;

import java.util.Scanner;

public class StarDemo2 {
    public static void main(String[] args) {
//      *
//      **
//      ***
//      ****
//      *****
        Scanner input = new Scanner(System.in);
        System.out.println("please enter line number:");
        int line = input.nextInt();
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\\"); // *\
            }
            System.out.println();
        }

//        *****
//        ****
//        ***
//        **
//        *
        for (int i = line; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*/");
            }
            System.out.println();
        }

        for (int i = line; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  \uD83D\uDC80   ");
            }
            System.out.println();

        }
    }
}
