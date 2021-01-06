package com.seleniummaster.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VerifyOrder {
    public static void main(String[] args) {
        List<String> phoneList=new ArrayList<>();
        phoneList.add("Samsung");
        phoneList.add("Iphone");
        phoneList.add("LG");
        phoneList.add("Nokia");
        phoneList.add("Motorola");
        System.out.println(phoneList);
        System.out.println(phoneList.toString());

        List<String> copiedList=new ArrayList<>();
        copiedList.addAll(phoneList);
        Collections.sort(copiedList);
        System.out.println(copiedList);
        System.out.println(copiedList.equals(phoneList));
        if (copiedList.equals(phoneList)){
            System.out.println("It is in sorted order");
        }else
            System.out.println("It is not in sorted order");


    }
}
