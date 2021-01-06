package com.seleniummaster.excel;

import com.seleniummaster.classconcept.CubeCartProductContent;
import com.seleniummaster.classconcept.DropDownContent;
import com.seleniummaster.classconcept.LoginUser;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class RoleBasedSecurityTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php?");
        ExcelUtility utility = new ExcelUtility();
        List<LoginInfo> loginUser = utility.readMultipleCellValue("C:\\Users\\TUERXUN\\IdeaProjects\\SeleniumTestAutomation\\testdata\\mahara.xlsx",
                "Sayfa1", 1);
        System.out.println(loginUser.size());
        String filePath="testdata\\Cubecart-report.xlsx";
        List<String> testResult=new ArrayList<>();
        testResult.add("testCase,module,testDate,result");
        for (LoginInfo users : loginUser) {
            WebElement userNameBox = driver.findElement(By.id("username"));
            waitForElementPresent(userNameBox,driver);
            String userName=users.getUserName();
            userNameBox.sendKeys(userName);
            WebElement passWordBox = driver.findElement(By.id("password"));
            waitForElementPresent(passWordBox,driver);
            String password=users.getPassword();
            passWordBox.sendKeys(password);
            WebElement loginButton = driver.findElement(By.id("login"));
            waitForElementPresent(loginButton, driver);
            loginButton.click();
            WebElement productLink=driver.findElement(By.id("nav_products"));
            if(productLink.isDisplayed()){
                System.out.println("Login test passed");
                testResult.add("AdminLogin,Login, "+userName+" "+password+" ,Passed");
            }
            else {
                System.out.println("Login test failed");
                testResult.add("AdminLogin,Login, "+userName+" "+password+", Failed");
            }
            WebElement logOutIcon = driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
            waitForElementPresent(logOutIcon, driver);
            logOutIcon.click();
            Thread.sleep(3000);
        }
        utility.writeToExcelMultipleCells(filePath,"report",testResult);
    }


    public static void waitForElementPresent(WebElement element, WebDriver driver){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}

