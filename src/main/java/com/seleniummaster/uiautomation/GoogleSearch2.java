package com.seleniummaster.uiautomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearch2 {
    public static void main(String[] args) {
        //define chrome driver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chrome driver object instance
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //define chrome driver object instance
        WebDriver driver=new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //open google site
        driver.get("https://www.google.com");
        //find search box
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("Java"+ Keys.ENTER);
        WebElement searchResult=driver.findElement(By.id("result-stats"));
        String resultText=searchResult.getText();
        System.out.println(resultText);
        //Yaklaşık 48.400.000 sonuç bulundu (0,41 saniye)
//        String resultText="Yaklaşık 48.400.000 sonuç bulundu (0,41 saniye)";
        int beginIndex=resultText.indexOf("(");
        resultText=resultText.substring(0,beginIndex-1);
        resultText=resultText.replace("Yaklaşık","").replace("sonuç bulundu", "").trim();
        System.out.println(resultText);
        resultText=resultText.replace(".", "");
        System.out.println(resultText);
        if (Integer.parseInt(resultText)>=100000000) {
            System.out.println("Test passed.");
        }else {
            System.out.println("Test failed.");
        }



//        driver.close();
//        driver.quit();


    }
}
