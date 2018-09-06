package org.spring.springboot.domain;

public class IntakeMethod {
    private Integer intakeMethodId;

    private String intakeMethodDesc;

    public Integer getIntakeMethodId() {
        return intakeMethodId;
    }

    public void setIntakeMethodId(Integer intakeMethodId) {
        this.intakeMethodId = intakeMethodId;
    }

    public String getIntakeMethodDesc() {
        return intakeMethodDesc;
    }

    public void setIntakeMethodDesc(String intakeMethodDesc) {
        this.intakeMethodDesc = intakeMethodDesc == null ? null : intakeMethodDesc.trim();
    }
}