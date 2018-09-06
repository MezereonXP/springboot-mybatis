package org.spring.springboot.domain;

public class WaterSourceType {
    private Integer waterSourceId;

    private String waterSourceDesc;

    private String waterSourceDetails;

    public Integer getWaterSourceId() {
        return waterSourceId;
    }

    public void setWaterSourceId(Integer waterSourceId) {
        this.waterSourceId = waterSourceId;
    }

    public String getWaterSourceDesc() {
        return waterSourceDesc;
    }

    public void setWaterSourceDesc(String waterSourceDesc) {
        this.waterSourceDesc = waterSourceDesc == null ? null : waterSourceDesc.trim();
    }

    public String getWaterSourceDetails() {
        return waterSourceDetails;
    }

    public void setWaterSourceDetails(String waterSourceDetails) {
        this.waterSourceDetails = waterSourceDetails == null ? null : waterSourceDetails.trim();
    }
}