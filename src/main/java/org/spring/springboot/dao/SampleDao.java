package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Sample;
import org.spring.springboot.domain.SampleExample;
import org.spring.springboot.domain.SampleWithBLOBs;
import org.spring.springboot.domain.ShowSamples;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface SampleDao {
    long countByExample(SampleExample example);

    int deleteByExample(SampleExample example);

    int deleteByPrimaryKey(Integer baseId);

    int insert(Sample record);

    int insertSelective(Sample record);

    List<Sample> selectByExample(SampleExample example);

    Sample selectByPrimaryKey(Integer baseId);

    int updateByExampleSelective(@Param("record") Sample record, @Param("example") SampleExample example);

    int updateByExample(@Param("record") Sample record, @Param("example") SampleExample example);

    int updateByPrimaryKeySelective(Sample record);

    int updateByPrimaryKey(Sample record);

    List<Sample> getSamplesByCycleTeamid(Integer cycleTeamid);
}