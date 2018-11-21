package org.spring.springboot.domain;

public class WaterSourceType {
    private Integer waterSourceId;

    private String waterSourceDesc;

    private String waterSourceDetails;

    private Integer visible;

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

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }
}