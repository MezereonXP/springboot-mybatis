package org.spring.springboot.domain;

public class SampleWithBLOBs extends Sample {
    private String watersourcedetails;

    private String treatmentmethods;

    private String watershortage;

    private String visualdescription;

    private String otherinformation;

    private String generalcomments;

    private String waterqdetermination;

    private String probcomment;

    private String challengescomments;

    private String needscomments;

    private String admincomm;

    private String userdefine;

    public String getWatersourcedetails() {
        return watersourcedetails;
    }

    public void setWatersourcedetails(String watersourcedetails) {
        this.watersourcedetails = watersourcedetails == null ? null : watersourcedetails.trim();
    }

    public String getTreatmentmethods() {
        return treatmentmethods;
    }

    public void setTreatmentmethods(String treatmentmethods) {
        this.treatmentmethods = treatmentmethods == null ? null : treatmentmethods.trim();
    }

    public String getWatershortage() {
        return watershortage;
    }

    public void setWatershortage(String watershortage) {
        this.watershortage = watershortage == null ? null : watershortage.trim();
    }

    public String getVisualdescription() {
        return visualdescription;
    }

    public void setVisualdescription(String visualdescription) {
        this.visualdescription = visualdescription == null ? null : visualdescription.trim();
    }

    public String getOtherinformation() {
        return otherinformation;
    }

    public void setOtherinformation(String otherinformation) {
        this.otherinformation = otherinformation == null ? null : otherinformation.trim();
    }

    public String getGeneralcomments() {
        return generalcomments;
    }

    public void setGeneralcomments(String generalcomments) {
        this.generalcomments = generalcomments == null ? null : generalcomments.trim();
    }

    public String getWaterqdetermination() {
        return waterqdetermination;
    }

    public void setWaterqdetermination(String waterqdetermination) {
        this.waterqdetermination = waterqdetermination == null ? null : waterqdetermination.trim();
    }

    public String getProbcomment() {
        return probcomment;
    }

    public void setProbcomment(String probcomment) {
        this.probcomment = probcomment == null ? null : probcomment.trim();
    }

    public String getChallengescomments() {
        return challengescomments;
    }

    public void setChallengescomments(String challengescomments) {
        this.challengescomments = challengescomments == null ? null : challengescomments.trim();
    }

    public String getNeedscomments() {
        return needscomments;
    }

    public void setNeedscomments(String needscomments) {
        this.needscomments = needscomments == null ? null : needscomments.trim();
    }

    public String getAdmincomm() {
        return admincomm;
    }

    public void setAdmincomm(String admincomm) {
        this.admincomm = admincomm == null ? null : admincomm.trim();
    }

    public String getUserdefine() {
        return userdefine;
    }

    public void setUserdefine(String userdefine) {
        this.userdefine = userdefine == null ? null : userdefine.trim();
    }
}