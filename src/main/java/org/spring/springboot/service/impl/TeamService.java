package org.spring.springboot.service.impl;

import org.spring.springboot.dao.TeamDao;
import org.spring.springboot.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/4/12.
 */
@Service
public class TeamService {
    @Autowired
    private TeamDao teamDao;

    public Team findTeamByEmail(String email) {
        return teamDao.findByEmail(email);
    }

    public Team login(String email) {
        return teamDao.login(email);
    }

    public boolean addTeam(String email, String teamName, String password, String detail) {
       return teamDao.addTeam(email, teamName, password, detail);
    }
    public boolean updatePassword (String email ,String oldPassword ,String newPassword) {
        if(login(email).getPassword().equals(oldPassword)){
            return teamDao.updatePassword(email , newPassword);
        }else{
            return false;
        }
    }
}
