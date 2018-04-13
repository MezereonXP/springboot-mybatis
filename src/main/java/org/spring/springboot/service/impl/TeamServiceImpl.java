package org.spring.springboot.service.impl;

import org.spring.springboot.dao.TeamDao;
import org.spring.springboot.domain.Team;
import org.spring.springboot.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/4/12.
 */
@Service
public class TeamServiceImpl implements TeamService{
    @Autowired
    private TeamDao teamDao;

    public Team findTeamByName(String teamName) {
        return teamDao.findByName(teamName);
    }

    @Override
    public Team login(String email) {
        return teamDao.login(email);
    }

    @Override
    public void addTeam(String email, String teamName, String password, String detail) {
        teamDao.addTeam(email, teamName, password, detail);
    }

}
