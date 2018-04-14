package org.spring.springboot.dao;

import org.spring.springboot.domain.Sample;
import org.spring.springboot.domain.SampleWithBLOBs;
import org.spring.springboot.domain.ShowSamples;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface SampleDao {
    int deleteByPrimaryKey(Integer baseid);

    int insert(SampleWithBLOBs record);

    int insertSelective(SampleWithBLOBs record);

    SampleWithBLOBs selectByPrimaryKey(Integer baseid);

    int updateByPrimaryKeySelective(SampleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SampleWithBLOBs record);

    int updateByPrimaryKey(Sample record);

    ShowSamples getAllSample();
}