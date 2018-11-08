package org.spring.springboot.domain;

import java.util.Date;

public class CycleTeam {
    private Integer cycleTeamId;

    private Integer testCycleId;

    private Integer teamId;

    private Date createTime;

    private Date updateTime;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}