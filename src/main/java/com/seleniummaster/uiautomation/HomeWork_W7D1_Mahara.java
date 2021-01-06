package com.seleniummaster.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeWork_W7D1_Mahara {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            ChromeOptions options = new ChromeOptions();
            String[] userName={"admin","student","learner","staff","sitestaff"};
        for (String elements:userName) {
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver.get("https://demo.mahara.org/");
            driver.findElement(By.name("login_username")).sendKeys(elements);
            driver.findElement(By.name("login_password")).sendKeys("MaharaDemo");
            Thread.sleep(1000);
            driver.findElement(By.name("submit")).click(); //log in
            Thread.sleep(2000);
            WebElement accountMenu = driver.findElement(By.cssSelector(".user-toggle"));
            WebElement logOut = accountMenu.findElement(By.xpath("//span[contains(text(),'Logout')]"));
//            WebElement logInSuccessfully = driver.findElement(By.xpath("//a[contains(text(),'James Jetts')]"));
            System.out.println("User: "+elements);
            boolean logInAction = false;
            if (accountMenu.isDisplayed()) {
                System.out.println("Log in seccessfully.");
                logInAction = true;
            }
            accountMenu.click();
            Thread.sleep(1000);
            logOut.click(); //log out
            Thread.sleep(2000);
            WebElement logOutSeccessfully = driver.findElement(By.xpath("//div[contains(text(),'You have been logged out successfully')]"));
            String logOutMassage = logOutSeccessfully.getText();
            boolean logOutAction = false;
            if (logOutMassage.equalsIgnoreCase("You have been logged out successfully")) {
                System.out.println("Log out successfully.");
                logOutAction = true;
            }
            if (logInAction && logOutAction) {
                System.out.println("Login/logout tests passed.");
            } else
                System.out.println("Login/logout tests failed.");

            System.out.println();
            driver.navigate().back();

        }
        driver.close();
    }
}
