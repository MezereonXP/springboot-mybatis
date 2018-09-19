package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.DiarrheaCause;
import org.spring.springboot.domain.DiarrheaCauseExample;
import org.springframework.stereotype.Component;

@Component
public interface DiarrheaCauseMapper {
    long countByExample(DiarrheaCauseExample example);

    int deleteByExample(DiarrheaCauseExample example);

    int deleteByPrimaryKey(Integer DHcauseID);

    int insert(DiarrheaCause record);

    int insertSelective(DiarrheaCause record);

    List<DiarrheaCause> selectByExample(DiarrheaCauseExample example);

    DiarrheaCause selectByPrimaryKey(Integer DHcauseID);

    int updateByExampleSelective(@Param("record") DiarrheaCause record, @Param("example") DiarrheaCauseExample example);

    int updateByExample(@Param("record") DiarrheaCause record, @Param("example") DiarrheaCauseExample example);

    int updateByPrimaryKeySelective(DiarrheaCause record);

    int updateByPrimaryKey(DiarrheaCause record);
}