package com.onlinecourse.practice.javafile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//There are many available classes in the Java API that can be used to read and write files in Java:
// FileReader, BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter,
// FileOutputStream, etc. Which one to use depends on the Java version you're working with
// and whether you need to read bytes or characters, and the size of the file/lines etc.

public class ReadFileWithScanner {
    public static void main(String[] args) {
        try {
            File file=new File("Practice\\mySecondFile.txt");
            Scanner myReader=new Scanner(file);
            while (myReader.hasNext()){
                String content=myReader.nextLine();
                System.out.println(content);
            }
            myReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("File can not found.");
            e.printStackTrace();
        }
    }
}
