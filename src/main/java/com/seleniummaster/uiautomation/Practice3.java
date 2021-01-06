package com.seleniummaster.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c://webdriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        int sum=0;
        for (int i=0; i<=4; i++) {
            WebElement searchBox=driver.findElement(By.name("q"));
            searchBox.sendKeys(args[i]+ Keys.ENTER);
            Thread.sleep(2000);
            System.out.println("When you enter the key word: "+args[i]);
            WebElement searchResult=driver.findElement(By.id("result-stats"));
            String searchText=searchResult.getText();
            int endIndex=searchText.lastIndexOf("000");
            searchText=searchText.substring(0,endIndex+3);
            searchText=searchText.replace("Yaklaşık","").replace(".","").trim();
            long numberOfResult=Long.parseLong(searchText);
            if (numberOfResult>=100000000) {
                System.out.printf("%d results have been found and the test passed. \n",numberOfResult);
            } else
                System.out.println("The results found on Google is not enough and test failed.");
            driver.navigate().back();
            sum++;
        }
        Thread.sleep(3000);
        System.out.printf("You have totally searched %d key words.",sum);
        driver.close();
    }
}
