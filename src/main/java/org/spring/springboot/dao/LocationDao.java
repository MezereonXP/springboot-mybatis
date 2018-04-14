package org.spring.springboot.dao;

import org.spring.springboot.domain.Location;

import org.spring.springboot.domain.Location;

public interface LocationDao {
    int deleteByPrimaryKey(Integer villageid);

    int insert(Location record);

    int insertSelective(Location record);

    Location selectByPrimaryKey(Integer villageid);

    int updateByPrimaryKeySelective(Location record);

    int updateByPrimaryKey(Location record);
}