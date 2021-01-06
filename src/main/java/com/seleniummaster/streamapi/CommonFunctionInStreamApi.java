package com.seleniummaster.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CommonFunctionInStreamApi {
    public static void main(String[] args) {
    List<String> countryName=new ArrayList<>();
        countryName.add("Australia");
        countryName.add("Canada");
        countryName.add("Canada");
        countryName.add("Brazil");
        countryName.add("Brazil");
        countryName.add("UK");
        countryName.add("Canada");
        countryName.add("US");

        List<String> distinctValue=countryName.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctValue);

        long duplicateSize=countryName.stream().distinct().count();
        System.out.println(duplicateSize);

        List<String> limitedList=countryName.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitedList);

}
}
