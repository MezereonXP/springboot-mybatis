package org.spring.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Method;
import org.spring.springboot.domain.MethodExample;

public interface MethodMapper {
    long countByExample(MethodExample example);

    int deleteByExample(MethodExample example);

    int deleteByPrimaryKey(Integer methodId);

    int insert(Method record);

    int insertSelective(Method record);

    List<Method> selectByExample(MethodExample example);

    Method selectByPrimaryKey(Integer methodId);

    int updateByExampleSelective(@Param("record") Method record, @Param("example") MethodExample example);

    int updateByExample(@Param("record") Method record, @Param("example") MethodExample example);

    int updateByPrimaryKeySelective(Method record);

    int updateByPrimaryKey(Method record);
}