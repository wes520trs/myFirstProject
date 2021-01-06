package com.seleniummaster.myproject;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ProjectUtility {
    static WebDriver driver;
    static int timeout=5;

    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitForPresent(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public String singleReadFromExcel(String filePath, String sheetName, int rowNumber, int cellNumber){
        FileInputStream stream= null;
        try {
            stream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook workbook= null;
        try {
            workbook = new XSSFWorkbook(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet sheet=workbook.getSheet(sheetName);
        XSSFRow row=sheet.getRow(rowNumber);
        XSSFCell cell=row.getCell(cellNumber);
        switch (cell.getCellType()){
            case STRING:
                cell.getStringCellValue();
                break;
            case NUMERIC:
                cell.getNumericCellValue();
                break;
            case BLANK:
                System.out.println("No data in the cell");
                break;
        }
        return cell.toString();
    }

    public void multipleReadFromExcel(){

    }




}
