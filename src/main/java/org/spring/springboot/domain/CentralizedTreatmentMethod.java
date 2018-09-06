package org.spring.springboot.domain;

public class CentralizedTreatmentMethod {
    private Integer centrTreatmentMethodId;

    private String centrTreatmentMethodDesc;

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
}