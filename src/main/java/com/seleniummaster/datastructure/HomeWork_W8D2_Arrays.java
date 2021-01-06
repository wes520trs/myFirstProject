package com.seleniummaster.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork_W8D2_Arrays {
    public static void main(String[] args) {
        int[] numbers=new int[30];
        List<Integer> evenNumbers=new ArrayList<>();
        List<Integer> oddNumbers=new ArrayList<>();
        List<Integer> by3Numbers=new ArrayList<>();
        int sum=0;
        int countEven=0;
        int countOdd=0;
        int countBy3=0;
        for (int i=0; i<30; i++) {
            numbers[i]=(int)(Math.random()*100+1);
            if (numbers[i]%2==0) {
                evenNumbers.add(numbers[i]);
                countEven++;
            }
            if (numbers[i]%2!=0) {
                oddNumbers.add(numbers[i]);
                countOdd++;
            }
            if (numbers[i]%3==0) {
                by3Numbers.add(numbers[i]);
                countBy3++;
            }
            sum=sum+numbers[i];
        }
        System.out.println("The 30 Random numbers: "+Arrays.toString(numbers));
        System.out.println("Even numbers: "+evenNumbers.toString());
        System.out.println("There are "+countEven+" even numberes.");
        System.out.println("Odd numbers: "+oddNumbers.toString());
        System.out.println("There are "+countOdd+" odd numberes.");
        System.out.println("Numbers devided by 3: "+by3Numbers.toString());
        System.out.println("There are "+countBy3+" numberes which diveded by 3.");
        System.out.println("The sum of 30 random numbers is: "+sum);
        System.out.println("The average of 30 random number is:"+ sum/30);
        Arrays.sort(numbers);
        System.out.println("Ascending order: "+Arrays.toString(numbers));
        System.out.print("Rescending order: ");
        for (int i=numbers.length-1;i>=0;i--)
            System.out.print(numbers[i]+" ");
    }
}
