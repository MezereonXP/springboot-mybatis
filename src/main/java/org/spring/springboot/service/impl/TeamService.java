package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CycleTeamDao;
import org.spring.springboot.dao.TeamDao;
import org.spring.springboot.dao.TestCycleDao;
import org.spring.springboot.domain.*;
import org.spring.springboot.util.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/4/12.
 */
@Service
public class TeamService {
    static final String HASH = "%E5%A5%87%E6%80%AA%E7%9A%84%E5%AD%97%E7%AC%A6%E4%B8%B2&pn=30&oq=%E5%A5%87%E6%80%AA%E7%9A%84%E5%AD%97%E7%AC%A6%E4%B8%B2&ie=utf-8&rsv_idx=1&rsv_pq=fd9f2b3c00087951&rsv_t=e7c5NJGVFprZOgQdstCngJa5XGCDpWPaa%2BmgHBpTRSXj1O6T%2Bw%2FGAkVd9hM&rsv";
    @Autowired
    private TeamDao teamDao;

    @Autowired
    private TestCycleDao testCycleDao;

    @Autowired
    private CycleTeamDao cycleTeamDao;

    public Team findTeamByEmail(String email) {
        TeamExample teamExample = new TeamExample();
        teamExample.createCriteria().andEmailEqualTo(email);
        List<Team> result = teamDao.selectByExample(teamExample);
        if (result != null && result.size() != 0) {
            return result.get(0);
        }
        return null;
    }

    public Team login(String email) {
        TeamExample teamExample = new TeamExample();
        teamExample.createCriteria().andEmailEqualTo(email);
        List<Team> teamList = teamDao.selectByExample(teamExample);
        if (teamList.size() == 0) {
            return new Team();
        } else {
            return teamList.get(0);
        }
    }

    public boolean addTeam(String email, String teamName, String password, String detail, Integer universityId,
                           Integer priority) {
        Team team = new Team();
        team.setEmail(email);
        team.setTeamName(teamName);
        team.setPassword(password);
        team.setDetails(detail);
        team.setUniversityId(universityId);
        team.setPriority(priority);
        team.setCreateTime(new Date());
        team.setUpdateTime(new Date());
        team.setLastLoginTime(new Date());
        teamDao.insert(team);
        TestCycleExample testCycleExample = new TestCycleExample();
        testCycleExample.createCriteria().andTestCycleIdIsNotNull();
        List<TestCycle> testCycleList = testCycleDao.selectByExample(testCycleExample);
        Integer currentCycle = testCycleList.get(testCycleList.size() - 1).getTestCycleId();
        CycleTeamWithBLOBs cycleTeamWithBLOBs = new CycleTeamWithBLOBs();
        cycleTeamWithBLOBs.setTeamId(team.getTeamId());
        cycleTeamWithBLOBs.setTestCycleId(currentCycle);
        cycleTeamWithBLOBs.setCreateTime(new Date());
        cycleTeamWithBLOBs.setUpdateTime(new Date());
        cycleTeamDao.insertSelective(cycleTeamWithBLOBs);
        return team.getTeamId() != null;
    }

    public boolean checkAuth(String email, String token, String teamid) {
        if (Token.checkToken(token, email, teamid)) {
            System.out.println("Token True");
            return true;
        } else {
            System.out.println("Token False");
            return false;
        }
    }

    public boolean updatePassword(String email, String oldPassword, String newPassword) {
        if (login(email).getPassword().equals(oldPassword)) {
            Team team = findTeamByEmail(email);
            team.setPassword(newPassword);
            team.setUpdateTime(new Date());
            return teamDao.updateByPrimaryKey(team) != 0;
        } else {
            return false;
        }
    }
}
