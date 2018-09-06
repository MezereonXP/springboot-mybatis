package org.spring.springboot.domain;

public class CycleTeam {
    private Integer cycleTeamId;

    private Integer testCycleId;

    private Integer teamId;

    public Integer getCycleTeamId() {
        return cycleTeamId;
    }

    public void setCycleTeamId(Integer cycleTeamId) {
        this.cycleTeamId = cycleTeamId;
    }

    public Integer getTestCycleId() {
        return testCycleId;
    }

    public void setTestCycleId(Integer testCycleId) {
        this.testCycleId = testCycleId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }
}