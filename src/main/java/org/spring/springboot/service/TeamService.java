package org.spring.springboot.service;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Team;

/**
 * Created by Administrator on 2018/4/12.
 */
public interface TeamService {

    /**
     * 根据队伍名称，查询队伍信息
     *
     * @param teamName 队伍名
     */
    Team findTeamByName(String teamName);
    Team login(String email);
    boolean addTeam(String email, String teamName, String password, String detail);

}
