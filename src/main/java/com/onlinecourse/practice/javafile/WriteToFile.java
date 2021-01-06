package com.onlinecourse.practice.javafile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            //FileWriter writes to the file created by itself (create file at the same time)
            //but cannot create a folder, folder path should be correct
            FileWriter myWrite=new FileWriter("Practice\\mySecondFile.txt");
            myWrite.write("This is my second file writing in Java. \n" +
                    "I love Java. \n" +
                    "\n" +
                    "Java is interesting\n");
            myWrite.close();
            System.out.println("Successfully wrote to the file.");
        }catch (IOException e){
            System.out.println("An error uccered.");
            e.printStackTrace();
        }
    }
}
