package org.spring.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Smell;
import org.spring.springboot.domain.SmellExample;
import org.springframework.stereotype.Component;

@Component
public interface SmellMapper {
    long countByExample(SmellExample example);

    int deleteByExample(SmellExample example);

    int deleteByPrimaryKey(Integer smellId);

    int insert(Smell record);

    int insertSelective(Smell record);

    List<Smell> selectByExample(SmellExample example);

    Smell selectByPrimaryKey(Integer smellId);

    int updateByExampleSelective(@Param("record") Smell record, @Param("example") SmellExample example);

    int updateByExample(@Param("record") Smell record, @Param("example") SmellExample example);

    int updateByPrimaryKeySelective(Smell record);

    int updateByPrimaryKey(Smell record);
}