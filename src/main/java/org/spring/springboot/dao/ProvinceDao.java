package org.spring.springboot.dao;

import org.spring.springboot.domain.Province;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProvinceDao {
    int deleteByPrimaryKey(String provinceid);

    int insert(Province record);

    int insertSelective(Province record);

    Province selectByPrimaryKey(String provinceid);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKeyWithBLOBs(Province record);

    int updateByPrimaryKey(Province record);

    List<Province> getAllProvince();
}