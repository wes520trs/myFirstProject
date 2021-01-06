package com.seleniummaster.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestResultUtility {
    public static void main(String[] args) {
        TestResultObject testResultObject=new TestResultObject("Customer","Add-customer",
                "2020-12-19","11:41",true);
        TestResultObject testResultObject1=new TestResultObject("Inventory","Add-product",
                "2020-12-19","11:43",true);
        List<TestResultObject> testResultObjectList=new ArrayList<>();
        testResultObjectList.add(testResultObject);
        testResultObjectList.add(testResultObject1);
        TestResult testResult=new TestResult(testResultObjectList,"11:45",
                "11:50","Tursun");
        ObjectMapper mapper=new ObjectMapper();
//        mapper.writeValue(new File("testdata/testResult.json"),testResult);
        try {
            mapper.writeValue(new File("testdata/testResult.json"),testResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
