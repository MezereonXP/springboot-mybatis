package org.spring.springboot.domain;

public class Sanitary {
    private Integer sanitaryTypeId;

    private String sanitaryTypeDesc;

    private Integer visible;

    public Integer getSanitaryTypeId() {
        return sanitaryTypeId;
    }

    public void setSanitaryTypeId(Integer sanitaryTypeId) {
        this.sanitaryTypeId = sanitaryTypeId;
    }

    public String getSanitaryTypeDesc() {
        return sanitaryTypeDesc;
    }

    public void setSanitaryTypeDesc(String sanitaryTypeDesc) {
        this.sanitaryTypeDesc = sanitaryTypeDesc == null ? null : sanitaryTypeDesc.trim();
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }
}