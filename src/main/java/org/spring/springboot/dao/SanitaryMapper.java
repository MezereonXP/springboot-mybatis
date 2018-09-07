package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Sanitary;
import org.spring.springboot.domain.SanitaryExample;
import org.springframework.stereotype.Component;

@Component
public interface SanitaryMapper {
    long countByExample(SanitaryExample example);

    int deleteByExample(SanitaryExample example);

    int deleteByPrimaryKey(Integer sanitaryTypeId);

    int insert(Sanitary record);

    int insertSelective(Sanitary record);

    List<Sanitary> selectByExample(SanitaryExample example);

    Sanitary selectByPrimaryKey(Integer sanitaryTypeId);

    int updateByExampleSelective(@Param("record") Sanitary record, @Param("example") SanitaryExample example);

    int updateByExample(@Param("record") Sanitary record, @Param("example") SanitaryExample example);

    int updateByPrimaryKeySelective(Sanitary record);

    int updateByPrimaryKey(Sanitary record);
}