package com.onlinecourses.guru99;

/*
Set of test script for testing website Guru99 Bank
The test script is developed using selenium framework
 */

/*
@auther Tursun Sabir
Test script 01
Test steps:
    1)  Go to http://www.demo.guru99.com/V4/
    2)  Enter valid UserID
    3)  Enter valid Password
    4)  Click login
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript01 {

    public static void main(String[] args) {
        //setup gecko driver
        System.setProperty("webdriver.gecko.driver","C:\\webdriver\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        String baseUrl="http://www.demo.guru99.com/V4/";

        //launch firefox and direct it to the Base URL
        driver.get(baseUrl);

        //Enter username
        driver.findElement(By.name("uid")).sendKeys("mngr304479");

        //Enter password
        driver.findElement(By.name("password")).sendKeys("sAjUrYd");

        //click login
        driver.findElement(By.name("btnLogin")).click();

    }
}
