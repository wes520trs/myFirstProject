package com.seleniummaster.cubecartautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoryPage extends TestBase {
    public boolean addCategory() {
        WebElement categoryLink=driver.findElement(By.id("nav_categories"));
        waitForElementPresent(categoryLink,5);
        categoryLink.click();
        WebElement addCategoryLink=driver.findElement(By.linkText("Add Category"));
        waitForElementPresent(addCategoryLink,5);
        addCategoryLink.click();
        WebElement nameTextField=driver.findElement(By.id("name"));
        waitForElementPresent(nameTextField,5);
        nameTextField.sendKeys("TRS"+System.currentTimeMillis());
        WebElement saveButton=driver.findElement(By.id("cat_save"));
        waitForElementPresent(saveButton,5);
        saveButton.click();
        WebElement successfulMassage=driver.findElement(By.cssSelector("div.success"));
        if (successfulMassage.isDisplayed()){
            System.out.println("A product category is added successfully.");
            return true;
        }
        else {
            System.out.println("Product category test failed.");
            return false;
        }
    }
}
