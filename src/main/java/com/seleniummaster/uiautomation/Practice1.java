package com.seleniummaster.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys(args[1]+ Keys.ENTER);
        Thread.sleep(2000);
        WebElement searchResult=driver.findElement(By.id("result-stats"));
        String resultText=searchResult.getText();
        if (searchResult.isDisplayed()) {
            System.out.println(resultText);
            System.out.println("Test passed.");
        }
        else
            System.out.println("Test failed.");
        Thread.sleep(3000);
        driver.close();
    }
}
