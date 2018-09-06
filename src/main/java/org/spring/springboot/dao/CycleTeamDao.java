package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.CycleTeam;
import org.spring.springboot.domain.CycleTeamExample;
import org.spring.springboot.domain.CycleTeamWithBLOBs;
import org.springframework.stereotype.Component;

@Component
public interface CycleTeamDao {
    long countByExample(CycleTeamExample example);

    int deleteByExample(CycleTeamExample example);

    int deleteByPrimaryKey(Integer cycleTeamId);

    int insert(CycleTeamWithBLOBs record);

    int insertSelective(CycleTeamWithBLOBs record);

    List<CycleTeamWithBLOBs> selectByExampleWithBLOBs(CycleTeamExample example);

    List<CycleTeam> selectByExample(CycleTeamExample example);

    CycleTeamWithBLOBs selectByPrimaryKey(Integer cycleTeamId);

    int updateByExampleSelective(@Param("record") CycleTeamWithBLOBs record, @Param("example") CycleTeamExample example);

    int updateByExampleWithBLOBs(@Param("record") CycleTeamWithBLOBs record, @Param("example") CycleTeamExample example);

    int updateByExample(@Param("record") CycleTeam record, @Param("example") CycleTeamExample example);

    int updateByPrimaryKeySelective(CycleTeamWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CycleTeamWithBLOBs record);

    int updateByPrimaryKey(CycleTeam record);

    List<CycleTeam> selectByTeamId(Integer teamid);

    List<CycleTeam> selectByCycleTeamId(Integer cycleteamid);

    List<CycleTeam> selectByTestCycleId(Integer testcycleid);
}