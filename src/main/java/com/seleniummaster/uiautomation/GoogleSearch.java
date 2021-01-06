package com.seleniummaster.uiautomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        //define chrome driver instance and location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chrome driver object instance
        WebDriver driver=new ChromeDriver();
        //driver.manage().window().maximize();
        Dimension dimension=new Dimension(1500,1500);
        driver.manage().window().setSize(dimension);
        Point point=new Point(300,200);
        driver.manage().window().setPosition(point);
        //open google website
        driver.get("https://www.google.com");
        //search box send keys
        driver.findElement(By.name("q")).sendKeys("java"+ Keys.ENTER);
        driver.close(); //close window
        driver.quit(); // close all driver instance -- system memory



    }
}
