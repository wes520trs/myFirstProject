package com.seleniummaster.uiautomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c://webdriver//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys(args[2]+ Keys.ENTER);
        WebElement searchResult=driver.findElement(By.id("result-stats"));
        String searchText=searchResult.getText();
        System.out.println(searchText);
        int endIndex=searchText.lastIndexOf("00");
        searchText=searchText.substring(0,endIndex+2);
        System.out.println(searchText);
        searchText=searchText.replace("Yaklaşık","").trim();
        System.out.println(searchText);
        searchText=searchText.replace(".","");
        System.out.println(searchText);
        int searchNumber=Integer.parseInt(searchText);
        if (searchNumber>=10000000) {
            System.out.println("Test passed.");
        }
        else
            System.out.println("Test failed");
        Thread.sleep(3000);
        driver.close();

    }
}
