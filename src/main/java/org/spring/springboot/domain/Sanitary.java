package org.spring.springboot.domain;

public class Sanitary {
    private Integer sanitaryTypeId;

    private String sanitaryTypeDesc;

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
}