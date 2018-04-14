package org.spring.springboot.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Sample {
    private Integer baseid;

    private Integer watertype;

    private Integer locationid;

    private Integer watersourcetype;

    private String teamname;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd hh:mm:ss")
    private Date samplingdate;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd hh:mm:ss")
    private Date detectdate;

    private String cycleteamid;

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