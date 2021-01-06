package com.seleniummaster.classconcept;

import net.bytebuddy.implementation.bytecode.assign.TypeCasting;

public class CubeCartProductContent {
    private String productName;
    private String productCode;
    private double productPrice;

    public CubeCartProductContent() {
    }

    public CubeCartProductContent(String productName, String productCode) {
        this.productName = productName;
        this.productCode = productCode;
    }

    public CubeCartProductContent(String productName, String productCode, double productPrice) {
        this.productName = productName;
        this.productCode = productCode;
        this.productPrice = productPrice;
    }

    public String getProductName() {

        return productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public double getProductPrice() {

        return productPrice;
    }

//    public double increasePrice() {
//        double priceUp=productPrice+50;
//        return priceUp;
//    }
    public double reducePrice() {
        double priceDown=productPrice-50;
        return priceDown;
    }
    public String productPrinter() {
        String productinfo=("The new product name: " +productName+", product code: "+
                productCode+", product price after reducing: "+reducePrice());
        return productinfo;
    }
}
