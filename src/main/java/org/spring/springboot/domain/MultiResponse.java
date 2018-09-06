package org.spring.springboot.domain;

public class MultiResponse {
    private Integer baseId;

    private Integer healthCenterId;

    private Integer treatmentMethodId;

    private Integer centreWaterTreatmentId;

    public Integer getBaseId() {
        return baseId;
    }

    public void setBaseId(Integer baseId) {
        this.baseId = baseId;
    }

    public Integer getHealthCenterId() {
        return healthCenterId;
    }

    public void setHealthCenterId(Integer healthCenterId) {
        this.healthCenterId = healthCenterId;
    }

    public Integer getTreatmentMethodId() {
        return treatmentMethodId;
    }

    public void setTreatmentMethodId(Integer treatmentMethodId) {
        this.treatmentMethodId = treatmentMethodId;
    }

    public Integer getCentreWaterTreatmentId() {
        return centreWaterTreatmentId;
    }

    public void setCentreWaterTreatmentId(Integer centreWaterTreatmentId) {
        this.centreWaterTreatmentId = centreWaterTreatmentId;
    }
}