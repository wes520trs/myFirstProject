package com.seleniummaster.loops;

public class ForEachLoop {
    public static void main(String[] args) {
        // for each loop
        int sum=0;
        for (String each:args) {
            System.out.print(each+"  ");
            sum = sum + Integer.parseInt(each);
        }
        System.out.println();
        System.out.println(sum);


        for (int i=0; i<args.length; i++){
            System.out.print(args[i]+"  ");
        }
    }
}
