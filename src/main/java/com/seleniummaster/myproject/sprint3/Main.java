package com.seleniummaster.myproject.sprint3;

import com.seleniummaster.myproject.CubeCartUtility;

public class Main {
    public static void main(String[] args) {
        CubeCartUtility cubeCartUtility = new CubeCartUtility();
        cubeCartUtility.logIn();
//        cubeCartUtility.addProducts(3, 2);
//        cubeCartUtility.changeBulkPrice("TRS", "10");
        cubeCartUtility.addReview("TRS", "Tursun", "002@gmail.com",
                "Almost new 1", "This product is like new.");
        cubeCartUtility.addReview("TRS", "Tursun", "002@gmail.com",
                "Almost new 2", "This product is like new.");
//
//        cubeCartUtility.addReview("TRS", "Tursun", "002@gmail.com",
//                "Almost new 3", "This product is like new.");
////        cubeCartUtility.updateReview("Almost new","102@gmail.com");
        cubeCartUtility.deleteReview("Tursun");
    }
}
