package org.spring.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.PotentialContam;
import org.spring.springboot.domain.PotentialContamExample;
import org.springframework.stereotype.Component;

@Component
public interface PotentialContamMapper {
    long countByExample(PotentialContamExample example);

    int deleteByExample(PotentialContamExample example);

    int deleteByPrimaryKey(Integer contamId);

    int insert(PotentialContam record);

    int insertSelective(PotentialContam record);

    List<PotentialContam> selectByExample(PotentialContamExample example);

    PotentialContam selectByPrimaryKey(Integer contamId);

    int updateByExampleSelective(@Param("record") PotentialContam record, @Param("example") PotentialContamExample example);

    int updateByExample(@Param("record") PotentialContam record, @Param("example") PotentialContamExample example);

    int updateByPrimaryKeySelective(PotentialContam record);

    int updateByPrimaryKey(PotentialContam record);
}