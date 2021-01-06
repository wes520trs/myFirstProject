package com.seleniummaster.datatypes;

public class Operators {
    public static void main(String[] args) {
        int j=0; int i=0;
        i++;
        j++;
        System.out.println(i);
        System.out.println(j);

        i--;
        j--;
        System.out.println(i);
        System.out.println(j);

        int randomNumber=(int)(Math.random()*11);
        System.out.printf("The random number is %f \n",(Math.random()*11));
        System.out.println(randomNumber);

        int width=25;
        int height=15;
        int area=width*height;
        int perimeterArea=2*(width+height);
        System.out.printf("Area of rectangle is %d \n",area);
        System.out.printf("Perimeter area of rectangle is %d \n",perimeterArea);

        System.out.println(5%3);

        int num1=20;
        num1*=3;
        System.out.println(num1);
        num1/=10;
        System.out.println(num1);
        num1-=6;
        System.out.println(num1);

    }
}
