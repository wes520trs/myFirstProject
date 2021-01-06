package com.seleniummaster.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonWriteDemo3 {
    public static void main(String[] args) {

        List<Api> apiCourses=new ArrayList<>();
        apiCourses.add(new Api("RestAssured-api_testing","50"));
        apiCourses.add(new Api("Soup-UI_Webervices_testing","100"));
        List<WebAutomation> webAutomationsCourse=new ArrayList<>();
        webAutomationsCourse.add(new WebAutomation("Selenium-Webdriver-Java","80"));
        webAutomationsCourse.add(new WebAutomation("Cypress","180"));
        webAutomationsCourse.add(new WebAutomation("BDD-Cucumber_Java","60"));

        Courses courses=new Courses(webAutomationsCourse,apiCourses);

        CourseInfo courseInfo=new CourseInfo("SDET trainig","Automation",
                "Dolkun Tarim","https://www.linkedIn.com",
                "https://seleniummaster.teachable.com/",courses);

        ObjectMapper objectMapper=new ObjectMapper();
//        objectMapper.writeValue(new File("testdata/course-detail.jason"),courseInfo);
        try {
            objectMapper.writeValue(new File("testdata/course-detail.json"),courseInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
