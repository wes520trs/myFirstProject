package com.seleniummaster.datastructure;

import java.util.LinkedList;
import java.util.ListIterator;

public class Practice01 {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();
        names.add("Selenium");
        names.addFirst("Java");
        names.addLast("Master");
        names.addLast("Tutorial"); //Java, Selenium, Master, Tutorial
        ListIterator<String> nameList=names.listIterator();
        while (nameList.hasNext())
        {
            if (nameList.next()=="Java")
                System.out.println(nameList.next());
        }
    }
}
