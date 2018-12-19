package org.spring.springboot.dao;

import org.spring.springboot.domain.Location;
import org.spring.springboot.domain.Sample;

import java.util.Date;

/**
 * @program: CleanSample
 * @description: simple sample data
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/10/12
 **/
public class CleanSample {
    private Date samplingDate;
    private Date detectDate;
    private String locationName;
    private String picture;
    private Integer status;

    CleanSample() {

    }

    public CleanSample(Sample sample, Location location) {
        this.samplingDate = sample.getSamplingDate();
        this.detectDate = sample.getDetectDate();
        this.locationName = location.getLocationName();
        this.picture = sample.getPicture();
        this.status = sample.getValidationId();
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

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
