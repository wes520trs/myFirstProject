package com.seleniummaster.dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClassDemo2 {
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
        Select s=new Select(month);
        s.isMultiple();
        s.getFirstSelectedOption();
        List<WebElement> option=s.getOptions();
        System.out.println("Total options is "+ option.size());
        // how do you select element in dropdown without select tag
        //  Temmuz
        for (int i=0; i<option.size(); i++) {
            System.out.println(option.get(i).getText());
            String monthValue=option.get(i).getText();
            if (monthValue.equalsIgnoreCase("Tem")){
                option.get(i).click();
                break;
            }
        }
    }
}
