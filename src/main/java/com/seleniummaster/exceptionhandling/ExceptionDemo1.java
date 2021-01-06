package com.seleniummaster.exceptionhandling;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
//        }catch (ArithmeticException e) {
        }catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("in catch block");
        }
        System.out.println("hello world");
    }
}
