package com.onlinecourse.practice.other;

public class DataHolder {
    private static String myName;

    public DataHolder() {
    }

    public static String getMyName() {
        return myName;
    }

    public static void setMyName(String myName) {
        DataHolder.myName = myName;
    }
}
