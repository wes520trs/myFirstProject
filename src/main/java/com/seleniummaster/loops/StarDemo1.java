package com.seleniummaster.loops;

import java.util.Scanner;

public class StarDemo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter line number:");
        int lines=scanner.nextInt();
        for (int i=1; i<=lines; i++) {
            System.out.println("* * * * * * *");
        }
    }
}
