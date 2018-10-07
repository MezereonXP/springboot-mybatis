package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.QuickMap;
import org.spring.springboot.domain.QuickMapExample;
import org.springframework.stereotype.Component;

@Component
public interface QuickMapMapper {
    long countByExample(QuickMapExample example);

    int deleteByExample(QuickMapExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuickMap record);

    int insertSelective(QuickMap record);

    List<QuickMap> selectByExampleWithBLOBs(QuickMapExample example);

    List<QuickMap> selectByExample(QuickMapExample example);

    QuickMap selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuickMap record, @Param("example") QuickMapExample example);

    int updateByExampleWithBLOBs(@Param("record") QuickMap record, @Param("example") QuickMapExample example);

    int updateByExample(@Param("record") QuickMap record, @Param("example") QuickMapExample example);

    int updateByPrimaryKeySelective(QuickMap record);

    int updateByPrimaryKeyWithBLOBs(QuickMap record);

    int updateByPrimaryKey(QuickMap record);
}