package org.spring.springboot.domain;

public class Method {
    private Integer methodId;

    private String methodType;

    private String methodValue;

    public Integer getMethodId() {
        return methodId;
    }

    public void setMethodId(Integer methodId) {
        this.methodId = methodId;
    }

    public String getMethodType() {
        return methodType;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType == null ? null : methodType.trim();
    }

    public String getMethodValue() {
        return methodValue;
    }

    public void setMethodValue(String methodValue) {
        this.methodValue = methodValue == null ? null : methodValue.trim();
    }
}