package com.seleniummaster.elementlocate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathDemo extends OpenPage{
    public static void main(String[] args) throws InterruptedException {
        OpenPage openPage=new OpenPage();
        openPage.openWebPage("https://www.sahibinden.com/");
        WebElement searchBox=driver.findElement(By.xpath("//input[@name='query_text']"));
        searchBox.sendKeys("Araba");
        WebElement searchButton=driver.findElement(By.xpath("//*[@id='searchSuggestionForm']/button"));
        searchButton.click();
        Thread.sleep(3000);
        openPage.waitForElementPresent(searchBox,5);
//        WebElement clear=driver.findElement(By.xpath("//*[@id='clearSearchPhrase']"));
//        openPage.waitForElementPresent(clear,5);
//        clear.click();
        WebElement searchBox1=driver.findElement(By.xpath("//*[@id=\"searchText\"]"));
//        searchBox1.click();
        openPage.waitForElementPresent(searchBox1,10);
        searchBox1.click();
//        searchBox.clear();
        searchBox1.sendKeys("kiralik ev"+ Keys.ENTER);
        Thread.sleep(5000);
        WebElement searchButton1=driver.findElement(By.xpath("//*[@id=\"searchSuggestionForm\"]/button"));
        searchButton1.click();
    }


}
