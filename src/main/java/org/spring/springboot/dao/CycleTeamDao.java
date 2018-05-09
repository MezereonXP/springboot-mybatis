package org.spring.springboot.dao;

import java.util.List;
import org.spring.springboot.domain.CycleTeam;
import org.springframework.stereotype.Component;

@Component
public interface CycleTeamDao {
    int deleteByPrimaryKey(Integer cycleteamid);

    int insert(CycleTeam record);

    int insertSelective(CycleTeam record);

    CycleTeam selectByPrimaryKey(Integer cycleteamid);

    int updateByPrimaryKeySelective(CycleTeam record);

    int updateByPrimaryKeyWithBLOBs(CycleTeam record);

    int updateByPrimaryKey(CycleTeam record);

    List<CycleTeam> selectByTeamId(Integer teamid);
}