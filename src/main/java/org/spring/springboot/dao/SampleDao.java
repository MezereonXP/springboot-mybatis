package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Sample;
import org.spring.springboot.domain.SampleWithBLOBs;

public interface SampleDao {
    int deleteByPrimaryKey(@Param("baseid") Integer baseid);

    int insert(@Param("record") SampleWithBLOBs record);

    int insertSelective(SampleWithBLOBs record);

    SampleWithBLOBs selectByPrimaryKey(Integer baseid);

    int updateByPrimaryKeySelective(SampleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SampleWithBLOBs record);

    int updateByPrimaryKey(Sample record);
}