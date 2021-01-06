package com.seleniummaster.datastructure;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        List<String> userName=new ArrayList<>();
        userName.add("admin");
        userName.add("student");
        userName.add("learner");
        userName.add("staff");
        userName.add("Java");
        List<String> name=new ArrayList<>();
        name.add("Java");
        name.add("Python");
        name.add("Java Script");
        name.add("C++");
        name.add("staff");
        List<String> s1=userName.subList(0,2);
        List<String> s2=name.subList(0,2);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        userName.addAll(name);
        System.out.println("after adding : "+userName.toString());
        userName.removeAll(name);
        System.out.println("after remove : "+userName.toString());
//        userName.add("Java");
        System.out.println(name);
        System.out.println(userName);
        userName.retainAll(name);
        System.out.println("after retained:"+name);
        for (int i=0; i<userName.size(); i++) {
            System.out.print(name.get(i)+" ");
        }

    }
}
