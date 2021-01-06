package com.seleniummaster.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVFileUtility {
    public List<String> readCSVFile(String filePath, String fileName, String headerName) {
        List<String> values=new ArrayList<>();

        Reader reader=null;
//        Reader reader=new FileReader("Test result"+ File.separator+"login.csv");
        try {
            reader=new FileReader(filePath+ File.separator+fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        Iterable<CSVRecord> records= (CSVFormat.RFC4180.withHeader("username", "password").parse(reader));
        Iterable<CSVRecord> records=null;
        try {
            // withFirstRecordAsHeader() header is not read as member
            records= (CSVFormat.RFC4180.withFirstRecordAsHeader().parse(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (CSVRecord record:records) {
            String contents=record.get(headerName);
            values.add(contents);

        }return values;
    }
}
