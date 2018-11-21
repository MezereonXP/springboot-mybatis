package org.spring.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Visual;
import org.spring.springboot.domain.VisualExample;
import org.springframework.stereotype.Component;

@Component
public interface VisualMapper {
    long countByExample(VisualExample example);

    int deleteByExample(VisualExample example);

    int deleteByPrimaryKey(Integer visualID);

    int insert(Visual record);

    int insertSelective(Visual record);

    List<Visual> selectByExample(VisualExample example);

    Visual selectByPrimaryKey(Integer visualID);

    int updateByExampleSelective(@Param("record") Visual record, @Param("example") VisualExample example);

    int updateByExample(@Param("record") Visual record, @Param("example") VisualExample example);

    int updateByPrimaryKeySelective(Visual record);

    int updateByPrimaryKey(Visual record);
}