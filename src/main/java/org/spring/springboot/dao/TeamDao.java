package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;
import org.spring.springboot.domain.Team;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/4/12.
 */
@Component
public interface TeamDao {

    /**
     * 根据队伍名称，查询队伍信息
     *
     * @param teamName 队伍名
     */
    Team findByName(@Param("teamName") String teamName);
    Team login(@Param("email") String email);
    boolean addTeam(@Param("email") String email,
                 @Param("teamName") String teamName,
                 @Param("password") String password,
                 @Param("detail") String detail);
    boolean updatePassword(@Param("email") String email,
                    @Param("password") String password);
}
