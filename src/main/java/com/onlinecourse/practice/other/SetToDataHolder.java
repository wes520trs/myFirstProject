package com.onlinecourse.practice.other;

public class SetToDataHolder {

    public static void main(String[] args) {
        String myName = "tursun";
        DataHolder.setMyName(myName);
        System.out.println("the value setting to data holder is: " + DataHolder.getMyName());
    }
}
