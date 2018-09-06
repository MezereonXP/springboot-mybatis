package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.WaterSourceType;
import org.spring.springboot.domain.WaterSourceTypeExample;

public interface WaterSourceTypeMapper {
    long countByExample(WaterSourceTypeExample example);

    int deleteByExample(WaterSourceTypeExample example);

    int deleteByPrimaryKey(Integer waterSourceId);

    int insert(WaterSourceType record);

    int insertSelective(WaterSourceType record);

    List<WaterSourceType> selectByExample(WaterSourceTypeExample example);

    WaterSourceType selectByPrimaryKey(Integer waterSourceId);

    int updateByExampleSelective(@Param("record") WaterSourceType record, @Param("example") WaterSourceTypeExample example);

    int updateByExample(@Param("record") WaterSourceType record, @Param("example") WaterSourceTypeExample example);

    int updateByPrimaryKeySelective(WaterSourceType record);

    int updateByPrimaryKey(WaterSourceType record);
}