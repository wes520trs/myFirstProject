package com.seleniummaster.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        LinkedList list1=new LinkedList();
        list.add("Java");
        list.add("Python");
        list1.add("javaScript");
        list1.add("Selenium");
        list1.addFirst("webDriver");
        list1.addLast("Test");
        System.out.println(list);
        System.out.println(list1);

        //geneerics
        List list2=new ArrayList(); //no type, so it default as object.
        list2.add(123);
        list2.add("hello");
        list2.add(12.56);
//        list2.add(list2[0]+list2[2]);
        // we can add any type to it
        //if List<String> or List<Integer>, we only can give it string or integer.
       for (int i=0; i<list2.size(); i++) {
           System.out.print(list2.get(i)+ " ");
       }
        System.out.println();
        for (Object s:list2 // = String s:list1
             ) {
            System.out.print(s+" ");
        }
        System.out.println();

        Iterator iterator=list1.iterator();  // = Iterator<String>
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

        System.out.println();
        List<Integer> value=new ArrayList<>();
        value.add(10);
        value.add(90);
        value.add(200);
//        value.add(value[0]+value[1]);
        Iterator<Integer> it=value.iterator();
        System.out.print(it.next()+" ");
        System.out.print(it.next()+" ");
        System.out.print(it.next()+" ");

    }
}
