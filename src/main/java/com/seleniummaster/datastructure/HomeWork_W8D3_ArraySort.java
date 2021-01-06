package com.seleniummaster.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeWork_W8D3_ArraySort {
    public static void main(String[] args) {
        //first method
        System.out.println("First method");
        int[] number=new int[10];
        for (int i=0; i<10; i++) {
            number[i]= (int) (Math.random() * (100-10)+10);
        }
        System.out.println(Arrays.toString(number));
        Arrays.sort(number); //ascending order
        System.out.println(Arrays.toString(number));
        // descending order
        for (int i=number.length-1; i>=0; i--) {
            System.out.print(number[i]+" ");
        }
        System.out.println();

        //second method
        System.out.println("Second method:");
        List<Integer> list=new ArrayList<>();
        for (int i=0; i<10; i++) {
            list.add((int)(Math.random()*(100-10)+10)); //10 to 100
        }
        System.out.println(list);
        Collections.sort(list); //ascending order
        System.out.println("After sorting");
        System.out.println(list);
        Collections.reverse(list); //descending order
        System.out.println("After sorting");
        System.out.println(list);

    }
}
