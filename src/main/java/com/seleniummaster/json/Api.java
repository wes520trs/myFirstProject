package com.seleniummaster.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Api {
    @JsonProperty("course title")
    private String courseTitle;
    @JsonProperty ("price")
    private String price;

    public Api() {
    }

    public Api(String courseTitle, String price) {
        this.courseTitle = courseTitle;
        this.price = price;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
