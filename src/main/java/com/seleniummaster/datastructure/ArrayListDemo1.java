package com.seleniummaster.datastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();// list of integer value
//        ArrayList<Integer> list1=new ArrayList<>();
        list.add(100);
        list.add(80);
        list.add(50);
        list.add(1000);
        list.add(100);
        System.out.println(list.size());
        System.out.println(list.get(2));
        list.remove(1);
        System.out.println(list.size());
        list.set(3,500);
        list.add(700);
        System.out.println(list.size());
        System.out.println(list.get(3));
        System.out.println(list.get(1));
        System.out.println(list.toString());

        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        int sum=0;
        int count=0;
        for (int elements:list
             ) {
            System.out.print(elements + "  ");
            count++;
            sum=sum+elements;
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(count);
        System.out.println("Average =" +(sum/list.size()));
        Collections.sort(list);
        System.out.println("after Collection sort: "+list.toString());

    }
}
