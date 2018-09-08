package org.spring.springboot.domain;

public class WaterType {
    private Integer waterTypeId;

    private String waterTypeDesc;

    public Integer getWaterTypeId() {
        return waterTypeId;
    }

    public void setWaterTypeId(Integer waterTypeId) {
        this.waterTypeId = waterTypeId;
    }

    public String getWaterTypeDesc() {
        return waterTypeDesc;
    }

    public void setWaterTypeDesc(String waterTypeDesc) {
        this.waterTypeDesc = waterTypeDesc == null ? null : waterTypeDesc.trim();
    }
}