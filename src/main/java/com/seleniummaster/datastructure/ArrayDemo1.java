package com.seleniummaster.datastructure;

import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // integer array
        int[] a=new int[5];
        a[0]=100;
        a[1]=200;
        a[2]=300;
//        a[3]=400;
        a[4]=500;
//        a[5]=600;
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }

        System.out.println();

        int[] b={10,20,30,40,50};
//        int[] b=new int[] {10,20,30,40,50};
        for (int elements:b) {         //for each loop
            System.out.print(elements+" ");
        }

        System.out.println();

        int[] c={110,210,310,410,510};
        System.out.println(Arrays.toString(c));
        for (int elements:c){
            System.out.print(elements +" ");
        }
        System.out.println();

        String[] name={"tursun","irfan","havva","sabir","isa"};
        int i=0;
        do {
            for (String elements : name
            ) {
                System.out.print(elements + " ");
            }
            System.out.println();
            i++;
        }while (i<10);
        System.out.println(name.toString());



    }
}
