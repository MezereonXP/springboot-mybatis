package org.spring.springboot.domain;

public class CycleTeam {
    private Integer cycleteamid;

    private Integer testcycleid;

    private Integer teamid;

    private String report;

    private String cycleteamdescription;

    public Integer getCycleteamid() {
        return cycleteamid;
    }

    public void setCycleteamid(Integer cycleteamid) {
        this.cycleteamid = cycleteamid;
    }

    public Integer getTestcycleid() {
        return testcycleid;
    }

    public void setTestcycleid(Integer testcycleid) {
        this.testcycleid = testcycleid;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report == null ? null : report.trim();
    }

    public String getCycleteamdescription() {
        return cycleteamdescription;
    }

    public void setCycleteamdescription(String cycleteamdescription) {
        this.cycleteamdescription = cycleteamdescription == null ? null : cycleteamdescription.trim();
    }
}