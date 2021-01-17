package com.onlinecourse.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathAnd_OR {
    public static void main(String[] args) {
        WebDriver driver;
        List<WebElement> w,x,y;
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/v1/");
        w=driver.findElements(By.xpath("//label[starts-with(@id,'message')]"));
        System.out.println(w.get(1));
        //followint is elemets after that elemet with tag name "input" etc.
        y=driver.findElements(By.xpath("//*[@type='text']//following::input"));
        boolean y1=y.get(1).isDisplayed();
        //preceding is elements before that elemet
        x=driver.findElements(By.xpath("//*[@type='reset']//preceding::label"));
        boolean x1=x.get(0).isDisplayed();
        driver.close();



    }
}
