package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.TreamentMethod;
import org.spring.springboot.domain.TreamentMethodExample;

public interface TreamentMethodMapper {
    long countByExample(TreamentMethodExample example);

    int deleteByExample(TreamentMethodExample example);

    int deleteByPrimaryKey(Integer treamentMethodId);

    int insert(TreamentMethod record);

    int insertSelective(TreamentMethod record);

    List<TreamentMethod> selectByExample(TreamentMethodExample example);

    TreamentMethod selectByPrimaryKey(Integer treamentMethodId);

    int updateByExampleSelective(@Param("record") TreamentMethod record, @Param("example") TreamentMethodExample example);

    int updateByExample(@Param("record") TreamentMethod record, @Param("example") TreamentMethodExample example);

    int updateByPrimaryKeySelective(TreamentMethod record);

    int updateByPrimaryKey(TreamentMethod record);
}