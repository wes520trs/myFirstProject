package com.seleniummaster.excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriteDemo3 {
    public static void main(String[] args) throws IOException {
        Object studentInfo[][]={
                {"StudentID","StudentName","Score"},
                {"10","Tom","90"},
                {"11","Jerry","95"},
                {"12","David","98"}
        };
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Class-A");
        int rows=studentInfo.length;
        int columnCount=studentInfo[0].length;
        for (int r=0;r<rows;r++){
            XSSFRow row=sheet.createRow(r);

            for (int c=0;c<columnCount;c++){
                XSSFCell cell=row.createCell(c);
                Object content=studentInfo[r][c];
                if (content instanceof String) {
                    cell.setCellValue((String)content);
                }
                if (content instanceof Integer) {
                    cell.setCellValue((Integer)content);
                }
                if (content instanceof Boolean){
                    cell.setCellValue((Boolean)content);
                }
            }
        }
        String filePath="testdata/student-Info.xlsx";
        File file=new File(filePath);
        file.createNewFile();
        FileOutputStream outputStream=new FileOutputStream(file);
        workbook.write(outputStream);
        outputStream.close();

    }
}
