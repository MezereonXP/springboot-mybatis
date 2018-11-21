package org.spring.springboot.domain;

public class CentralizedTreatmentMethod {
    private Integer centrTreatmentMethodId;

    private String centrTreatmentMethodDesc;

    private Integer visible;

    public Integer getCentrTreatmentMethodId() {
        return centrTreatmentMethodId;
    }

    public void setCentrTreatmentMethodId(Integer centrTreatmentMethodId) {
        this.centrTreatmentMethodId = centrTreatmentMethodId;
    }

    public String getCentrTreatmentMethodDesc() {
        return centrTreatmentMethodDesc;
    }

    public void setCentrTreatmentMethodDesc(String centrTreatmentMethodDesc) {
        this.centrTreatmentMethodDesc = centrTreatmentMethodDesc == null ? null : centrTreatmentMethodDesc.trim();
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }
}