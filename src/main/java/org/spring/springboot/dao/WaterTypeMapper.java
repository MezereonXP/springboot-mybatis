package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.WaterType;
import org.spring.springboot.domain.WaterTypeExample;
import org.springframework.stereotype.Component;

@Component
public interface WaterTypeMapper {
    long countByExample(WaterTypeExample example);

    int deleteByExample(WaterTypeExample example);

    int deleteByPrimaryKey(Integer waterTypeId);

    int insert(WaterType record);

    int insertSelective(WaterType record);

    List<WaterType> selectByExample(WaterTypeExample example);

    WaterType selectByPrimaryKey(Integer waterTypeId);

    int updateByExampleSelective(@Param("record") WaterType record, @Param("example") WaterTypeExample example);

    int updateByExample(@Param("record") WaterType record, @Param("example") WaterTypeExample example);

    int updateByPrimaryKeySelective(WaterType record);

    int updateByPrimaryKey(WaterType record);
}