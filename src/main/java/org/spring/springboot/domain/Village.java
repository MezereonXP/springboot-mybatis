package org.spring.springboot.domain;

public class Village {
    private Integer villageid;

    private Integer townid;

    private String villagename;

    private String description;

    public Integer getVillageid() {
        return villageid;
    }

    public void setVillageid(Integer villageid) {
        this.villageid = villageid;
    }

    public Integer getTownid() {
        return townid;
    }

    public void setTownid(Integer townid) {
        this.townid = townid;
    }

    public String getVillagename() {
        return villagename;
    }

    public void setVillagename(String villagename) {
        this.villagename = villagename == null ? null : villagename.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}