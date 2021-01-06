package com.seleniummaster.excel;

import com.seleniummaster.classconcept.FunctionLibrary;
import com.seleniummaster.configutility.ApplicationConfig;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class ReadFromExcel {
    public static void main(String[] args) {
        WebDriver driver;
        FunctionLibrary functionLibrary=new FunctionLibrary();
        String url=ApplicationConfig.readConfigProperties("config.properties","produrl");
        functionLibrary.openBrowser(url);
        ExcelUtility excelUtility=new ExcelUtility();
        String username=excelUtility.readExcelCell("C:\\Users\\TUERXUN\\IdeaProjects\\SeleniumTestAutomation\\testdata\\login123.xlsx",
                "sayfa1",1,0);
        String password=excelUtility.readExcelCell("C:\\Users\\TUERXUN\\IdeaProjects\\SeleniumTestAutomation\\testdata\\login123.xlsx",
                "sayfa1",1,1);
        functionLibrary.logIn(username,password);

        List<String> list=new ArrayList<>();
        for (int i=4;i<=6;i++) {
                String productName = excelUtility.readExcelCell("C:\\Users\\TUERXUN\\IdeaProjects\\SeleniumTestAutomation\\testdata\\login123.xlsx",
                        "sayfa1", i, 0);
            String weight = excelUtility.readExcelCell("C:\\Users\\TUERXUN\\IdeaProjects\\SeleniumTestAutomation\\testdata\\login123.xlsx",
                    "sayfa1", i, 1);
            functionLibrary.addProduct(productName, weight);
        }


//        functionLibrary.closeBrowser();



    }
}
