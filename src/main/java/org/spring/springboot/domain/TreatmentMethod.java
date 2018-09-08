package org.spring.springboot.domain;

public class TreatmentMethod {
    private Integer treatmentMethodId;

    private String treatmentMethodDesc;

    public Integer getTreatmentMethodId() {
        return treatmentMethodId;
    }

    public void setTreatmentMethodId(Integer treatmentMethodId) {
        this.treatmentMethodId = treatmentMethodId;
    }

    public String getTreatmentMethodDesc() {
        return treatmentMethodDesc;
    }

    public void setTreatmentMethodDesc(String treatmentMethodDesc) {
        this.treatmentMethodDesc = treatmentMethodDesc == null ? null : treatmentMethodDesc.trim();
    }
}