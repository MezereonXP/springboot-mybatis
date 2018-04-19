package org.spring.springboot.domain;

public class SampleWithBLOBs extends Sample {
    private String watertype;

    private String watersourcedetails;

    private String watersourcetype;

    private String locationname;

    private String treatmentmethods;

    private String watershortage;

    private String picture;

    private String generalcomments;

    private String waterqdetermination;

    private String probcomment;

    public String getWatertype() {
        return watertype;
    }

    public void setWatertype(String watertype) {
        this.watertype = watertype == null ? null : watertype.trim();
    }

    public String getWatersourcedetails() {
        return watersourcedetails;
    }

    public void setWatersourcedetails(String watersourcedetails) {
        this.watersourcedetails = watersourcedetails == null ? null : watersourcedetails.trim();
    }

    public String getWatersourcetype() {
        return watersourcetype;
    }

    public void setWatersourcetype(String watersourcetype) {
        this.watersourcetype = watersourcetype == null ? null : watersourcetype.trim();
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname == null ? null : locationname.trim();
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
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
}