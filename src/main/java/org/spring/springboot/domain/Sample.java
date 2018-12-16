package org.spring.springboot.domain;

import java.util.Date;

public class Sample {
    private Integer baseId;

    private Integer waterId;

    private Integer waterTypeId;

    private Integer validationId;

    private Integer locationId;

    private Integer cycleTeamId;

    private Integer drinkingWaterId;

    private Integer waterSourceTypeId;

    private String waterSourceDetails;

    private Integer deliveryMethodId;

    private Integer inTakeMethodId;

    private String centralizedWaterTreatmentMethodId;

    private String treatmentMethodId;

    private String waterStorageId;

    private String waterShortage;

    private String potentialContamination;

    private String potentialContaminationDistance;

    private Integer populationServedBySource;

    private Integer physicalIndicators;

    private Float temp;

    private Integer smellId;

    private String smellDetail;

    private Integer visualId;

    private String visualDetail;

    private String otherInformation;

    private String turbidityId;

    private String turbidityDetail;

    private Float feElement;

    private String feMethod;

    private Float cr6Element;

    private String cr6Method;

    private Float asElement;

    private String asMethod;

    private Float mnElement;

    private String mnMethod;

    private Float residualChlorineElement;

    private String residualChlorineMethod;

    private Float dissolvedOxygenElement;

    private String dissolvedOxygenMethod;

    private Float no2Element;

    private String no2Method;

    private Float no3Element;

    private Integer no3Dilutionrate;

    private Float no3Original;

    private String no3Method;

    private Float codElement;

    private String codMethod;

    private Float fElement;

    private Integer fDilutionrate;

    private Float fOriginal;

    private String fMethod;

    private Float nh3Element;

    private Integer nh3Dilutionrate;

    private Float nh3Original;

    private String nh3Method;

    private Float phElement;

    private String phMethod;

    private Float tdsElement;

    private String tdsMethod;

    private Float ecoilElement;

    private String ecoilMethod;

    private Float ammoniaNitrogenElement;

    private String ammoniaNitrogenMethod;

    private String ammoniaNitrogenDescription;

    private Float tetcNumberElement;

    private String tetcNumberDescription;

    private String additionalParameter1;

    private Float additionalValue1;

    private String additionalMethod1;

    private String additionalUnit1;

    private String additionalParameter2;

    private Float additionalValue2;

    private String additionalMethod2;

    private String additionalUnit2;

    private Integer sanitaryScore1;

    private Integer sanitaryScore2;

    private Integer sanitaryScore3;

    private Integer sanitaryScore4;

    private Integer sanitaryScore5;

    private Integer sanitaryScore6;

    private Integer sanitaryScore7;

    private Integer sanitaryScore8;

    private Integer sanitaryScore9;

    private Integer sanitaryScore10;

    private Integer sanitaryScore11;

    private Integer sanitaryTypeId;

    private Integer sanitaryScore;

    private Date samplingDate;

    private Date detectDate;

    private String picture;

    private String generalComments;

    private String waterQDeterminationComments;

    private String probComments;

    private String challengesComments;

    private String needsComments;

    private String healthCenterId;

    private String waterCollector;

    private Integer distanceWaterCollection;

    private Integer waterWaitTime;

    private String diarrheaCause;

    private Integer waterSatisfaction;

    private String notes;

    private String averageStorageHours;

    private Date createTime;

    private Date updateTime;

    public Integer getBaseId() {
        return baseId;
    }

    public void setBaseId(Integer baseId) {
        this.baseId = baseId;
    }

    public Integer getWaterId() {
        return waterId;
    }

    public void setWaterId(Integer waterId) {
        this.waterId = waterId;
    }

    public Integer getWaterTypeId() {
        return waterTypeId;
    }

    public void setWaterTypeId(Integer waterTypeId) {
        this.waterTypeId = waterTypeId;
    }

    public Integer getValidationId() {
        return validationId;
    }

    public void setValidationId(Integer validationId) {
        this.validationId = validationId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getCycleTeamId() {
        return cycleTeamId;
    }

    public void setCycleTeamId(Integer cycleTeamId) {
        this.cycleTeamId = cycleTeamId;
    }

    public Integer getDrinkingWaterId() {
        return drinkingWaterId;
    }

    public void setDrinkingWaterId(Integer drinkingWaterId) {
        this.drinkingWaterId = drinkingWaterId;
    }

    public Integer getWaterSourceTypeId() {
        return waterSourceTypeId;
    }

    public void setWaterSourceTypeId(Integer waterSourceTypeId) {
        this.waterSourceTypeId = waterSourceTypeId;
    }

    public String getWaterSourceDetails() {
        return waterSourceDetails;
    }

    public void setWaterSourceDetails(String waterSourceDetails) {
        this.waterSourceDetails = waterSourceDetails == null ? null : waterSourceDetails.trim();
    }

    public Integer getDeliveryMethodId() {
        return deliveryMethodId;
    }

    public void setDeliveryMethodId(Integer deliveryMethodId) {
        this.deliveryMethodId = deliveryMethodId;
    }

    public Integer getInTakeMethodId() {
        return inTakeMethodId;
    }

    public void setInTakeMethodId(Integer inTakeMethodId) {
        this.inTakeMethodId = inTakeMethodId;
    }

    public String getCentralizedWaterTreatmentMethodId() {
        return centralizedWaterTreatmentMethodId;
    }

    public void setCentralizedWaterTreatmentMethodId(String centralizedWaterTreatmentMethodId) {
        this.centralizedWaterTreatmentMethodId = centralizedWaterTreatmentMethodId == null ? null : centralizedWaterTreatmentMethodId.trim();
    }

    public String getTreatmentMethodId() {
        return treatmentMethodId;
    }

    public void setTreatmentMethodId(String treatmentMethodId) {
        this.treatmentMethodId = treatmentMethodId == null ? null : treatmentMethodId.trim();
    }

    public String getWaterStorageId() {
        return waterStorageId;
    }

    public void setWaterStorageId(String waterStorageId) {
        this.waterStorageId = waterStorageId == null ? null : waterStorageId.trim();
    }

    public String getWaterShortage() {
        return waterShortage;
    }

    public void setWaterShortage(String waterShortage) {
        this.waterShortage = waterShortage == null ? null : waterShortage.trim();
    }

    public String getPotentialContamination() {
        return potentialContamination;
    }

    public void setPotentialContamination(String potentialContamination) {
        this.potentialContamination = potentialContamination == null ? null : potentialContamination.trim();
    }

    public String getPotentialContaminationDistance() {
        return potentialContaminationDistance;
    }

    public void setPotentialContaminationDistance(String potentialContaminationDistance) {
        this.potentialContaminationDistance = potentialContaminationDistance == null ? null : potentialContaminationDistance.trim();
    }

    public Integer getPopulationServedBySource() {
        return populationServedBySource;
    }

    public void setPopulationServedBySource(Integer populationServedBySource) {
        this.populationServedBySource = populationServedBySource;
    }

    public Integer getPhysicalIndicators() {
        return physicalIndicators;
    }

    public void setPhysicalIndicators(Integer physicalIndicators) {
        this.physicalIndicators = physicalIndicators;
    }

    public Float getTemp() {
        return temp;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }

    public Integer getSmellId() {
        return smellId;
    }

    public void setSmellId(Integer smellId) {
        this.smellId = smellId;
    }

    public String getSmellDetail() {
        return smellDetail;
    }

    public void setSmellDetail(String smellDetail) {
        this.smellDetail = smellDetail == null ? null : smellDetail.trim();
    }

    public Integer getVisualId() {
        return visualId;
    }

    public void setVisualId(Integer visualId) {
        this.visualId = visualId;
    }

    public String getVisualDetail() {
        return visualDetail;
    }

    public void setVisualDetail(String visualDetail) {
        this.visualDetail = visualDetail == null ? null : visualDetail.trim();
    }

    public String getOtherInformation() {
        return otherInformation;
    }

    public void setOtherInformation(String otherInformation) {
        this.otherInformation = otherInformation == null ? null : otherInformation.trim();
    }

    public String getTurbidityId() {
        return turbidityId;
    }

    public void setTurbidityId(String turbidityId) {
        this.turbidityId = turbidityId == null ? null : turbidityId.trim();
    }

    public String getTurbidityDetail() {
        return turbidityDetail;
    }

    public void setTurbidityDetail(String turbidityDetail) {
        this.turbidityDetail = turbidityDetail == null ? null : turbidityDetail.trim();
    }

    public Float getFeElement() {
        return feElement;
    }

    public void setFeElement(Float feElement) {
        this.feElement = feElement;
    }

    public String getFeMethod() {
        return feMethod;
    }

    public void setFeMethod(String feMethod) {
        this.feMethod = feMethod == null ? null : feMethod.trim();
    }

    public Float getCr6Element() {
        return cr6Element;
    }

    public void setCr6Element(Float cr6Element) {
        this.cr6Element = cr6Element;
    }

    public String getCr6Method() {
        return cr6Method;
    }

    public void setCr6Method(String cr6Method) {
        this.cr6Method = cr6Method == null ? null : cr6Method.trim();
    }

    public Float getAsElement() {
        return asElement;
    }

    public void setAsElement(Float asElement) {
        this.asElement = asElement;
    }

    public String getAsMethod() {
        return asMethod;
    }

    public void setAsMethod(String asMethod) {
        this.asMethod = asMethod == null ? null : asMethod.trim();
    }

    public Float getMnElement() {
        return mnElement;
    }

    public void setMnElement(Float mnElement) {
        this.mnElement = mnElement;
    }

    public String getMnMethod() {
        return mnMethod;
    }

    public void setMnMethod(String mnMethod) {
        this.mnMethod = mnMethod == null ? null : mnMethod.trim();
    }

    public Float getResidualChlorineElement() {
        return residualChlorineElement;
    }

    public void setResidualChlorineElement(Float residualChlorineElement) {
        this.residualChlorineElement = residualChlorineElement;
    }

    public String getResidualChlorineMethod() {
        return residualChlorineMethod;
    }

    public void setResidualChlorineMethod(String residualChlorineMethod) {
        this.residualChlorineMethod = residualChlorineMethod == null ? null : residualChlorineMethod.trim();
    }

    public Float getDissolvedOxygenElement() {
        return dissolvedOxygenElement;
    }

    public void setDissolvedOxygenElement(Float dissolvedOxygenElement) {
        this.dissolvedOxygenElement = dissolvedOxygenElement;
    }

    public String getDissolvedOxygenMethod() {
        return dissolvedOxygenMethod;
    }

    public void setDissolvedOxygenMethod(String dissolvedOxygenMethod) {
        this.dissolvedOxygenMethod = dissolvedOxygenMethod == null ? null : dissolvedOxygenMethod.trim();
    }

    public Float getNo2Element() {
        return no2Element;
    }

    public void setNo2Element(Float no2Element) {
        this.no2Element = no2Element;
    }

    public String getNo2Method() {
        return no2Method;
    }

    public void setNo2Method(String no2Method) {
        this.no2Method = no2Method == null ? null : no2Method.trim();
    }

    public Float getNo3Element() {
        return no3Element;
    }

    public void setNo3Element(Float no3Element) {
        this.no3Element = no3Element;
    }

    public Integer getNo3Dilutionrate() {
        return no3Dilutionrate;
    }

    public void setNo3Dilutionrate(Integer no3Dilutionrate) {
        this.no3Dilutionrate = no3Dilutionrate;
    }

    public Float getNo3Original() {
        return no3Original;
    }

    public void setNo3Original(Float no3Original) {
        this.no3Original = no3Original;
    }

    public String getNo3Method() {
        return no3Method;
    }

    public void setNo3Method(String no3Method) {
        this.no3Method = no3Method == null ? null : no3Method.trim();
    }

    public Float getCodElement() {
        return codElement;
    }

    public void setCodElement(Float codElement) {
        this.codElement = codElement;
    }

    public String getCodMethod() {
        return codMethod;
    }

    public void setCodMethod(String codMethod) {
        this.codMethod = codMethod == null ? null : codMethod.trim();
    }

    public Float getfElement() {
        return fElement;
    }

    public void setfElement(Float fElement) {
        this.fElement = fElement;
    }

    public Integer getfDilutionrate() {
        return fDilutionrate;
    }

    public void setfDilutionrate(Integer fDilutionrate) {
        this.fDilutionrate = fDilutionrate;
    }

    public Float getfOriginal() {
        return fOriginal;
    }

    public void setfOriginal(Float fOriginal) {
        this.fOriginal = fOriginal;
    }

    public String getfMethod() {
        return fMethod;
    }

    public void setfMethod(String fMethod) {
        this.fMethod = fMethod == null ? null : fMethod.trim();
    }

    public Float getNh3Element() {
        return nh3Element;
    }

    public void setNh3Element(Float nh3Element) {
        this.nh3Element = nh3Element;
    }

    public Integer getNh3Dilutionrate() {
        return nh3Dilutionrate;
    }

    public void setNh3Dilutionrate(Integer nh3Dilutionrate) {
        this.nh3Dilutionrate = nh3Dilutionrate;
    }

    public Float getNh3Original() {
        return nh3Original;
    }

    public void setNh3Original(Float nh3Original) {
        this.nh3Original = nh3Original;
    }

    public String getNh3Method() {
        return nh3Method;
    }

    public void setNh3Method(String nh3Method) {
        this.nh3Method = nh3Method == null ? null : nh3Method.trim();
    }

    public Float getPhElement() {
        return phElement;
    }

    public void setPhElement(Float phElement) {
        this.phElement = phElement;
    }

    public String getPhMethod() {
        return phMethod;
    }

    public void setPhMethod(String phMethod) {
        this.phMethod = phMethod == null ? null : phMethod.trim();
    }

    public Float getTdsElement() {
        return tdsElement;
    }

    public void setTdsElement(Float tdsElement) {
        this.tdsElement = tdsElement;
    }

    public String getTdsMethod() {
        return tdsMethod;
    }

    public void setTdsMethod(String tdsMethod) {
        this.tdsMethod = tdsMethod == null ? null : tdsMethod.trim();
    }

    public Float getEcoilElement() {
        return ecoilElement;
    }

    public void setEcoilElement(Float ecoilElement) {
        this.ecoilElement = ecoilElement;
    }

    public String getEcoilMethod() {
        return ecoilMethod;
    }

    public void setEcoilMethod(String ecoilMethod) {
        this.ecoilMethod = ecoilMethod == null ? null : ecoilMethod.trim();
    }

    public Float getAmmoniaNitrogenElement() {
        return ammoniaNitrogenElement;
    }

    public void setAmmoniaNitrogenElement(Float ammoniaNitrogenElement) {
        this.ammoniaNitrogenElement = ammoniaNitrogenElement;
    }

    public String getAmmoniaNitrogenMethod() {
        return ammoniaNitrogenMethod;
    }

    public void setAmmoniaNitrogenMethod(String ammoniaNitrogenMethod) {
        this.ammoniaNitrogenMethod = ammoniaNitrogenMethod == null ? null : ammoniaNitrogenMethod.trim();
    }

    public String getAmmoniaNitrogenDescription() {
        return ammoniaNitrogenDescription;
    }

    public void setAmmoniaNitrogenDescription(String ammoniaNitrogenDescription) {
        this.ammoniaNitrogenDescription = ammoniaNitrogenDescription == null ? null : ammoniaNitrogenDescription.trim();
    }

    public Float getTetcNumberElement() {
        return tetcNumberElement;
    }

    public void setTetcNumberElement(Float tetcNumberElement) {
        this.tetcNumberElement = tetcNumberElement;
    }

    public String getTetcNumberDescription() {
        return tetcNumberDescription;
    }

    public void setTetcNumberDescription(String tetcNumberDescription) {
        this.tetcNumberDescription = tetcNumberDescription == null ? null : tetcNumberDescription.trim();
    }

    public String getAdditionalParameter1() {
        return additionalParameter1;
    }

    public void setAdditionalParameter1(String additionalParameter1) {
        this.additionalParameter1 = additionalParameter1 == null ? null : additionalParameter1.trim();
    }

    public Float getAdditionalValue1() {
        return additionalValue1;
    }

    public void setAdditionalValue1(Float additionalValue1) {
        this.additionalValue1 = additionalValue1;
    }

    public String getAdditionalMethod1() {
        return additionalMethod1;
    }

    public void setAdditionalMethod1(String additionalMethod1) {
        this.additionalMethod1 = additionalMethod1 == null ? null : additionalMethod1.trim();
    }

    public String getAdditionalUnit1() {
        return additionalUnit1;
    }

    public void setAdditionalUnit1(String additionalUnit1) {
        this.additionalUnit1 = additionalUnit1 == null ? null : additionalUnit1.trim();
    }

    public String getAdditionalParameter2() {
        return additionalParameter2;
    }

    public void setAdditionalParameter2(String additionalParameter2) {
        this.additionalParameter2 = additionalParameter2 == null ? null : additionalParameter2.trim();
    }

    public Float getAdditionalValue2() {
        return additionalValue2;
    }

    public void setAdditionalValue2(Float additionalValue2) {
        this.additionalValue2 = additionalValue2;
    }

    public String getAdditionalMethod2() {
        return additionalMethod2;
    }

    public void setAdditionalMethod2(String additionalMethod2) {
        this.additionalMethod2 = additionalMethod2 == null ? null : additionalMethod2.trim();
    }

    public String getAdditionalUnit2() {
        return additionalUnit2;
    }

    public void setAdditionalUnit2(String additionalUnit2) {
        this.additionalUnit2 = additionalUnit2 == null ? null : additionalUnit2.trim();
    }

    public Integer getSanitaryScore1() {
        return sanitaryScore1;
    }

    public void setSanitaryScore1(Integer sanitaryScore1) {
        this.sanitaryScore1 = sanitaryScore1;
    }

    public Integer getSanitaryScore2() {
        return sanitaryScore2;
    }

    public void setSanitaryScore2(Integer sanitaryScore2) {
        this.sanitaryScore2 = sanitaryScore2;
    }

    public Integer getSanitaryScore3() {
        return sanitaryScore3;
    }

    public void setSanitaryScore3(Integer sanitaryScore3) {
        this.sanitaryScore3 = sanitaryScore3;
    }

    public Integer getSanitaryScore4() {
        return sanitaryScore4;
    }

    public void setSanitaryScore4(Integer sanitaryScore4) {
        this.sanitaryScore4 = sanitaryScore4;
    }

    public Integer getSanitaryScore5() {
        return sanitaryScore5;
    }

    public void setSanitaryScore5(Integer sanitaryScore5) {
        this.sanitaryScore5 = sanitaryScore5;
    }

    public Integer getSanitaryScore6() {
        return sanitaryScore6;
    }

    public void setSanitaryScore6(Integer sanitaryScore6) {
        this.sanitaryScore6 = sanitaryScore6;
    }

    public Integer getSanitaryScore7() {
        return sanitaryScore7;
    }

    public void setSanitaryScore7(Integer sanitaryScore7) {
        this.sanitaryScore7 = sanitaryScore7;
    }

    public Integer getSanitaryScore8() {
        return sanitaryScore8;
    }

    public void setSanitaryScore8(Integer sanitaryScore8) {
        this.sanitaryScore8 = sanitaryScore8;
    }

    public Integer getSanitaryScore9() {
        return sanitaryScore9;
    }

    public void setSanitaryScore9(Integer sanitaryScore9) {
        this.sanitaryScore9 = sanitaryScore9;
    }

    public Integer getSanitaryScore10() {
        return sanitaryScore10;
    }

    public void setSanitaryScore10(Integer sanitaryScore10) {
        this.sanitaryScore10 = sanitaryScore10;
    }

    public Integer getSanitaryScore11() {
        return sanitaryScore11;
    }

    public void setSanitaryScore11(Integer sanitaryScore11) {
        this.sanitaryScore11 = sanitaryScore11;
    }

    public Integer getSanitaryTypeId() {
        return sanitaryTypeId;
    }

    public void setSanitaryTypeId(Integer sanitaryTypeId) {
        this.sanitaryTypeId = sanitaryTypeId;
    }

    public Integer getSanitaryScore() {
        return sanitaryScore;
    }

    public void setSanitaryScore(Integer sanitaryScore) {
        this.sanitaryScore = sanitaryScore;
    }

    public Date getSamplingDate() {
        return samplingDate;
    }

    public void setSamplingDate(Date samplingDate) {
        this.samplingDate = samplingDate;
    }

    public Date getDetectDate() {
        return detectDate;
    }

    public void setDetectDate(Date detectDate) {
        this.detectDate = detectDate;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getGeneralComments() {
        return generalComments;
    }

    public void setGeneralComments(String generalComments) {
        this.generalComments = generalComments == null ? null : generalComments.trim();
    }

    public String getWaterQDeterminationComments() {
        return waterQDeterminationComments;
    }

    public void setWaterQDeterminationComments(String waterQDeterminationComments) {
        this.waterQDeterminationComments = waterQDeterminationComments == null ? null : waterQDeterminationComments.trim();
    }

    public String getProbComments() {
        return probComments;
    }

    public void setProbComments(String probComments) {
        this.probComments = probComments == null ? null : probComments.trim();
    }

    public String getChallengesComments() {
        return challengesComments;
    }

    public void setChallengesComments(String challengesComments) {
        this.challengesComments = challengesComments == null ? null : challengesComments.trim();
    }

    public String getNeedsComments() {
        return needsComments;
    }

    public void setNeedsComments(String needsComments) {
        this.needsComments = needsComments == null ? null : needsComments.trim();
    }

    public String getHealthCenterId() {
        return healthCenterId;
    }

    public void setHealthCenterId(String healthCenterId) {
        this.healthCenterId = healthCenterId == null ? null : healthCenterId.trim();
    }

    public String getWaterCollector() {
        return waterCollector;
    }

    public void setWaterCollector(String waterCollector) {
        this.waterCollector = waterCollector == null ? null : waterCollector.trim();
    }

    public Integer getDistanceWaterCollection() {
        return distanceWaterCollection;
    }

    public void setDistanceWaterCollection(Integer distanceWaterCollection) {
        this.distanceWaterCollection = distanceWaterCollection;
    }

    public Integer getWaterWaitTime() {
        return waterWaitTime;
    }

    public void setWaterWaitTime(Integer waterWaitTime) {
        this.waterWaitTime = waterWaitTime;
    }

    public String getDiarrheaCause() {
        return diarrheaCause;
    }

    public void setDiarrheaCause(String diarrheaCause) {
        this.diarrheaCause = diarrheaCause == null ? null : diarrheaCause.trim();
    }

    public Integer getWaterSatisfaction() {
        return waterSatisfaction;
    }

    public void setWaterSatisfaction(Integer waterSatisfaction) {
        this.waterSatisfaction = waterSatisfaction;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getAverageStorageHours() {
        return averageStorageHours;
    }

    public void setAverageStorageHours(String averageStorageHours) {
        this.averageStorageHours = averageStorageHours == null ? null : averageStorageHours.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}