package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.TestCycle;
import org.spring.springboot.domain.TestCycleExample;
import org.springframework.stereotype.Component;

@Component
public interface TestCycleMapper {
    long countByExample(TestCycleExample example);

    int deleteByExample(TestCycleExample example);

    int deleteByPrimaryKey(Integer testCycleId);

    int insert(TestCycle record);

    int insertSelective(TestCycle record);

    List<TestCycle> selectByExample(TestCycleExample example);

    TestCycle selectByPrimaryKey(Integer testCycleId);

    int updateByExampleSelective(@Param("record") TestCycle record, @Param("example") TestCycleExample example);

    int updateByExample(@Param("record") TestCycle record, @Param("example") TestCycleExample example);

    int updateByPrimaryKeySelective(TestCycle record);

    int updateByPrimaryKey(TestCycle record);
}