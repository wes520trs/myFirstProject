package com.seleniummaster.myproject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CubeCartUtility {
    WebDriver driver;

    public void logIn(String username, String password) {
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php?");
        WebElement userNameBox = driver.findElement(By.id("username"));
        ProjectUtility utility = new ProjectUtility();
        System.out.println("Test data: " + username + ", " + password);
        userNameBox.sendKeys(username);
        WebElement passWordBox = driver.findElement(By.id("password"));
        passWordBox.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"header\"]/span/a[2]"));
        if (logoutButton.isDisplayed()) {
            System.out.println("Login successfully.");
        } else {
            System.out.println("Login failed.");
        }
    }

    public void addProducts(int productsNum, int conditionIndex) {
        for (int i = 1; i <= productsNum; i++) {
            ProjectUtility utility = new ProjectUtility();
            String productName = utility.singleReadFromExcel("testdata\\cubecart.xlsx",
                    "Product", 0, i);
            String price = utility.singleReadFromExcel("testdata\\cubecart.xlsx",
                    "Product", 3, i);
            System.out.println("Product name and price is: " + productName + ", " + price);
            WebElement productsLink = driver.findElement(By.xpath("//*[@id=\"nav_products\"]"));
            ProjectUtility.sleep(1);
            productsLink.click();
            WebElement addProdcutLink = driver.findElement(By.xpath("//*[text()='Add Product']"));
            addProdcutLink.click();
            WebElement productNameArea = driver.findElement(By.xpath("//*[@id=\"name\"]"));
            productNameArea.sendKeys(productName);
            WebElement conditionDropDown = driver.findElement(By.id("condition"));
            Select select = new Select(conditionDropDown);
            select.selectByIndex(conditionIndex);
            WebElement generateProductCode = driver.findElement(By.xpath("//*[@id=\"general\"]/fieldset[1]/div[6]/span/img"));
            generateProductCode.click();
            WebElement pricingTab = driver.findElement(By.xpath("//*[@id=\"tab_pricing\"]/a"));
            pricingTab.click();
            WebElement retailPriceArea = driver.findElement(By.id("price"));
            retailPriceArea.sendKeys(price);
            WebElement categoryTab = driver.findElement(By.xpath("//*[@id=\"tab_category\"]/a"));
            categoryTab.click();
            WebElement categoryCheckBox = driver.findElement(By.xpath("//*[@id=\"category\"]/table/tbody/tr[9]/td[1]/input"));
            categoryCheckBox.click();
            WebElement saveButton = driver.findElement(By.xpath("//input[@value='Save']"));
            saveButton.click();
            if (driver.getPageSource().contains("successful")) {
                System.out.println(i + " Product added successfully.");
            } else {
                System.out.println("Product added failed.");
            }
        }
    }

    public void changeBulkPrice(String keyWords, String priceChangePercentage) {
        WebElement bulkPriceChageLink = driver.findElement(By.xpath("//*[@id=\"menu_Inventory\"]/li[9]/a"));
        bulkPriceChageLink.click();
        WebElement priceMethodDropdownList = driver.findElement(By.xpath("//*[@id=\"bulk_price_method\"]"));
        Select method = new Select(priceMethodDropdownList);
        method.selectByIndex(1);
        WebElement percentageArea = driver.findElement(By.xpath("//*[@id=\"assign\"]/fieldset[1]/div/input"));
        percentageArea.sendKeys(priceChangePercentage);

        WebElement bulkPriceTable = driver.findElement(By.xpath("//*[@id=\"assign\"]"));
        List<WebElement> listOfProducts = bulkPriceTable.findElements(By.tagName("tr"));
        System.out.println("number of products is: " + listOfProducts.size());
        for (WebElement element : listOfProducts) {
            if (element.getText().contains(keyWords)) {
                System.out.println("my product is: " + element.getText());
                // //*[@id="bulk_update_products"]/div/table/tbody/tr[1]/td[1]/div/input
                // //*[@id="bulk_update_products"]/div/table/tbody/tr[2]/td[1]/div/input
                // //*[@id="bulk_update_products"]/div/table/tbody/tr[3]/td[1]/div/input
                WebElement checkBox = element.findElement(By.name("product[]"));
                checkBox.click();
            }
        }
        WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"page_content\"]/form/div[2]/input"));
        saveButton.click();
        WebElement updateMassage = driver.findElement(By.xpath("//*[@id=\"gui_message\"]/div"));
        String massageContent = updateMassage.getText();
        if (massageContent.contains("have been updated")) {
            System.out.println("Prices have been updated successfully.");
        } else {
            System.out.println("Price update failed.");
        }
    }

//    public void addReview(String productName, String reviewerName, String email, String title, String content) {
    public void addReview(ArrayList<String> review) {
        WebElement reviewsLink = driver.findElement(By.xpath("//*[@id=\"menu_Inventory\"]/li[3]/a"));
        reviewsLink.click();
        WebElement addReviewTab = driver.findElement(By.xpath("//*[@id=\"tab_control\"]/div[2]/a"));
        addReviewTab.click();
        WebElement productArea = driver.findElement(By.id("ajax_name"));
        productArea.sendKeys(review.get(0));
        ProjectUtility.sleep(3);
        WebElement myProduct = productArea.findElement(By.xpath("//em"));
        // first item xpath=//em[contains(.,'TRS')] or xpath=//em
        // second item xpath=//li[2]/span or xpath=//span[@name='2']
        // third item xpath=//li[3]/span/em
        myProduct.click();
        WebElement statusCheckBox = driver.findElement(By.xpath("//*[@id=\"review\"]/fieldset/div[2]/span/img"));
        statusCheckBox.click();
        WebElement nameArea = driver.findElement(By.id("review_name"));
        nameArea.sendKeys(review.get(1));
        WebElement reviewerEmail = driver.findElement(By.id("review_email"));
        reviewerEmail.sendKeys(review.get(2));
        WebElement reviewTitle = driver.findElement(By.id("review_title"));
        reviewTitle.sendKeys(review.get(3));
        WebElement reviewContent = driver.findElement(By.id("review_content"));
        reviewContent.sendKeys(review.get(4));
        WebElement rating = driver.findElement(By.linkText("4"));
        //xpath=//a[contains(text(),'4')]
        rating.click();
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"page_content\"]/form/div[2]/input[2]"));
        submitButton.click();
        if (driver.getPageSource().contains("Review successfully added.")) {
            System.out.println("Review successfully added.");
        } else {
            System.out.println("Review added failed.");
        }

    }

    public void updateReview(String title, String email) {
        WebElement reviewsLink = driver.findElement(By.xpath("//*[@id=\"menu_Inventory\"]/li[3]/a"));
        reviewsLink.click();
        WebElement reviewTable = driver.findElement(By.xpath("//*[@id=\"reviews\"]"));
        List<WebElement> reviewsList = reviewTable.findElements(By.className("note"));
        // //*[@id="reviews"]/div[2]
        // //*[@id="reviews"]/div[3]
        System.out.println("Review number is: " + reviewsList.size());
        for (WebElement review : reviewsList
        ) {
            if (review.getText().contains(title)) {
                WebElement updateIcon = review.findElement(By.xpath("//i[contains(@title,'Edit')]"));
                updateIcon.click();
//                System.out.println("Review info is: " + review.getText().toString());
                WebElement reviewerEmail = driver.findElement(By.xpath("//*[@id=\"review_email\"]"));
                reviewerEmail.clear();
                reviewerEmail.sendKeys(email);
                WebElement rating = driver.findElement(By.linkText("2"));
                //  xpath=//a[contains(text(),'5')]
                rating.click();
                WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"page_content\"]/form/div[2]/input[2]"));
                submitButton.click();
                if (driver.getPageSource().contains("Review successfully updated.")) {
                    System.out.println("Review successfully updated.");
                } else {
                    System.out.println("Review can not updated.");
                }
            } else {
                System.out.println("Review can not found.");
            }
            break;
        }
    }

    public void deleteReview(String keyWrod) {
        boolean b = true;
        while (b) {
            WebElement reviewsLink = driver.findElement(By.xpath("//*[@id=\"menu_Inventory\"]/li[3]/a"));
            reviewsLink.click();
            WebElement reviewTable = driver.findElement(By.xpath("//*[@id=\"reviews\"]"));
            List<WebElement> reviewsList = reviewTable.findElements(By.className("note"));
            int listSize=reviewsList.size();
            System.out.println("Review number is: " + listSize);
            for (WebElement review : reviewsList) {
                if (review.getText().contains(keyWrod)) {
                    WebElement deleteIcon = review.findElement(By.xpath("//i[contains(@title,'Delete')]"));
                    deleteIcon.click();
                    driver.switchTo().alert().accept();
                    ProjectUtility.sleep(2);
                    if (driver.getPageSource().contains("Review successfully deleted.")) {
                        System.out.println("Review successfully deleted.");
                    } else {
                        System.out.println("Review can not deleted.");
                    }
                } else {
                    b = false;
                    System.out.println("Review can not found.");
                }
                break;
            }
            if (listSize==0)
                b=false;
        }
    }

}