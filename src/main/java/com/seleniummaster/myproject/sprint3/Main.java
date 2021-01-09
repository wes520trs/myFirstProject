package com.seleniummaster.myproject.sprint3;

import com.seleniummaster.myproject.CubeCartUtility;
import com.seleniummaster.myproject.ProjectUtility;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CubeCartUtility cubeCartUtility = new CubeCartUtility();
        String username = ProjectUtility.singleReadFromExcel("testdata\\cubecart.xlsx", "login", 1, 0);
        String password = ProjectUtility.singleReadFromExcel("testdata\\cubecart.xlsx", "login", 1, 1);
        cubeCartUtility.logIn(username,password); //login finished

//        //adding 3 products, condition 2 is USED
//        cubeCartUtility.addProducts(3, 2);

//        cubeCartUtility.changeBulkPrice("TRS", "10");


        ArrayList<String> review1=new ArrayList<>();
        review1.addAll(ProjectUtility.multipleReadFromExcel("testdata\\cubecart.xlsx",
                "Review",1));
        System.out.println(review1);
        cubeCartUtility.addReview(review1);
        ArrayList<String> review2=new ArrayList<>();
        review2.addAll(ProjectUtility.multipleReadFromExcel("testdata\\cubecart.xlsx",
                "Review",2));
        System.out.println(review2);
        cubeCartUtility.addReview(review2);
        //        cubeCartUtility.addReview("TRS", "Tursun", "002@gmail.com",
//                "Almost new 2", "This product is like new.");
//        cubeCartUtility.addReview("TRS", "Tursun", "002@gmail.com",
//                "Almost new 3", "This product is like new.");



//        ProjectUtility.sleep(2);
        String updateByReviewerName=ProjectUtility.singleReadFromExcel("testdata\\cubecart.xlsx",
                "Review",1,1);
        String updateEmailAs=ProjectUtility.singleReadFromExcel("testdata\\cubecart.xlsx",
                "Review",2,4);
        cubeCartUtility.updateReview(updateByReviewerName,updateEmailAs);

        String deleteReviewByName=ProjectUtility.singleReadFromExcel("testdata\\cubecart.xlsx",
                "Review",1,1);

        cubeCartUtility.deleteReview(deleteReviewByName);
    }
}
