package com.seleniummaster.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElementArray {
    public static void main(String[] args) {
        //max number
        int a[]={10,40,100,80,100,60};
        int maxNumber=0;
        for (int i=0; i<a.length; i++) {
            if (maxNumber<a[i]) {
                maxNumber=a[i];
            }
        }
        System.out.println(maxNumber);

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the length of array:");
        int length=input.nextInt();
        int[] numbers=new int[length];
        int maxnumber1=0;
        for (int i=0; i<numbers.length; i++) {
            numbers[i]=(int)(Math.random()*100+1);
            if (maxnumber1<numbers[i]) {
                maxnumber1=numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(maxnumber1);



    }

}
