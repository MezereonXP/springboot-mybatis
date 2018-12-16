package org.spring.springboot.domain;

import java.util.Date;

public class SuperSample extends Sample {
    //location部分
    private Integer provinceId;

    private Integer prefectureId;

    private Integer countyId;

    private Integer townshipId;

    private Integer villageId;

    private String locationName;

    private Double lat;

    private Double log;

    private Integer status;

    private Integer blogId;

    //如果id不存在, 新建需要的信息
    private String waterTypeDesc;

    private String drinkWaterDesc;

    private String waterSourceDesc;

    private String deliveryMethodDesc;

    private String centrTreatmentMethodDesc;

    private String waterStorageDesc;

    private Integer AvgStorageHrs;

    private String treatmentMethodDesc;

    private String contamDesc;

    private String smellDescDetails;

    private String VisualDesc;

    private String sanitaryTypeDesc;

    private String turbiditymethod;

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getPrefectureId() {
        return prefectureId;
    }

    public void setPrefectureId(Integer prefectureId) {
        this.prefectureId = prefectureId;
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public Integer getTownshipId() {
        return townshipId;
    }

    public void setTownshipId(Integer townshipId) {
        this.townshipId = townshipId;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLog() {
        return log;
    }

    public void setLog(Double log) {
        this.log = log;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getWaterTypeDesc() {
        return waterTypeDesc;
    }

    public void setWaterTypeDesc(String waterTypeDesc) {
        this.waterTypeDesc = waterTypeDesc;
    }

    public String getDrinkWaterDesc() {
        return drinkWaterDesc;
    }

    public void setDrinkWaterDesc(String drinkWaterDesc) {
        this.drinkWaterDesc = drinkWaterDesc;
    }

    public String getWaterSourceDesc() {
        return waterSourceDesc;
    }

    public void setWaterSourceDesc(String waterSourceDesc) {
        this.waterSourceDesc = waterSourceDesc;
    }

    public String getDeliveryMethodDesc() {
        return deliveryMethodDesc;
    }

    public void setDeliveryMethodDesc(String deliveryMethodDesc) {
        this.deliveryMethodDesc = deliveryMethodDesc;
    }

    public String getCentrTreatmentMethodDesc() {
        return centrTreatmentMethodDesc;
    }

    public void setCentrTreatmentMethodDesc(String centrTreatmentMethodDesc) {
        this.centrTreatmentMethodDesc = centrTreatmentMethodDesc;
    }

    public String getWaterStorageDesc() {
        return waterStorageDesc;
    }

    public void setWaterStorageDesc(String waterStorageDesc) {
        this.waterStorageDesc = waterStorageDesc;
    }

    public Integer getAvgStorageHrs() {
        return AvgStorageHrs;
    }

    public void setAvgStorageHrs(Integer avgStorageHrs) {
        AvgStorageHrs = avgStorageHrs;
    }

    public String getTreatmentMethodDesc() {
        return treatmentMethodDesc;
    }

    public void setTreatmentMethodDesc(String treatmentMethodDesc) {
        this.treatmentMethodDesc = treatmentMethodDesc;
    }

    public String getContamDesc() {
        return contamDesc;
    }

    public void setContamDesc(String contamDesc) {
        this.contamDesc = contamDesc;
    }

    public String getSmellDescDetails() {
        return smellDescDetails;
    }

    public void setSmellDescDetails(String smellDescDetails) {
        this.smellDescDetails = smellDescDetails;
    }

    public String getVisualDesc() {
        return VisualDesc;
    }

    public void setVisualDesc(String visualDesc) {
        VisualDesc = visualDesc;
    }

    public String getSanitaryTypeDesc() {
        return sanitaryTypeDesc;
    }

    public void setSanitaryTypeDesc(String sanitaryTypeDesc) {
        this.sanitaryTypeDesc = sanitaryTypeDesc;
    }

    public String getTurbiditymethod() {
        return turbiditymethod;
    }

    public void setTurbiditymethod(String turbiditymethod) {
        this.turbiditymethod = turbiditymethod;
    }
}
