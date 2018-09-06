package org.spring.springboot.domain;

public class TestCycle {
    private Integer testCycleId;

    private String testCycleName;

    private String testCycleDescribe;

    public Integer getTestCycleId() {
        return testCycleId;
    }

    public void setTestCycleId(Integer testCycleId) {
        this.testCycleId = testCycleId;
    }

    public String getTestCycleName() {
        return testCycleName;
    }

    public void setTestCycleName(String testCycleName) {
        this.testCycleName = testCycleName == null ? null : testCycleName.trim();
    }

    public String getTestCycleDescribe() {
        return testCycleDescribe;
    }

    public void setTestCycleDescribe(String testCycleDescribe) {
        this.testCycleDescribe = testCycleDescribe == null ? null : testCycleDescribe.trim();
    }
}