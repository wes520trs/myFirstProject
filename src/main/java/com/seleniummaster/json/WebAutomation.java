package com.seleniummaster.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebAutomation {
    @JsonProperty ("course title")
    private String courseTitle;
    @JsonProperty ("price")
    private String price;

    public WebAutomation() {
    }

    public WebAutomation(String courseTitle, String price) {
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
