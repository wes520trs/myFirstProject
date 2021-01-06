package com.seleniummaster.uiautomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com");
//        driver.findElement(By.name("q")).sendKeys("Econometrics"+ Keys.ENTER);
//        Thread.sleep(3000);
//        driver.close();

//        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.hepsiburada.com");
//        Thread.sleep(3000);
//        driver.findElement(By.className("desktopOldAutosuggestTheme-input")).sendKeys("Oyuncak"+Keys.ENTER);

//          System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
//          WebDriver driver=new ChromeDriver();
//          driver.manage().window().maximize();
//          driver.get("https://www.google.com.tr");
//          driver.findElement(By.name("q")).sendKeys("irfan Dursun"+ Keys.ENTER);
//          Thread.sleep(8000);
//          driver.quit();

//        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.google.com");
//        driver.manage().window().maximize();
//        driver.findElement(By.name("q")).sendKeys("Egemen Kaan"+ Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector(".rc:nth-child(2) .LC20lb > span")).click();
//        Thread.sleep(8000);
//        driver.findElement(By.id("ad-text:7")).click();
//        Thread.sleep(10000);
//        driver.quit();

        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        Dimension dimension1=new Dimension(1500,1000);
        driver.manage().window().setSize(dimension1);
        Thread.sleep(3000);
        Point point1=new Point(100,50);
        driver.manage().window().setPosition(point1);
        Thread.sleep(3000);
        driver.get("https://www.google.com");
        Point point2=new Point(300,100);
        driver.manage().window().setPosition(point2);
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("Irfan Dursun"+ Keys.ENTER);
        Dimension dimension2=new Dimension(700,300);
        driver.manage().window().setSize(dimension2);
        Thread.sleep(3000);
        driver.quit();

    }
}
