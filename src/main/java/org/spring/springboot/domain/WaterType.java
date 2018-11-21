package org.spring.springboot.domain;

public class WaterType {
    private Integer waterTypeId;

    private String waterTypeDesc;

    private Integer visible;

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

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }
}