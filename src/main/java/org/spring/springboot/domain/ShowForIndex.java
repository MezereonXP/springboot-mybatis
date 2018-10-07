package org.spring.springboot.domain;/**
 * Created by Administrator on 2018/5/13.
 */

import java.util.Date;
import java.util.Map;

/**
 * @program: ShowForIndex
 * @description: Bean with position and some useful infomations
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/5/13
 **/
public class ShowForIndex {
  private int id;
  private double lat;
  private double lon;
  private String teamName;
  private String positionName;
  private String sourceType;
  private Date samplingDate;
  private String generalComments;
  private String probComment;
  private String picture;

  public ShowForIndex(String teamName, Location location, Sample sample, String sourceType) {
    this.lat = location.getLat();
    this.lon = location.getLog();
    this.teamName = teamName;
    this.positionName = location.getLocationName();
    this.samplingDate = sample.getSamplingDate();
    this.generalComments = sample.getGeneralComments();
    this.sourceType = sourceType;
    this.picture = sample.getPicture();
  }

  public String getProbComment() {
    return probComment;
  }

  public void setProbComment(String probComment) {
    this.probComment = probComment;
  }

  public String getGeneralComments() {
    return generalComments;
  }

  public void setGeneralComments(String generalComments) {
    this.generalComments = generalComments;
  }

  public Date getSamplingDate() {
    return samplingDate;
  }

  public void setSamplingDate(Date samplingDate) {
    this.samplingDate = samplingDate;
  }

  public String getPositionName() {
    return positionName;
  }

  public void setPositionName(String positionName) {
    this.positionName = positionName;
  }

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public double getLon() {
    return lon;
  }

  public void setLon(double lon) {
    this.lon = lon;
  }

  public double getLat() {
    return lat;
  }

  public void setLat(double lat) {
    this.lat = lat;
  }

  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }
}
