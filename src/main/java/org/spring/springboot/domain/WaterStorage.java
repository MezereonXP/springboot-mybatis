package org.spring.springboot.domain;

public class WaterStorage {
    private Integer waterStorageId;

    private String waterStorageDesc;

    private Integer avgStorageHrs;

    private Integer visible;

    public Integer getWaterStorageId() {
        return waterStorageId;
    }

    public void setWaterStorageId(Integer waterStorageId) {
        this.waterStorageId = waterStorageId;
    }

    public String getWaterStorageDesc() {
        return waterStorageDesc;
    }

    public void setWaterStorageDesc(String waterStorageDesc) {
        this.waterStorageDesc = waterStorageDesc == null ? null : waterStorageDesc.trim();
    }

    public Integer getAvgStorageHrs() {
        return avgStorageHrs;
    }

    public void setAvgStorageHrs(Integer avgStorageHrs) {
        this.avgStorageHrs = avgStorageHrs;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }
}