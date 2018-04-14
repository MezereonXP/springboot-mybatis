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

    /**
     * 使用邮件地址获取信息
     *
     * @param email
     * @return
     */
    Team login(String email);
    boolean addTeam(String email, String teamName, String password, String detail);

}
