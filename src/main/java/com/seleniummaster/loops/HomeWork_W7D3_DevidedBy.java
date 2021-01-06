package com.seleniummaster.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork_W7D3_DevidedBy {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Devided by: ");
        int divided=input.nextInt();
        int sum=0;
        System.out.printf("The numbers devided by %d are: \n",divided);
        List<Integer> list=new ArrayList<>();
        for (int i=1; i<=500; i++) {
            if (i%divided==0) {
                list.add(i);
                sum++;
            }
        }
        System.out.print(list.toString());
        System.out.println();
        System.out.printf("There are %d numbers which divided by %d with zero remain between 1-500.",sum,divided);
    }

}
