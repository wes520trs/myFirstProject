package com.seleniummaster.excel;

import java.util.List;

public class ExcelReadDemo {
    public static void main(String[] args) {
        ExcelUtility excelUtility=new ExcelUtility();
        excelUtility.readExcelCell("C:\\Users\\TUERXUN\\IdeaProjects\\SeleniumTestAutomation\\testdata\\login123.xlsx",
                "sayfa1",0,0);
        excelUtility.readExcelCell("C:\\Users\\TUERXUN\\IdeaProjects\\SeleniumTestAutomation\\testdata\\login123.xlsx",
                "sayfa1",0,1);
        excelUtility.readExcelCell("C:\\Users\\TUERXUN\\IdeaProjects\\SeleniumTestAutomation\\testdata\\login123.xlsx",
                "sayfa1",1,0);
        excelUtility.readExcelCell("C:\\Users\\TUERXUN\\IdeaProjects\\SeleniumTestAutomation\\testdata\\login123.xlsx",
                "sayfa1",1,1);
        List<LoginInfo> loginUser= excelUtility.readMultipleCellValue("C:\\Users\\TUERXUN\\IdeaProjects\\SeleniumTestAutomation\\testdata\\mahara.xlsx",
                "Sayfa1",1);
        for (LoginInfo users:loginUser){
            System.out.println(String.format("username=%s password=%s",users.getUserName(), users.getPassword() ));
            }
    }
}
