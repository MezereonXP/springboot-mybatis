package org.spring.springboot.dao;

import org.spring.springboot.domain.County;

public interface CountyDao {
    int deleteByPrimaryKey(Integer countyid);

    int insert(County record);

    int insertSelective(County record);

    County selectByPrimaryKey(Integer countyid);

    int updateByPrimaryKeySelective(County record);

    int updateByPrimaryKeyWithBLOBs(County record);

    int updateByPrimaryKey(County record);
}