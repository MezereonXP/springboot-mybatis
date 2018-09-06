package org.spring.springboot.domain;

public class HealthCenter {
    private Integer healthCenterId;

    private String healthCenterDesc;

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
}