package com.seleniummaster.classconcept;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HomeWork_W10D1_CubeCart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        WebDriver driver=new ChromeDriver(options);
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver.manage().window().maximize();
        driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php?");
        LoginUser user=new LoginUser("testAutomation","automation123!");
        WebElement userNameBox=driver.findElement(By.id("username"));
        userNameBox.sendKeys(user.getUserName());
        WebElement passWordBox= driver.findElement(By.id("password"));
        passWordBox.sendKeys(user.getPassWord());
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click(); // log in
        // Adding new customer
        driver.findElement(By.xpath("//*[@id=\"menu_Customers\"]/li[1]/a")).click(); // click Customer List
        driver.findElement(By.xpath("//*[@id=\"tab_control\"]/div[3]/a")).click(); // click Add Customer
        CubeCartCustomerContent customer=new CubeCartCustomerContent();
        customer.setTitle("Mr.");
        customer.setFirstName("Tursun");
        customer.setLastName("Ss");
        customer.setPhone("0090216123456");
        customer.setCellPhone("009053123456");
        customer.setEmail("tursun"+System.currentTimeMillis()+"@gmail.com"); //hane sayisi cok fazla
        customer.setPassword("112233");
        customer.setConfirmPassword("112233");
        WebElement title=driver.findElement(By.id("cust-title"));
        title.sendKeys(customer.getTitle());
        WebElement firstName=driver.findElement(By.id("cust-firstname"));
        firstName.sendKeys(customer.getFirstName());
        WebElement lastName=driver.findElement(By.id("cust-lastname"));
        lastName.sendKeys(customer.getLastName());
        WebElement email=driver.findElement(By.id("cust-email"));
        email.sendKeys(customer.getEmail());
        WebElement phone=driver.findElement(By.id("cust-phone"));
        phone.sendKeys(customer.getPhone());
        WebElement cellPhone=driver.findElement(By.id("cust-mobile"));
        cellPhone.sendKeys(customer.getCellPhone());
        WebElement newPassword=driver.findElement(By.id("cust-password"));
        newPassword.sendKeys(customer.getPassword());
        WebElement confirmPassword=driver.findElement(By.id("cust-passconf"));
        confirmPassword.sendKeys(customer.getConfirmPassword());
        driver.findElement(By.name("save")).click(); //click save button after input customer information
        String customerMassage=driver.findElement(By.xpath("//*[@id=\"gui_message\"]/div")).getText(); //"Customer successfully added." massage element
        if (customerMassage.equalsIgnoreCase("Customer successfully added.")){
            System.out.println("Customer successfully added.");
        }
        else {
            System.out.println("Customer adding failed.");
        }
        // Adding Newsletter
        driver.findElement(By.xpath("//*[@id=\"menu_Customers\"]/li[4]/a")).click(); //click newsletter
        driver.findElement(By.xpath("//*[@id=\"tab_control\"]/div[2]/a")).click(); //click newsletter
        CubeCartNewsletterContent newsletter=new CubeCartNewsletterContent();
        newsletter.setSubject("New book about Java");
        newsletter.setSenderName("Tursun Ss");
        newsletter.setNewsletterContent("The book will be published next week.");
        newsletter.setSenderEmail(RandomStringUtils.randomAlphanumeric(1,10) +"@gmail.com"); //bir haneli rakam
        WebElement newsletterSubject=driver.findElement(By.id("email_subject"));
        newsletterSubject.sendKeys(newsletter.getSubject());
        WebElement senderName=driver.findElement(By.id("sender_name"));
        senderName.sendKeys(newsletter.getSenderName());
        WebElement senderEmail=driver.findElement(By.id("sender_email"));
        senderEmail.sendKeys(newsletter.getSenderEmail());
        driver.findElement(By.xpath("//*[@id=\"tab_email_text\"]/a")).click(); //click newsletter text content
        WebElement textArea=driver.findElement(By.id("content_text"));
        textArea.sendKeys(newsletter.getNewsletterContent());
        driver.findElement(By.xpath("//*[@id=\"page_content\"]/form/div[5]/input[3]")).click(); //click save button after input newsletter information
        String newsletterMassage=driver.findElement(By.xpath("//*[@id=\"gui_message\"]/div")).getText();
        if (newsletterMassage.equalsIgnoreCase("Newsletter Saved.")) {
            System.out.println("Newsletter successfully added.");
        }
        else
        {
            System.out.println("Newsletter adding failed.");
        }

        // Adding new category
        driver.findElement(By.id("nav_categories")).click(); //click Categories
        driver.findElement(By.xpath("//*[@id=\"tab_control\"]/div[2]/a")).click(); //click Add category
        CubeCartCategoryContent category=new CubeCartCategoryContent();
        category.setCategoryName("Tursun"+(int)(Math.random()*100));
        WebElement status=driver.findElement(By.xpath("//*[@id=\"cat_general\"]/fieldset/div[1]/span/img"));
        status.click();
        WebElement visible=driver.findElement(By.xpath("//*[@id=\"cat_general\"]/fieldset/div[2]/span/img"));
        visible.click();
        WebElement categoryName=driver.findElement(By.id("name"));
        categoryName.sendKeys(category.getCategoryName());
        WebElement parentCategory=driver.findElement(By.id("parent")); // Dropdown list of parent category
        Select p=new Select(parentCategory);
        p.selectByVisibleText("/2222");
        driver.findElement(By.id("cat_save")).click();
        String categoryMassage=driver.findElement(By.xpath("//*[@id=\"gui_message\"]/div")).getText();
        if (categoryMassage.equalsIgnoreCase("Category successfully created.")) {
            System.out.println("Category successfully created.");
        }
        else {
            System.out.println("Category adding failed.");
        }
    }
}
