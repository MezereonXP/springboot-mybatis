package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.HealthCenter;
import org.spring.springboot.domain.HealthCenterExample;
import org.springframework.stereotype.Component;

@Component
public interface HealthCenterMapper {
    long countByExample(HealthCenterExample example);

    int deleteByExample(HealthCenterExample example);

    int deleteByPrimaryKey(Integer healthCenterId);

    int insert(HealthCenter record);

    int insertSelective(HealthCenter record);

    List<HealthCenter> selectByExample(HealthCenterExample example);

    HealthCenter selectByPrimaryKey(Integer healthCenterId);

    int updateByExampleSelective(@Param("record") HealthCenter record, @Param("example") HealthCenterExample example);

    int updateByExample(@Param("record") HealthCenter record, @Param("example") HealthCenterExample example);

    int updateByPrimaryKeySelective(HealthCenter record);

    int updateByPrimaryKey(HealthCenter record);
}