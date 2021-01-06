package com.seleniummaster.loops;


import java.util.Scanner;

public class HomeWork_W7D3_PrimeNumbres_Geeks {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,flag,i,j;
        System.out.println("Please enter starting number: ");
        a=input.nextInt();
        System.out.println("Please enter ending number: ");
        b=input.nextInt();
        for (i=a; i<=b; i++){
            if (i==0||i==1)
                continue;
            flag=1;
            for (j=2; j<=i/2; j++) {
                if (i%j==0) {
                    flag=0;
                    break;
                }
                flag=1;
            }
        if (flag==1)
            System.out.print(i+" ");
        }
    }
}
