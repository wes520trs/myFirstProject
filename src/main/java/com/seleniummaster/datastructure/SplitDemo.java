package com.seleniummaster.datastructure;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String s="Hello_Selenium_Java_Automation";
        String h="Toyota,Honda,BMW";
        String[] arr=s.split("_");
        String[] arr1=h.split(",");
        for (String elements:arr) {
            System.out.println(elements);
        }
        for (String element2:arr1
             ) {
            System.out.println(element2);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
