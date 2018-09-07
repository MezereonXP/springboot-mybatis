package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.WaterStorage;
import org.spring.springboot.domain.WaterStorageExample;
import org.springframework.stereotype.Component;

@Component
public interface WaterStorageMapper {
    long countByExample(WaterStorageExample example);

    int deleteByExample(WaterStorageExample example);

    int deleteByPrimaryKey(Integer waterStorageId);

    int insert(WaterStorage record);

    int insertSelective(WaterStorage record);

    List<WaterStorage> selectByExample(WaterStorageExample example);

    WaterStorage selectByPrimaryKey(Integer waterStorageId);

    int updateByExampleSelective(@Param("record") WaterStorage record, @Param("example") WaterStorageExample example);

    int updateByExample(@Param("record") WaterStorage record, @Param("example") WaterStorageExample example);

    int updateByPrimaryKeySelective(WaterStorage record);

    int updateByPrimaryKey(WaterStorage record);
}