package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.MultiResponse;
import org.spring.springboot.domain.MultiResponseExample;

public interface MultiResponseMapper {
    long countByExample(MultiResponseExample example);

    int deleteByExample(MultiResponseExample example);

    int deleteByPrimaryKey(Integer baseId);

    int insert(MultiResponse record);

    int insertSelective(MultiResponse record);

    List<MultiResponse> selectByExample(MultiResponseExample example);

    MultiResponse selectByPrimaryKey(Integer baseId);

    int updateByExampleSelective(@Param("record") MultiResponse record, @Param("example") MultiResponseExample example);

    int updateByExample(@Param("record") MultiResponse record, @Param("example") MultiResponseExample example);

    int updateByPrimaryKeySelective(MultiResponse record);

    int updateByPrimaryKey(MultiResponse record);
}