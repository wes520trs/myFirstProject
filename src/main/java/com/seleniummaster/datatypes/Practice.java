package com.seleniummaster.datatypes;

public class Practice {
    public static void main(String[] args) {
        int a=100;
        int b=a++; //b=100, a=101
        int c=++a; //a=102, c=102
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int a1=50;
        int b1=(100+(a1++));
        int b3=a1+++100;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(b3);

        //teacher not


        boolean b2=false;
        int number=100;
        if(b2&&(number++>0)){
            System.out.println("True");
        }
        else
            System.out.println("false");
        System.out.println("number is :"+number);

        int num1=100;
        if(b2&(num1++)>0){
            System.out.println("True");
        }
        else
            System.out.println("false");
        System.out.println("number is :"+num1);




    }


}
