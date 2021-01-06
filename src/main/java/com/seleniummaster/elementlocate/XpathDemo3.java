package com.seleniummaster.elementlocate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class XpathDemo3 extends OpenPage {
    public static void main(String[] args) throws InterruptedException {
        OpenPage page=new OpenPage();
        page.openWebPage("https://okul.com.tr");
        Thread.sleep(2000);
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='searchText']"));
        searchBox.sendKeys("Doga koleji"+ Keys.ENTER);
    }
}
