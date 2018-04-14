package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.TestCycle;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TestCycleDao {
    int deleteByPrimaryKey(Integer testcycleid);

    int insert(TestCycle record);

    int insertSelective(TestCycle record);

    TestCycle selectByPrimaryKey(Integer testcycleid);

    int updateByPrimaryKeySelective(TestCycle record);

    int updateByPrimaryKeyWithBLOBs(TestCycle record);

    int updateByPrimaryKey(TestCycle record);

    List<TestCycle> findTestCycleByTeamId(@Param("teamid") String teamid);
}