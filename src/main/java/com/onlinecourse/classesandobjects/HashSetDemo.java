package com.onlinecourse.classesandobjects;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> num=new HashSet<>();
        num.add(3);
        num.add(8);
        num.add(15);
        num.add(23);
        num.add(39);
        num.add(4);
        num.add(8);
        num.add(15);
        System.out.println(num);
        for (Integer i:num
             ) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.print("Numbers between 1 and 10 in the set are: ");
        for (int i=1; i<10; i++) {
            if (num.contains(i)){
                System.out.print(i+" ");
            }
//            else
//                System.out.println(i+" is out of scope");
//        }
    }
}
}
