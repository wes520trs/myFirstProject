package com.seleniummaster.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonWriteDemo2 {
    public static void main(String[] args) {
        User user1=new User("testautomation","automation123!","Admin","22");
        User user2=new User("testautomation1","automation123!","Student","20");
        User user3=new User("testautomation2","automation123!","Manager","25");
        List<User> users=new ArrayList<>();
        users.addAll(Arrays.asList(user1,user2,user3));
        Users loginUsers=new Users(users);
        ObjectMapper mapper=new ObjectMapper();
//        String objectValue=mapper.writeValueAsString(loginUsers);
        String objectValue=null;
        try {
            objectValue=mapper.writeValueAsString(loginUsers);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
//        FileUtils.writeStringToFile(new File("testdata/loginUsers.json"),objectValue);
        try {
            FileUtils.writeStringToFile(new File("testdata1/loginUsers1.json"),objectValue);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
