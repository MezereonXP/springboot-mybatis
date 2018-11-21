package org.spring.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Turbidity;
import org.spring.springboot.domain.TurbidityExample;
import org.springframework.stereotype.Component;

@Component
public interface TurbidityMapper {
    long countByExample(TurbidityExample example);

    int deleteByExample(TurbidityExample example);

    int deleteByPrimaryKey(Integer turbidityId);

    int insert(Turbidity record);

    int insertSelective(Turbidity record);

    List<Turbidity> selectByExample(TurbidityExample example);

    Turbidity selectByPrimaryKey(Integer turbidityId);

    int updateByExampleSelective(@Param("record") Turbidity record, @Param("example") TurbidityExample example);

    int updateByExample(@Param("record") Turbidity record, @Param("example") TurbidityExample example);

    int updateByPrimaryKeySelective(Turbidity record);

    int updateByPrimaryKey(Turbidity record);
}