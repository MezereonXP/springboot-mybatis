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
  private double lat;
  private double lon;
  private String teamName;
  private String positionName;
  private String sourceType;
  private Date samplingDate;
  private String generalComments;
  private String probComment;

  public ShowForIndex(String teamName, Location location, SampleWithBLOBs sample, Map<Integer, String> choose){
    this.lat = location.getLat();
    this.lon = location.getLon();
    this.teamName = teamName;
    this.positionName = location.getLocationname();
    this.samplingDate = sample.getSamplingdate();
    this.generalComments = sample.getGeneralcomments();
    this.sourceType = choose.get(sample.getWatersourcetype());
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
}
