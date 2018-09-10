package org.spring.springboot.domain;

import java.util.Date;

public class SampleDetails {
    private Sample sample;
    private String waterTypeDesc;
    private String drinkingWaterDesc;
    private String waterSourceDesc;
    private String deliveryMethodDesc;
    private String inTakeMethodDesc;
    private String centralizedWaterTreatmentMethodDesc;
    private String treatmentMethodDesc;
    private String waterStorageDesc;
    private String smellDesc;
    private String visualDesc;
    private Turbidity turbidity;
    private String sanitaryTypeDesc;
    private String healthCenterDesc;

    public void setSample(Sample sample) {
        this.sample = sample;
    }


    public void setWaterTypeDesc(String waterTypeDesc) {
        this.waterTypeDesc = waterTypeDesc;
    }

    public void setDrinkingWaterDesc(String drinkingWaterDesc) {
        this.drinkingWaterDesc = drinkingWaterDesc;
    }

    public void setWaterSourceDesc(String waterSourceDesc) {
        this.waterSourceDesc = waterSourceDesc;
    }

    public void setDeliveryMethodDesc(String deliveryMethodDesc) {
        this.deliveryMethodDesc = deliveryMethodDesc;
    }

    public void setInTakeMethodDesc(String inTakeMethodDesc) {
        this.inTakeMethodDesc = inTakeMethodDesc;
    }

    public void setCentralizedWaterTreatmentMethodDesc(String centralizedWaterTreatmentMethodDesc) {
        this.centralizedWaterTreatmentMethodDesc = centralizedWaterTreatmentMethodDesc;
    }

    public void setTreatmentMethodDesc(String treatmentMethodDesc) {
        this.treatmentMethodDesc = treatmentMethodDesc;
    }

    public void setWaterStorageDesc(String waterStorageDesc) {
        this.waterStorageDesc = waterStorageDesc;
    }

    public void setSmellDesc(String smellDesc) {
        this.smellDesc = smellDesc;
    }

    public void setVisualDesc(String visualDesc) {
        this.visualDesc = visualDesc;
    }

    public void setTurbidity(Turbidity turbidity) {
        this.turbidity = turbidity;
    }

    public void setSanitaryTypeDesc(String sanitaryTypeDesc) {
        this.sanitaryTypeDesc = sanitaryTypeDesc;
    }

    public void setHealthCenterDesc(String healthCenterDesc) {
        this.healthCenterDesc = healthCenterDesc;
    }

    public Sample getSample() {

        return sample;
    }


    public String getWaterTypeDesc() {
        return waterTypeDesc;
    }

    public String getDrinkingWaterDesc() {
        return drinkingWaterDesc;
    }

    public String getWaterSourceDesc() {
        return waterSourceDesc;
    }

    public String getDeliveryMethodDesc() {
        return deliveryMethodDesc;
    }

    public String getInTakeMethodDesc() {
        return inTakeMethodDesc;
    }

    public String getCentralizedWaterTreatmentMethodDesc() {
        return centralizedWaterTreatmentMethodDesc;
    }

    public String getTreatmentMethodDesc() {
        return treatmentMethodDesc;
    }

    public String getWaterStorageDesc() {
        return waterStorageDesc;
    }

    public String getSmellDesc() {
        return smellDesc;
    }

    public String getVisualDesc() {
        return visualDesc;
    }

    public Turbidity getTurbidity() {
        return turbidity;
    }

    public String getSanitaryTypeDesc() {
        return sanitaryTypeDesc;
    }

    public String getHealthCenterDesc() {
        return healthCenterDesc;
    }
}