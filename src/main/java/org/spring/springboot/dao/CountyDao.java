package org.spring.springboot.dao;

import org.spring.springboot.domain.County;
import org.spring.springboot.domain.Prefecture;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CountyDao {
    int deleteByPrimaryKey(Integer countyid);

    int insert(County record);

    int insertSelective(County record);

    County selectByPrimaryKey(Integer countyid);

    int updateByPrimaryKeySelective(County record);

    int updateByPrimaryKeyWithBLOBs(County record);

    int updateByPrimaryKey(County record);

    public List<County> getCountyByPrefectureId(String prefectureId);

}