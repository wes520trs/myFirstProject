package com.onlinecourse.io;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead01 {
    public static void main(String[] args) throws IOException {
        String filePath="Test\\ulkeKodlari.xlsx";
        FileInputStream stream=new FileInputStream(filePath);
        XSSFWorkbook workbook=new XSSFWorkbook(stream);
        XSSFSheet sheet=workbook.getSheet("kod");
        // get single value (cell)
//        XSSFRow row0=sheet.getRow(0);
//        XSSFCell cell0=row0.getCell(0);
//        System.out.println(cell0.getStringCellValue());
//        XSSFCell cell1=row0.getCell(1);
//        System.out.println(cell1.getStringCellValue());
//        XSSFRow row1=sheet.getRow(1);
//        XSSFCell cell11=row1.getCell(1);
//        System.out.println(cell11.getNumericCellValue());

        int rowNum=sheet.getLastRowNum();
        System.out.println("row number is: "+rowNum);
        int colNum=sheet.getRow(0).getLastCellNum();
        System.out.println("column number is: "+colNum);
        for (int r=0; r<rowNum; r++){
            XSSFRow row=sheet.getRow(r);
            for (int c=0; c<colNum; c++){
                XSSFCell cell=row.getCell(c);
                switch (cell.getCellType()){
                    case STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
                }
                System.out.print(" | ");
            }
            System.out.println();
        }

        //second sheet named: nufus
        //not: getNumericCellValue return type is double, not long
        String filepath2="Test\\ulkeKodlari.xlsx";
        FileInputStream stream2=new FileInputStream(filepath2);
        XSSFWorkbook workbook2=new XSSFWorkbook(stream2);
        XSSFSheet sheet2=workbook2.getSheet("nufus");
        int rowNum2=sheet2.getLastRowNum();
        System.out.println("sheet2 row number is: "+rowNum2);
        int colNum2=sheet2.getRow(0).getLastCellNum();
        System.out.println("sheet2 column number is: "+colNum2);
        for (int r2=0; r2<rowNum2; r2++){
            XSSFRow row2=sheet2.getRow(r2);
            for (int c2=0; c2<colNum2; c2++){
                XSSFCell cell2=row2.getCell(c2);
                switch (cell2.getCellType()){
                    case STRING:
                        System.out.print(cell2.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.print(cell2.getNumericCellValue());
                        break;

                }
                System.out.print(" <> ");
            }
            System.out.println();
        }
    }
}
