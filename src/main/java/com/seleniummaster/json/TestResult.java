package com.seleniummaster.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TestResult {
    @JsonProperty("tests")
    private List<TestResultObject> testResultObjectlist;
    @JsonProperty("test-start-time")
    private String testStartTime;
    @JsonProperty("test-end-time")
    private String testEndTime;
    @JsonProperty("test-excuted-by")
    private String testExcutedBy;

    public TestResult() {
    }

    public TestResult(List<TestResultObject> testResultObjects, String testStartTime, String testEndTime, String testExcutedBy) {
        this.testResultObjectlist = testResultObjects;
        this.testStartTime = testStartTime;
        this.testEndTime = testEndTime;
        this.testExcutedBy = testExcutedBy;
    }

    public List<TestResultObject> getTestResultObjectlist() {
        return testResultObjectlist;
    }

    public void setTestResultObjectlist(List<TestResultObject> testResultObjectlist) {
        this.testResultObjectlist = testResultObjectlist;
    }

    public String getTestStartTime() {
        return testStartTime;
    }

    public void setTestStartTime(String testStartTime) {
        this.testStartTime = testStartTime;
    }

    public String getTestEndTime() {
        return testEndTime;
    }

    public void setTestEndTime(String testEndTime) {
        this.testEndTime = testEndTime;
    }

    public String getTestExcutedBy() {
        return testExcutedBy;
    }

    public void setTestExcutedBy(String testExcutedBy) {
        this.testExcutedBy = testExcutedBy;
    }
}
