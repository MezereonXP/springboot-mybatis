package org.spring.springboot.domain;

import java.util.Date;

public class Sample {
    private Integer baseid;

    private Integer watertype;

    private Integer locationid;

    private Integer watersourcetype;

    private String teamname;

    private Date samplingDate;

    private Date detectDate;

    private Integer cycleTeamid;

    public Integer getBaseid() {
        return baseid;
    }

    public void setBaseid(Integer baseid) {
        this.baseid = baseid;
    }

    public Integer getWatertype() {
        return watertype;
    }

    public void setWatertype(Integer watertype) {
        this.watertype = watertype;
    }

    public Integer getLocationid() {
        return locationid;
    }

    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    public Integer getWatersourcetype() {
        return watersourcetype;
    }

    public void setWatersourcetype(Integer watersourcetype) {
        this.watersourcetype = watersourcetype;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname == null ? null : teamname.trim();
    }

    public Date getSamplingDate() {
        return samplingDate;
    }

    public void setSamplingDate(Date samplingDate) {
        this.samplingDate = samplingDate;
    }

    public Date getDetectDate() {
        return detectDate;
    }

    public void setDetectDate(Date detectDate) {
        this.detectDate = detectDate;
    }

    public Integer getCycleTeamid() {
        return cycleTeamid;
    }

    public void setCycleTeamid(Integer cycleTeamid) {
        this.cycleTeamid = cycleTeamid;
    }
}