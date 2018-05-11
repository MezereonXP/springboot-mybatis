package org.spring.springboot.domain;

public class Township {
    private Integer townid;

    private Integer countyid;

    private String townname;

    private String description;

    public Integer getTownid() {
        return townid;
    }

    public void setTownid(Integer townid) {
        this.townid = townid;
    }

    public Integer getCountyid() {
        return countyid;
    }

    public void setCountyid(Integer countyid) {
        this.countyid = countyid;
    }

    public String getTownname() {
        return townname;
    }

    public void setTownname(String townname) {
        this.townname = townname == null ? null : townname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}