package org.spring.springboot.domain;

/**
 * @program: Statistics
 * @description: Statistics for year
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/10/5
 **/
public class Statistics {
    private int teamCount;
    private int provinceCount;
    private int prefectureCount;
    private int countyCount;
    private int sampleCount;

    public int getTeamCount() {
        return teamCount;
    }

    public void setTeamCount(int teamCount) {
        this.teamCount = teamCount;
    }

    public int getProvinceCount() {
        return provinceCount;
    }

    public void setProvinceCount(int provinceCount) {
        this.provinceCount = provinceCount;
    }

    public int getPrefectureCount() {
        return prefectureCount;
    }

    public void setPrefectureCount(int prefectureCount) {
        this.prefectureCount = prefectureCount;
    }

    public int getCountyCount() {
        return countyCount;
    }

    public void setCountyCount(int countyCount) {
        this.countyCount = countyCount;
    }

    public int getSampleCount() {
        return sampleCount;
    }

    public void setSampleCount(int sampleCount) {
        this.sampleCount = sampleCount;
    }

}
