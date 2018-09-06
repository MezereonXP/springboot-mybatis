package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.DrinkingWaterType;
import org.spring.springboot.domain.DrinkingWaterTypeExample;

public interface DrinkingWaterTypeMapper {
    long countByExample(DrinkingWaterTypeExample example);

    int deleteByExample(DrinkingWaterTypeExample example);

    int deleteByPrimaryKey(Integer drinkWaterId);

    int insert(DrinkingWaterType record);

    int insertSelective(DrinkingWaterType record);

    List<DrinkingWaterType> selectByExample(DrinkingWaterTypeExample example);

    DrinkingWaterType selectByPrimaryKey(Integer drinkWaterId);

    int updateByExampleSelective(@Param("record") DrinkingWaterType record, @Param("example") DrinkingWaterTypeExample example);

    int updateByExample(@Param("record") DrinkingWaterType record, @Param("example") DrinkingWaterTypeExample example);

    int updateByPrimaryKeySelective(DrinkingWaterType record);

    int updateByPrimaryKey(DrinkingWaterType record);
}