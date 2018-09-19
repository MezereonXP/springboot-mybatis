package org.spring.springboot.domain;

public class PotentialContam {
    private Integer contamId;

    private String contamDesc;

    public Integer getContamId() {
        return contamId;
    }

    public void setContamId(Integer contamId) {
        this.contamId = contamId;
    }

    public String getContamDesc() {
        return contamDesc;
    }

    public void setContamDesc(String contamDesc) {
        this.contamDesc = contamDesc == null ? null : contamDesc.trim();
    }
}