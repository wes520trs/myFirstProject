package com.seleniummaster.cubecartautomation;

import com.seleniummaster.classconcept.CubeCartProductContent;
import com.seleniummaster.classconcept.DropDownContent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends TestBase{
    public boolean addProduct (){
        WebElement productsLink=driver.findElement(By.id("nav_products"));
        waitForElementPresent(productsLink,5);
        productsLink.click();
        WebElement addProdcutLink=driver.findElement(By.xpath("//*[text()='Add Product']"));
        waitForElementPresent(addProdcutLink,5);
        addProdcutLink.click();

//        Random r=new Random();
//        ProductContent content=new ProductContent("Tursun"+r.nextInt(100),);
        CubeCartProductContent content=new CubeCartProductContent("Trs"+System.currentTimeMillis(),
                "ts997");
        driver.findElement(By.id("name")).sendKeys(content.getProductName());
        driver.findElement(By.id("product_code")).sendKeys(content.getProductCode());
        WebElement dropDown=driver.findElement(By.id("condition"));
        Select selectDropDown=new Select(dropDown);
//        selectDropDown.selectByValue("refurbished");
//        selectDropDown.selectByVisibleText("New");
//        selectDropDown.selectByIndex(0);
        selectDropDown.selectByVisibleText(DropDownContent.Used.name());
        driver.findElement(By.xpath("//input[@value='Save']")).click();
        String successfulMessage=driver.findElement(By.xpath("//div[@id=\"gui_message\"]/div[2]")).getText();
//        if (successfulMessage.equalsIgnoreCase("Product successfully created."))
        if (driver.getPageSource().contains(successfulMessage)) {
            System.out.println("Product added successfully.");
            return true;
        }
        else {
            System.out.println("Product added faild.");
            return false;
        }
    }
}
