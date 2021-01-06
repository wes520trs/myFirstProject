package com.onlinecourse.classesandobjects;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> cities=new HashMap<>();
        cities.put("England","London");
        cities.put("US","Washington");
        cities.put("Aksu","Kuqa");
        cities.put("Turkey","Istanbul");
        cities.put("France","Paris");
        System.out.println(cities);
        System.out.print(cities.keySet()+" ");

        System.out.println("key is: ");
        for (String i:cities.keySet()
             ) {
            System.out.println(i);
        }

        System.out.println("value is:");
        for (String i:cities.values()
             ) {
            System.out.println(i);
        }

        System.out.println("key and value is: ");
        for (String i:cities.keySet()
             ) {
            System.out.println("key: "+i+" value: "+cities.get(i));
        }

    }
}
