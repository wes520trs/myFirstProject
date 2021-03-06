package com.seleniummaster.datastructure;

import java.util.Arrays;

public class ArraysObjectDemo {
    public static void main(String[] args) {
        int[] arr1=new int[]{5,6,8,3,9};
        int[] arr2=new int[]{3,5,6,7,8};
        System.out.println(arr1.toString()); //State memory, machine reading, not human reading
        System.out.println(Arrays.toString(arr1)); //humen reading
        boolean b1=Arrays.equals(arr1,arr2);
        System.out.println(b1);
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));
        int index=Arrays.binarySearch(arr2,7);
        System.out.println(index);
    }
}
