package org.spring.springboot.domain;

public class CycleTeamWithBLOBs extends CycleTeam {
    private String report;

    private String cycleTeamDescription;

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report == null ? null : report.trim();
    }

    public String getCycleTeamDescription() {
        return cycleTeamDescription;
    }

    public void setCycleTeamDescription(String cycleTeamDescription) {
        this.cycleTeamDescription = cycleTeamDescription == null ? null : cycleTeamDescription.trim();
    }
}