package org.spring.springboot.domain;

public class HealthCenter {
    private Integer healthCenterId;

    private String healthCenterDesc;

    private Integer visible;

    public Integer getHealthCenterId() {
        return healthCenterId;
    }

    public void setHealthCenterId(Integer healthCenterId) {
        this.healthCenterId = healthCenterId;
    }

    public String getHealthCenterDesc() {
        return healthCenterDesc;
    }

    public void setHealthCenterDesc(String healthCenterDesc) {
        this.healthCenterDesc = healthCenterDesc == null ? null : healthCenterDesc.trim();
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }
}