package com.seleniummaster.classconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeWork_W10D3_AddProcuct {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver.manage().window().maximize();
        driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php?");
        LoginUser user = new LoginUser("testAutomation", "automation123!");
        WebElement userNameBox = driver.findElement(By.id("username"));
        userNameBox.sendKeys(user.getUserName());
        WebElement passWordBox = driver.findElement(By.id("password"));
        passWordBox.sendKeys(user.getPassWord());
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click(); // log in

        driver.findElement(By.id("nav_products")).click(); //click products
        driver.findElement(By.xpath("//*[@id=\"tab_control\"]/div[2]/a")).click(); //click Add products
        CubeCartProductContent product=new CubeCartProductContent("Samsung Note12","SN"+System.currentTimeMillis(),999.99);
        WebElement productName = driver.findElement(By.id("name"));
        productName.sendKeys(product.getProductName());
        WebElement productCode = driver.findElement(By.id("product_code"));
        productCode.sendKeys(product.getProductCode());
        driver.findElement(By.xpath("//*[@id=\"tab_pricing\"]/a")).click(); //click Pricing
        WebElement retailPrice=driver.findElement(By.id("price"));
        retailPrice.sendKeys(String.valueOf(product.getProductPrice()));
        driver.findElement(By.xpath("//*[@id=\"page_content\"]/form/div[10]/input[3]")).click(); // click save button
        String productMassage=driver.findElement(By.xpath("//*[@id=\"gui_message\"]/div[2]")).getText();
        if (productMassage.equalsIgnoreCase("Product successfully created.")) {
            System.out.println("Product successfully created.");
        } else {
            System.out.println("Product adding failed.");
        }
//        System.out.println(product.increasePrice());
//        System.out.println(product.decreasePrice());
        System.out.println(product.productPrinter());
    }
}
