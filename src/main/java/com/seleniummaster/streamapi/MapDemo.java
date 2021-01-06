package com.seleniummaster.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        List<String> cars= Arrays.asList("Honda","Toyota","Mazda","Benz");
        List<String> upperCaseCars=new ArrayList<>();
        upperCaseCars=cars.stream().map(m->m.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCaseCars);

        cars.stream().map(n->n.length()).forEach(System.out::println);
        cars.stream().map(m->m.length()).forEach(m->System.out.print(m+", "));
    }
}
