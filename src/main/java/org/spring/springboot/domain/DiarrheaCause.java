package org.spring.springboot.domain;

public class DiarrheaCause {
    private Integer DHcauseID;

    private String DHDesc;

    private Integer visible;

    public Integer getDHcauseID() {
        return DHcauseID;
    }

    public void setDHcauseID(Integer DHcauseID) {
        this.DHcauseID = DHcauseID;
    }

    public String getDHDesc() {
        return DHDesc;
    }

    public void setDHDesc(String DHDesc) {
        this.DHDesc = DHDesc == null ? null : DHDesc.trim();
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }
}