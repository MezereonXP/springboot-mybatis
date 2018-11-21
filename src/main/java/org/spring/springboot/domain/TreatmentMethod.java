package org.spring.springboot.domain;

public class TreatmentMethod {
    private Integer treatmentMethodId;

    private String treatmentMethodDesc;

    private Integer visible;

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

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }
}