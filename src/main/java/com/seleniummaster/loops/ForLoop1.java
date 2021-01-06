package com.seleniummaster.loops;

public class ForLoop1 {
    public static void main(String[] args) {
//        // 1-1000
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        // ........
//        System.out.println(1000);
//        for (int i=1; i<=1000; i++) {
//            System.out.println(i);
//        }
//
//        //1000-1
//        for (int j=1000; j>0; j-=10) {
//            System.out.println(j);
//        }
//        int sum=0;
//        for (int i=5; i<=100; i+=5) {
//            sum++;
//            System.out.println(i);
//            System.out.println("You can keep buying!");
//        }
//        System.out.printf("You buyed %d stuff \n",sum);
//        System.out.println("You are broken.");

//        //1-100
//        int evenNumberCounter=0;
//        for (int i=0; i<100; i+=2) {
//            evenNumberCounter++;
//            System.out.println("Even numbers between 1-100 is "+i);
//        }
//        System.out.println(evenNumberCounter);

        for (int i=0; i<100; i++) {
            if (i%2==0)
                System.out.println(i);
//            else
//                System.out.println();
        }

    }
}
