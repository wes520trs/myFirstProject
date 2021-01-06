package com.seleniummaster.configutility;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearchScreenShot {
    public static void main(String[] args) throws InterruptedException {
        //define chrome driver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //define chrome driver object instance
        WebDriver driver=new ChromeDriver(options);
        //maximize the browser
        driver.manage().window().maximize();
        //open google site
        driver.get("https://www.google.com");
        int sum=0;
        String[] searchWords=new String[]{"Turkey","Dubai","Finland","London"};
        UIUtility uiUtility=new UIUtility(driver);
        for (String word:searchWords
             ) {
            WebElement searchBox = driver.findElement(By.name("q"));
            Thread.sleep(1000);
            searchBox.sendKeys(word + Keys.ENTER);
            uiUtility.takeScreenShot(word+".png");
            sum++;
            System.out.printf("You have searched the key word: %s \n",word);
            driver.navigate().back();
        }
        System.out.printf("You have totally searched %d key words on the Google",sum);
//        driver.close();
//        driver.quit();

    }
}
