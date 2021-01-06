package com.seleniummaster.myproject.sprint2Mahara;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//mahara login, test data is read from excel (testdata\\mahara.xlsx), based on different role

public class MaharaLogin {
    public static WebDriver driver;

    public static void loginAs(String roleName){
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demo.mahara.org/");

//        //read from excel
//        String filePath="C:\\Users\\TUERXUN\\IdeaProjects\\SeleniumTestAutomation\\testdata\\mahara.xlsx";
//        FileInputStream inputStream=new FileInputStream(filePath);
//        XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
//        XSSFSheet sheet=workbook.getSheet("mahara");
//        XSSFRow row=sheet.getRow(2);
//        XSSFCell cell0=row.getCell(0);
//        XSSFCell cell1=row.getCell(1);
//        String username=cell0.getStringCellValue();
//        String password=cell1.toString();
//        System.out.println(username+"  "+ password);

        WebElement userNameField=driver.findElement(By.name("login_username"));
        userNameField.sendKeys(roleName);
        WebElement passWordField=driver.findElement(By.name("login_password"));
        passWordField.sendKeys("MaharaDemo");
        WebElement loginButton=driver.findElement(By.name("submit")); //log in
        loginButton.click();

        WebElement mainMenu=driver.findElement(By.xpath("/html/body/header/div/div/div[2]/button[1]/span[2]"));
        if (mainMenu.isDisplayed()){
            System.out.println("Login successfully.");
        }else {
            System.out.println("Login failed.");
        }
    }
}
