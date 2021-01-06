package com.seleniummaster.configutility;

import com.seleniummaster.io.FileUtility;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class CubeCartConfigTest {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String url;
        String configFile="config.properties";
//        if (ApplicationConfig.readConfigProperties(configFile,"qa")=="1")
        if (Integer.parseInt(ApplicationConfig.readConfigProperties(configFile,"qa"))==1){
            url=ApplicationConfig.readConfigProperties(configFile,"qaurl");
        }else {
            url=ApplicationConfig.readConfigProperties(configFile,"produrl");
        }
        driver.get(url);
        UIUtility utility=new UIUtility(driver);
        String username=ApplicationConfig.readConfigProperties(configFile,"username");
        WebElement userNameBox=driver.findElement(By.id("username"));
        utility.waitForElementsPresent(userNameBox);
        userNameBox.sendKeys(username);
        String password=ApplicationConfig.readConfigProperties(configFile,"password");
        WebElement passWordBox= driver.findElement(By.id("password"));
        utility.waitForElementsPresent(passWordBox);
        passWordBox.sendKeys(password);
        WebElement loginButton=driver.findElement(By.id("login"));
        utility.waitForElementsPresent(loginButton);
        loginButton.click();
        WebElement logOutIcon=driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        StringBuilder result=new StringBuilder();
        FileUtility fileUtility=new FileUtility();
        if (logOutIcon.isDisplayed()) {
            result.append("login successfully.").append("\n");
            System.out.println("Login test pass.");
            utility.takeScreenShot("longinSuccess.jpeg");
        }
        fileUtility.writeToFile("Test result","Cubecart-result",
                ".txt",result.toString());
        utility.waitForElementsPresent(logOutIcon);
        logOutIcon.click();
        WebElement loginButtonAfterLogout=driver.findElement(By.id("login"));
        if (loginButtonAfterLogout.isDisplayed()){
            result.append("logout successfully.");
            utility.takeScreenShot("logoutSuccess.png");
        }
//        fileUtility.writeToFile("Test result","Cubecart-result",
//                ".txt",result.toString());
        File file=new File("Test result"+File.separator+"Cubecart-result"+".txt");
        FileUtils.writeStringToFile(file,result.toString());
    }
}
