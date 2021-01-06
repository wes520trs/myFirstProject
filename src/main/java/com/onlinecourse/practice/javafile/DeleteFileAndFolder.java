package com.onlinecourse.practice.javafile;

import java.io.File;

//delete a folder, it must be empty

public class DeleteFileAndFolder {
    public static void main(String[] args) {
        File file=new File("Practice\\mySecondFile.txt");
        if (file.delete()){
            System.out.println("Deleted the file: "+file.getName());
        }else
            System.out.println("Failed to delete the file");

        File folder=new File("Practice");
        if (folder.delete()){
            System.out.println("Deleted the folder: "+folder.getName());
        }else
            System.out.println("Failed to delete folder.");
    }
}
