package org.spring.springboot.domain;

public class Smell {
    private Integer smellId;

    private String smellDesc;

    private String smellDescDetails;

    private Integer visible;

    public Integer getSmellId() {
        return smellId;
    }

    public void setSmellId(Integer smellId) {
        this.smellId = smellId;
    }

    public String getSmellDesc() {
        return smellDesc;
    }

    public void setSmellDesc(String smellDesc) {
        this.smellDesc = smellDesc == null ? null : smellDesc.trim();
    }

    public String getSmellDescDetails() {
        return smellDescDetails;
    }

    public void setSmellDescDetails(String smellDescDetails) {
        this.smellDescDetails = smellDescDetails == null ? null : smellDescDetails.trim();
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }
}