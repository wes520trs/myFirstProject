package com.seleniummaster.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;

public class CSVFileReader {
    public static void main(String[] args) {
        Reader reader=null;
//        Reader reader=new FileReader("Test result"+ File.separator+"login.csv");
        try {
            reader=new FileReader("Test result"+ File.separator+"login.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        Iterable<CSVRecord> records= (CSVFormat.RFC4180.withHeader("username", "password").parse(reader));
        Iterable<CSVRecord> records=null;
        try {
            records= (CSVFormat.RFC4180.withHeader("username", "password","phonenumber","email").parse(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (CSVRecord record:records) {
            String username=record.get("username");
            String password=record.get("password");
            String phonenumber=record.get("phonenumber");
            String email=record.get("email");
            System.out.println(String.format("%s %s %s %s",username,password,phonenumber,email));
        }
    }
}
