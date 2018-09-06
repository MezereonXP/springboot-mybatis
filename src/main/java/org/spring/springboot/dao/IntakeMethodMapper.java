package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.IntakeMethod;
import org.spring.springboot.domain.IntakeMethodExample;

public interface IntakeMethodMapper {
    long countByExample(IntakeMethodExample example);

    int deleteByExample(IntakeMethodExample example);

    int deleteByPrimaryKey(Integer intakeMethodId);

    int insert(IntakeMethod record);

    int insertSelective(IntakeMethod record);

    List<IntakeMethod> selectByExample(IntakeMethodExample example);

    IntakeMethod selectByPrimaryKey(Integer intakeMethodId);

    int updateByExampleSelective(@Param("record") IntakeMethod record, @Param("example") IntakeMethodExample example);

    int updateByExample(@Param("record") IntakeMethod record, @Param("example") IntakeMethodExample example);

    int updateByPrimaryKeySelective(IntakeMethod record);

    int updateByPrimaryKey(IntakeMethod record);
}