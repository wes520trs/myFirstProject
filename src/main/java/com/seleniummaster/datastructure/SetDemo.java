package com.seleniummaster.datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(70);
        set1.add(90);
        set1.add(20);
        System.out.println(set1.toString());
        int sum=0;
        for (int s:set1 //no .get()  no i
             ) {
            System.out.print(s+" ");
            sum=sum+s;
        }
        System.out.println("sum=" +sum);

//        Set<String> set1=new HashSet<>();
//        set1.add(10);
//        set1.add(20);
//        set1.add(70);
//        set1.add(90);
//        set1.add(20);
//        System.out.println(set1.toString());
//        String sum;
//        for (String s:set1 //no .get()  no i
//        ) {
//            System.out.print(s+" ");
//            sum=sum+s;
//        }
//        System.out.println("sum=" +sum);


        System.out.println();
        Object[] set=set1.toArray();
        for (int i=0; i<set.length; i++){
            System.out.print(set[i]+" ");
        }

        System.out.println();
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(70);
        list.add(90);
        list.add(20);
        System.out.println(list.toString());
//        System.out.println(list[0]+list[1]);
    }
}
