package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Location;

import org.spring.springboot.domain.Location;
import org.spring.springboot.domain.LocationExample;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LocationDao {
    long countByExample(LocationExample example);

    int deleteByExample(LocationExample example);

    int deleteByPrimaryKey(Integer locationId);

    int insert(Location record);

    int insertSelective(Location record);

    List<Location> selectByExample(LocationExample example);

    Location selectByPrimaryKey(Integer locationId);

    int updateByExampleSelective(@Param("record") Location record, @Param("example") LocationExample example);

    int updateByExample(@Param("record") Location record, @Param("example") LocationExample example);

    int updateByPrimaryKeySelective(Location record);

    int updateByPrimaryKey(Location record);
}