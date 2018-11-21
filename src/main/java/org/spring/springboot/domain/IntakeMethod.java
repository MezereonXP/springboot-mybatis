package org.spring.springboot.domain;

public class IntakeMethod {
    private Integer intakeMethodId;

    private String intakeMethodDesc;

    private Integer visible;

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

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }
}