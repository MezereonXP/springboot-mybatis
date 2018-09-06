package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;
import org.spring.springboot.domain.Team;
import org.spring.springboot.domain.TeamExample;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2018/4/12.
 */
@Component
public interface TeamDao {

    long countByExample(TeamExample example);

    int deleteByExample(TeamExample example);

    int deleteByPrimaryKey(Integer teamId);

    int insert(Team record);

    int insertSelective(Team record);

    List<Team> selectByExampleWithBLOBs(TeamExample example);

    List<Team> selectByExample(TeamExample example);

    Team selectByPrimaryKey(Integer teamId);

    int updateByExampleSelective(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByExampleWithBLOBs(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByExample(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKeyWithBLOBs(Team record);

    int updateByPrimaryKey(Team record);

    Team findByEmail(@Param("email") String mail);

    Team login(@Param("email") String email);

    boolean updatePassword(@Param("email") String email,
                           @Param("password") String password);

}
