package org.spring.springboot.domain;

public class Turbidity {
    private Integer turbidityId;

    private String turbidityDesc;

    private Float turbidityValue;

    private String turbiditymethod;

    public Integer getTurbidityId() {
        return turbidityId;
    }

    public void setTurbidityId(Integer turbidityId) {
        this.turbidityId = turbidityId;
    }

    public String getTurbidityDesc() {
        return turbidityDesc;
    }

    public void setTurbidityDesc(String turbidityDesc) {
        this.turbidityDesc = turbidityDesc == null ? null : turbidityDesc.trim();
    }

    public Float getTurbidityValue() {
        return turbidityValue;
    }

    public void setTurbidityValue(Float turbidityValue) {
        this.turbidityValue = turbidityValue;
    }

    public String getTurbiditymethod() {
        return turbiditymethod;
    }

    public void setTurbiditymethod(String turbiditymethod) {
        this.turbiditymethod = turbiditymethod == null ? null : turbiditymethod.trim();
    }
}