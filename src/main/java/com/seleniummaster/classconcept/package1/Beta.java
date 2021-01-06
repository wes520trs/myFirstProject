package com.seleniummaster.classconcept.package1;

public class Beta {
    public static void main(String[] args) {
        Alpha b=new Alpha();
        b.getInfo();
        b.alphaTest();
    }
    private String version;

    public Beta() {
    }

    public Beta(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
