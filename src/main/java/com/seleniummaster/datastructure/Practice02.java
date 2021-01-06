package com.seleniummaster.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Practice02 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("A");
        names.add(0,"B");
        names.add("C");
        names.remove(1);
        System.out.println(names.toString());

    }
}
