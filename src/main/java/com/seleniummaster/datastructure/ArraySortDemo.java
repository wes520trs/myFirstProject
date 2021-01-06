package com.seleniummaster.datastructure;

import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] arr=new int[]{10,30,90,70,20};
        System.out.println(Arrays.toString(arr));
        // Arrays object ascending order
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // descending order
        for (int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
