package org.spring.springboot.domain;

public class PotentialContam {
    private Integer contamId;

    private String contamDesc;

    private Integer visible;

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

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }
}