package com.seleniummaster.dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DropDownTechnique {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/reg/?rs=6&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjA1MDI4NjA4LCJjYWxsc2l0ZV9pZCI6NzMxOTQxNDIwNzMyOTEwfQ%3D%3D\n");
        List<WebElement> list=driver.findElements(By.xpath("//select[@id=\"month\"]/option"));
//        List list=new ArrayList();
//        list=driver.findElements(By.xpath("//select[@id=\"month\"]/option"));
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i).getText());
//            System.out.println(Arrays.toString(list[]));
        }
    }
}
