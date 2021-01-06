package com.seleniummaster.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiFunction {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,20,5,0,6,9,11,5,8);
//        Optional<Integer> minValue=numbers.stream().min((s1,s2)->{
//            return s1.compareTo(s2);
//    });
        Optional<Integer> minValue=numbers.stream().min(Integer::compareTo);
        System.out.println(minValue.get());

        Optional<Integer> maxValue=numbers.stream().max((s1,s2)->{
            return s1.compareTo(s2);
        });
        System.out.println(maxValue.get());

        List<Integer> sourtedList=numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sourtedList);
        List<Integer> reversedList=numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reversedList);

        List<String> fruits=Arrays.asList("one apple","one banana","two armut","one uzum","three aluqa");
        boolean result=fruits.stream().anyMatch(value->{
            return value.startsWith("one");
                });
        boolean result1=fruits.stream().anyMatch(
                value->{
            return value.startsWith("four");
                }
                );
        System.out.println(result);
        System.out.println(result1);
    }
}
