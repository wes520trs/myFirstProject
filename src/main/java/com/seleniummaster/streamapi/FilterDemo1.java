package com.seleniummaster.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,25,15,30,50);
//        for (int num:list
//             ) {
//            if (num%2==0)
//                System.out.println(num);
//        }
        list.stream().filter(s->s%2==0).forEach(s-> System.out.println(s));
        System.out.println();
        list.stream().filter(s->s%2==0).forEach(System.out::println);

        List<String> names=Arrays.asList("Istanbul","Tokyo","Berlin","Kashgar","Kuqa","Urumqi");
        names.stream().filter(s->s.length()>4&&s.length()<6).forEach(System.out::println);

        List<String> longNames=new ArrayList<>();
        longNames=names.stream().filter(s->s.length()>4&&s.length()<7).collect(Collectors.toList());
        System.out.println(longNames);

        List<String> words=Arrays.asList("book","pen",null,"sky",null,null);
        List<String> withoutNullValue=new ArrayList<>();
        withoutNullValue=words.stream().filter(s -> s!=null).collect(Collectors.toList());
        System.out.println(withoutNullValue);

    }
}
