package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Prefecture;
import org.spring.springboot.domain.PrefectureExample;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PrefectureDao {
    long countByExample(PrefectureExample example);

    int deleteByExample(PrefectureExample example);

    int deleteByPrimaryKey(Integer prefectureId);

    int insert(Prefecture record);

    int insertSelective(Prefecture record);

    List<Prefecture> selectByExample(PrefectureExample example);

    Prefecture selectByPrimaryKey(Integer prefectureId);

    int updateByExampleSelective(@Param("record") Prefecture record, @Param("example") PrefectureExample example);

    int updateByExample(@Param("record") Prefecture record, @Param("example") PrefectureExample example);

    int updateByPrimaryKeySelective(Prefecture record);

    int updateByPrimaryKey(Prefecture record);

    List<Prefecture> getPrefectureByProvinceId(String provinceId);
}