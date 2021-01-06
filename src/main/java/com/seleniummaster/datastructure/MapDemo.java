package com.seleniummaster.datastructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> age=new HashMap<>();
        age.put("Tursun",36);
        age.put("Havva",18);
        age.put("irfan",6);
        System.out.println(age.get("Tursun"));
        age.replace("Tursun",35);
        System.out.println(age.get("Tursun"));
        System.out.println("hash code is: "+age.hashCode());
        System.out.println("toString: "+age.toString());
        Set<String> set=age.keySet();
        System.out.println(set.toString());
//        Set<Integer> set1=age.values();
        for (String s:set
             ) {
            System.out.print(age.get(s)+" ");
        }
        System.out.println();
        for (Map.Entry entry:age.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
//        age.values();
        System.out.println(age.keySet());
        System.out.println(age.values());
        System.out.println(age.toString());

    }
}
