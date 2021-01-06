package com.seleniummaster.loops;

import java.util.Scanner;

public class HomeWork_W7D3_TriangleShape {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter line number: ");
        int lineNumber=input.nextInt();
        for (int i=2; i<=Math.pow(2,lineNumber); i*=2) {
            for (int j=1; j<=i; j++) {
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}
