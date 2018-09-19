package org.spring.springboot.domain;

public class DiarrheaCause {
    private Integer DHcauseID;

    private String DHDesc;

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
}