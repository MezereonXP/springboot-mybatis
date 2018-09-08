package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.TreatmentMethod;
import org.spring.springboot.domain.TreatmentMethodExample;

public interface TreatmentMethodMapper {
    long countByExample(TreatmentMethodExample example);

    int deleteByExample(TreatmentMethodExample example);

    int deleteByPrimaryKey(Integer treatmentMethodId);

    int insert(TreatmentMethod record);

    int insertSelective(TreatmentMethod record);

    List<TreatmentMethod> selectByExample(TreatmentMethodExample example);

    TreatmentMethod selectByPrimaryKey(Integer treatmentMethodId);

    int updateByExampleSelective(@Param("record") TreatmentMethod record, @Param("example") TreatmentMethodExample example);

    int updateByExample(@Param("record") TreatmentMethod record, @Param("example") TreatmentMethodExample example);

    int updateByPrimaryKeySelective(TreatmentMethod record);

    int updateByPrimaryKey(TreatmentMethod record);
}