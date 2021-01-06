package com.seleniummaster.exceptionhandling;

import org.apache.commons.lang3.ObjectUtils;

public class ExceptionHandling4 {
    public static void main(String[] args) {
        try {
//            String name="null";
            String name=null;
            System.out.println(name.length());
        }catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new NullPointerException("String value should be initialize.");
        }
        System.out.println("Hello");
    }
}
