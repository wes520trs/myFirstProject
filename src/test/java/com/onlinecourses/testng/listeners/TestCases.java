package com.onlinecourses.testng.listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)

//mvn test -Dtest=com.onlinecourses.testng.listeners.TestCases -DsuiteXMLFile=" "

public class TestCases {

    //Test to pass as to verify listeners
    @Test
    public void logIn(){
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/V4/");
        WebElement userID=driver.findElement(By.name("uid"));
        userID.sendKeys("mngr34926");
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("amUpenu");
        WebElement loginButton=driver.findElement(By.name("btnLogin"));
        loginButton.click();
    }

    //Forcefully failed this test as to verify listeners
    @Test
    public void testToFailed(){
        System.out.println("This method to test fail.");
        Assert.assertTrue(false);
    }
}
