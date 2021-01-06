package com.seleniummaster.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        List<String> studentList=new ArrayList<>();
        studentList.add("Tom");
        studentList.add("David");
        studentList.add("Smith");
        studentList.add("Nade");
        //print out each element in array list use iterator
        Iterator<String> eachElement=studentList.iterator();
//        eachElement.next(); // Tom
//        eachElement.next(); //David
        while (eachElement.hasNext()) {
            System.out.print(eachElement.next()+" ");
        }
        System.out.println();

        // list iterator
        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Grape");
        ListIterator<String> iterator=fruits.listIterator(4);
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous()+ " ");
        }

    }
}
