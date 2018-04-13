package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;
import org.spring.springboot.domain.Team;

/**
 * Created by Administrator on 2018/4/12.
 */
public interface TeamDao {

    /**
     * 根据队伍名称，查询队伍信息
     *
     * @param teamName 队伍名
     */
    Team findByName(@Param("teamName") String teamName);
}
