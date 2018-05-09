package org.spring.springboot.domain;

public class TestCycle {
    private Integer testcycleid;

    private String testcyclename;

    private String testcycledescribe;

    public Integer getTestcycleid() {
        return testcycleid;
    }

    public void setTestcycleid(Integer testcycleid) {
        this.testcycleid = testcycleid;
    }

    public String getTestcyclename() {
        return testcyclename;
    }

    public void setTestcyclename(String testcyclename) {
        this.testcyclename = testcyclename == null ? null : testcyclename.trim();
    }

    public String getTestcycledescribe() {
        return testcycledescribe;
    }

    public void setTestcycledescribe(String testcycledescribe) {
        this.testcycledescribe = testcycledescribe == null ? null : testcycledescribe.trim();
    }
}