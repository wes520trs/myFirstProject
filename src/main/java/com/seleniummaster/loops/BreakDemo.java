package com.seleniummaster.loops;

public class BreakDemo {
    public static void main(String[] args) {
        //1-10000   when 2000 quit
        for (int i=1; i<=10000; i++) {
            if (i>2000)
                break;
            System.out.println(i);
        }
    }
}
