package org.spring.springboot.domain;

import java.util.Date;

public class Sample {
    private Integer baseid;

    private Integer locationid;

    private String teamname;

    private Date samplingdate;

    private Date detectdate;

    private String cycleteamid;

    public Integer getBaseid() {
        return baseid;
    }

    public void setBaseid(Integer baseid) {
        this.baseid = baseid;
    }

    public Integer getLocationid() {
        return locationid;
    }

    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname == null ? null : teamname.trim();
    }

    public Date getSamplingdate() {
        return samplingdate;
    }

    public void setSamplingdate(Date samplingdate) {
        this.samplingdate = samplingdate;
    }

    public Date getDetectdate() {
        return detectdate;
    }

    public void setDetectdate(Date detectdate) {
        this.detectdate = detectdate;
    }

    public String getCycleteamid() {
        return cycleteamid;
    }

    public void setCycleteamid(String cycleteamid) {
        this.cycleteamid = cycleteamid == null ? null : cycleteamid.trim();
    }
}