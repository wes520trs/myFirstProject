package com.seleniummaster.datastructure;

import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {
        List<String> countryName=new ArrayList<>();
        countryName.add("Australia");
        countryName.add("Brazil");
        countryName.add("Canada");
        countryName.add("Brazil");
        countryName.add("UK");
        countryName.add("Canada");
        countryName.add("US");
        System.out.println(countryName.toString());

        Set<String> set=new HashSet<>();
//        set.addAll(countryName);
//        System.out.println(set.toString());

        for (int i=0; i<countryName.size(); i++){
            String name=countryName.get(i);
            if (set.add(name)==false) {
                System.out.println(name+" is duplicated.");
            }
        }
    }
}
