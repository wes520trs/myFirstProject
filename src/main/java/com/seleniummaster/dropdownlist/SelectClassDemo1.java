package com.seleniummaster.dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class SelectClassDemo1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/reg/?rs=6&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjA1MDI4NjA4LCJjYWxsc2l0ZV9pZCI6NzMxOTQxNDIwNzMyOTEwfQ%3D%3D\n");
        WebElement day=driver.findElement(By.name("birthday_day"));
        WebElement month=driver.findElement(By.name("birthday_month"));
        WebElement year=driver.findElement(By.name("birthday_year"));
        // 5/6/1984
//        Select s1=new Select(day);
//        s1.selectByVisibleText("10");
//        Select s2=new Select(month);
//        s2.selectByVisibleText("Jul");
//        Select s3=new Select(year);
//        s3.selectByVisibleText("1992");

        SelectClassDemo1.selectValueFromDropDown(day,"5");
        SelectClassDemo1.selectValueFromDropDown(month,"Haz");
        SelectClassDemo1.selectValueFromDropDown(year,"1984");
//        s1.isMultiple();


    }
    public static void selectValueFromDropDown(WebElement element, String value) {
        Select ss=new Select(element);
        ss.selectByVisibleText(value);
    }
}
