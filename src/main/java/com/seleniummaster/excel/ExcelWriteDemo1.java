package com.seleniummaster.excel;

import java.util.ArrayList;
import java.util.List;

public class ExcelWriteDemo1 {
    public static void main(String[] args) {
        ExcelUtility utility=new ExcelUtility();
        String fileName="testdata/testReport.xlsx";
        List<String> testReport=new ArrayList<>();
        testReport.add("testName,testModule,testStatus,excutedAt,excutedBy");
        testReport.add("Login,Login,Passed,2020-12-12,Tursun");
        testReport.add("Add Product,Inventory,Passed,2020-12-10,Irfan");
        testReport.add("Logout,login-logout,Passed,2020-12-11,Havva");

        utility.writeToExcelMultipleCells(fileName,"RegressionTest",testReport);
    }
}
