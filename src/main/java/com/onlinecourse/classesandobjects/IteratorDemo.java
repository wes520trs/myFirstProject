package com.onlinecourse.classesandobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(3);
        num.add(8);
        num.add(2);
        num.add(15);
        num.add(23);
        num.add(39);
        num.add(5);
        System.out.println(num);

        Iterator<Integer> itNum=num.iterator();
        System.out.print(itNum.next()+" ");
        System.out.print(itNum.next()+" ");
//        System.out.print(itNum.next()+" ");
//        System.out.print(itNum.next()+" ");
//        System.out.print(itNum.next()+" ");
//        System.out.print(itNum.next()+" ");

//        System.out.println("\n ***while loop***");
//        while (itNum.hasNext()){
//            System.out.print(itNum.next()+" ");
//        }

//        //remove numbers less than 10 from collection
        while (itNum.hasNext()){
            Integer i= itNum.next();
            if (i<10){
                itNum.remove();
            }
        }
//        System.out.println("\n after removed numbers less than 10:");
        System.out.println(num);



    }
}
