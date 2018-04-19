package org.spring.springboot.service.impl;

import org.spring.springboot.dao.TeamDao;
import org.spring.springboot.domain.Team;
import org.spring.springboot.util.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/12.
 */
@Service
public class TeamService {
    static final String HASH = "%E5%A5%87%E6%80%AA%E7%9A%84%E5%AD%97%E7%AC%A6%E4%B8%B2&pn=30&oq=%E5%A5%87%E6%80%AA%E7%9A%84%E5%AD%97%E7%AC%A6%E4%B8%B2&ie=utf-8&rsv_idx=1&rsv_pq=fd9f2b3c00087951&rsv_t=e7c5NJGVFprZOgQdstCngJa5XGCDpWPaa%2BmgHBpTRSXj1O6T%2Bw%2FGAkVd9hM&rsv";
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

    public boolean checkAuth(String email, String token, String teamid) {
        if (Token.checkToken(token,email,teamid)) {
            System.out.println("Token True");
            return true;
        } else {
            System.out.println("Token False");
            return false;
        }
    }

    public boolean updatePassword (String email ,String oldPassword ,String newPassword) {
        if(login(email).getPassword().equals(oldPassword)){
            return teamDao.updatePassword(email , newPassword);
        }else{
            return false;
        }
    }
}
