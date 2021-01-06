package com.seleniummaster.loops;

public class ContinueDemo {
    public static void main(String[] args) {
        //1-10000   when 2000 quit
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0)
                continue;
            System.out.println(i);
        }
    }
}
