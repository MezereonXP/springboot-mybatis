package org.spring.springboot.dao;

import org.spring.springboot.domain.Province;

public interface ProvinceDao {
    int deleteByPrimaryKey(String provinceid);

    int insert(Province record);

    int insertSelective(Province record);

    Province selectByPrimaryKey(String provinceid);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKeyWithBLOBs(Province record);

    int updateByPrimaryKey(Province record);
}