package com.seleniummaster.classconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CubeCartAddProduct {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php?");
        LoginUser user=new LoginUser("testAutomation","automation123!");
        WebElement userNameBox=driver.findElement(By.id("username"));
        userNameBox.sendKeys(user.getUserName());
        WebElement passWordBox= driver.findElement(By.id("password"));
        passWordBox.sendKeys(user.getPassWord());
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
        WebElement dashboard=driver.findElement(By.xpath("//div[@id=\"dashboard\"]/h3"));
        String word=dashboard.getText();

//        if (word.equalsIgnoreCase("dashboard"))
        if (driver.getPageSource().contains(word))
            System.out.println("Login successfully.");
        else
            System.out.println("Login failed.");

        WebElement productsLink=driver.findElement(By.id("nav_products"));
        productsLink.click();
        WebElement addProdcutLink=driver.findElement(By.xpath("//*[text()='Add Product']"));
        addProdcutLink.click();

//        Random r=new Random();
//        ProductContent content=new ProductContent("Tursun"+r.nextInt(100),);
        CubeCartProductContent content=new CubeCartProductContent("Tursun"+System.currentTimeMillis(),
                "ts44738");
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
        if (driver.getPageSource().contains(successfulMessage))
            System.out.println("Product added successfully.");
        else
            System.out.println("Product added faild.");
        Thread.sleep(2000);
//        driver.close();
    }
}
