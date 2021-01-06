package com.onlinecourse.io;

import java.io.File;

public class DeleteFileDemo {
//run method
public static void main(String[] args) {
    deleteAFile("Test result\\test2020_12_09.txt");
}

    //delete a file
    public static void deleteAFile(String fileName){
        //get current project path
        String filePath=System.getProperty("user.dir");
        //create a new file object instance
        File file=new File(fileName);
        if (!file.exists()){
            System.out.println("File is not found.");
        }else {
            //delete a file
            System.out.println("File already exist, deleting the file...");
            file.delete();
        }
    }
}
