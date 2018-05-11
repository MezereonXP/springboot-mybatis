package org.spring.springboot.domain;

public class County {
    private Integer countyid;

    private Integer prefectureid;

    private String countyname;

    private String description;

    public Integer getCountyid() {
        return countyid;
    }

    public void setCountyid(Integer countyid) {
        this.countyid = countyid;
    }

    public Integer getPrefectureid() {
        return prefectureid;
    }

    public void setPrefectureid(Integer prefectureid) {
        this.prefectureid = prefectureid;
    }

    public String getCountyname() {
        return countyname;
    }

    public void setCountyname(String countyname) {
        this.countyname = countyname == null ? null : countyname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}