package com.seleniummaster.classconcept.package1;

public class Alpha {
    public static void main(String[] args) {
        Alpha a = new Alpha();
        a.info = "alpha class";
    }

    private String info;

    public Alpha() {
    }

    public Alpha(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    void alphaTest() {
        System.out.println("Alpha test access.");

    }
}
