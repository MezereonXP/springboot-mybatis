package org.spring.springboot.domain;

public class Visual {
    private Integer visualID;

    private String visualDesc;

    private String visualDescDetails;

    public Integer getVisualID() {
        return visualID;
    }

    public void setVisualID(Integer visualID) {
        this.visualID = visualID;
    }

    public String getVisualDesc() {
        return visualDesc;
    }

    public void setVisualDesc(String visualDesc) {
        this.visualDesc = visualDesc == null ? null : visualDesc.trim();
    }

    public String getVisualDescDetails() {
        return visualDescDetails;
    }

    public void setVisualDescDetails(String visualDescDetails) {
        this.visualDescDetails = visualDescDetails == null ? null : visualDescDetails.trim();
    }
}