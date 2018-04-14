package org.spring.springboot.domain;

public class SampleWithBLOBs extends Sample {
    private String watersourcedetails;

    private String locationname;

    private String treatmentmethods;

    private String watershortage;

    private String picture;

    private String generalComments;

    private String waterQDetermination;

    private String probComment;

    public String getWatersourcedetails() {
        return watersourcedetails;
    }

    public void setWatersourcedetails(String watersourcedetails) {
        this.watersourcedetails = watersourcedetails == null ? null : watersourcedetails.trim();
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

    public String getGeneralComments() {
        return generalComments;
    }

    public void setGeneralComments(String generalComments) {
        this.generalComments = generalComments == null ? null : generalComments.trim();
    }

    public String getWaterQDetermination() {
        return waterQDetermination;
    }

    public void setWaterQDetermination(String waterQDetermination) {
        this.waterQDetermination = waterQDetermination == null ? null : waterQDetermination.trim();
    }

    public String getProbComment() {
        return probComment;
    }

    public void setProbComment(String probComment) {
        this.probComment = probComment == null ? null : probComment.trim();
    }
}