package com.onlinecourse.practice.javafile;

import java.io.File;
import java.io.IOException;

public class CreateDirectoryAndFile {
    public static void main(String[] args) {
        String currentDir=System.getProperty("user.dir");
        File directory=new File("Practice"); //directory name
        boolean bool=directory.mkdir(); //create directory
        if (bool=true){
            System.out.println("directory created: "+directory.getName());
        }else {
            System.out.println("directory exist");
        }

        File file=new File("Practice\\myFirstFile.txt"); //file name
        try {
        if (file.createNewFile()){              //create file
            System.out.println("file created: "+file.getName());
        }else {
            System.out.println("file already exist.");
        }
    }catch (IOException e){
            System.out.println("an error occured.");
            e.printStackTrace();
        }
}
}
