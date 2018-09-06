package org.spring.springboot.dao;

import org.spring.springboot.domain.County;
import org.spring.springboot.domain.Prefecture;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CountyDao {
    int deleteByPrimaryKey(Integer countyId);

    int insert(County record);

    int insertSelective(County record);

    County selectByPrimaryKey(Integer countyId);

    int updateByPrimaryKeySelective(County record);

    int updateByPrimaryKey(County record);

    List<County> getCountyByPrefectureId(String prefectureId);

}