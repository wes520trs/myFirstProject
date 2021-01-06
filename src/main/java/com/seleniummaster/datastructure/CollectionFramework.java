package com.seleniummaster.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionFramework {
    public static void main(String[] args) {
        int[] array={45,20,50,70,40,100};
        List<Integer> list=new ArrayList<>();
        System.out.println(Arrays.toString(array));
        for (int i=0; i<array.length; i++){
            list.add(array[i]);
        }
        System.out.println(Collections.min(list));
        Collections.sort(list);
        System.out.println(list.toString());
        Collections.reverse(list);
        System.out.println("after reverse order" +list.toString());

    }
}
