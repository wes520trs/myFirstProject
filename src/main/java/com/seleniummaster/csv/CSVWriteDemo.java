package com.seleniummaster.csv;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CSVWriteDemo {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        builder.append("TestID,TestModule,TestType,TestStatus").append("\n");
        builder.append("01,Customer,Regression,Pass").append("\n");
        builder.append("02,Inventory,Regression,Pass").append("\n");
        builder.append("03,Product,Regression,Fail").append("\n");
        builder.append("04,category,Smoke,Fail").append("\n");
        File file=new File("Test result"+File.separator+"test-result.csv");
//        FileUtils.writeStringToFile(file,builder.toString());
        try {
            FileUtils.writeStringToFile(file,builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
