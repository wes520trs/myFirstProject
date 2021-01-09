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
import java.util.ArrayList;
import java.util.List;

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

    public static String singleReadFromExcel(String filePath, String sheetName, int rowNumber, int cellNumber){
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

    public static List<String> multipleReadFromExcel(String filePath, String sheetName, int columnIndex){
        FileInputStream inputStream= null;
        try {
            inputStream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook workbook= null;
        try {
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet sheet=workbook.getSheet(sheetName);
        int rowCount=sheet.getLastRowNum()+1;
        System.out.println("it has "+rowCount+" row in the sheet");
        List<String> list=new ArrayList<>();
        for (int i=0; i<rowCount; i++){
            XSSFRow row=sheet.getRow(i);
            if (row==null){
                System.out.println("Empty row");
            }else {
                XSSFCell cell = row.getCell(columnIndex);
                list.add(new String(cell.getStringCellValue()));
            }
        }
        return list;
    }

    public void writeToExcel(){

    }


    public static void main(String[] args) {
        ProjectUtility utility=new ProjectUtility();
        System.out.println(utility.multipleReadFromExcel("testdata\\cubecart.xlsx",
                "Review",1));
    }


}
