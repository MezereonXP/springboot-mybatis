package org.spring.springboot.dao;

import org.spring.springboot.domain.Prefecture;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PrefectureDao {
    int deleteByPrimaryKey(Integer prefectureid);

    int insert(Prefecture record);

    int insertSelective(Prefecture record);

    Prefecture selectByPrimaryKey(Integer prefectureid);

    int updateByPrimaryKeySelective(Prefecture record);

    int updateByPrimaryKeyWithBLOBs(Prefecture record);

    int updateByPrimaryKey(Prefecture record);

    List<Prefecture> getPrefectureByProvinceId(String provinceId);
}