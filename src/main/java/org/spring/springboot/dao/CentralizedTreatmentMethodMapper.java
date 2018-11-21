package org.spring.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.CentralizedTreatmentMethod;
import org.spring.springboot.domain.CentralizedTreatmentMethodExample;
import org.springframework.stereotype.Component;

@Component
public interface CentralizedTreatmentMethodMapper {
    long countByExample(CentralizedTreatmentMethodExample example);

    int deleteByExample(CentralizedTreatmentMethodExample example);

    int deleteByPrimaryKey(Integer centrTreatmentMethodId);

    int insert(CentralizedTreatmentMethod record);

    int insertSelective(CentralizedTreatmentMethod record);

    List<CentralizedTreatmentMethod> selectByExample(CentralizedTreatmentMethodExample example);

    CentralizedTreatmentMethod selectByPrimaryKey(Integer centrTreatmentMethodId);

    int updateByExampleSelective(@Param("record") CentralizedTreatmentMethod record, @Param("example") CentralizedTreatmentMethodExample example);

    int updateByExample(@Param("record") CentralizedTreatmentMethod record, @Param("example") CentralizedTreatmentMethodExample example);

    int updateByPrimaryKeySelective(CentralizedTreatmentMethod record);

    int updateByPrimaryKey(CentralizedTreatmentMethod record);
}