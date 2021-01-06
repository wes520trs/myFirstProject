package com.seleniummaster.datatypes;

import org.apache.commons.lang3.StringUtils;

public class StringReverse {
    public static void main(String[] args) {
        // fun nuf
        String language="Java";
        String words="learn Java is fun";
        System.out.println(StringUtils.reverse(language));
        System.out.println(StringUtils.reverseDelimited(words,'*'));
        System.out.println(StringUtils.capitalize(words));
        System.out.println(StringUtils.abbreviate(words,4));


    }
}
