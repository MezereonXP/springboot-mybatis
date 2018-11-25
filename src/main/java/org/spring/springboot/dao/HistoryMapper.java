package org.spring.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.History;
import org.spring.springboot.domain.HistoryExample;
import org.springframework.stereotype.Component;

@Component
public interface HistoryMapper {
    long countByExample(HistoryExample example);

    int deleteByExample(HistoryExample example);

    int deleteByPrimaryKey(Integer historyId);

    int insert(History record);

    int insertSelective(History record);

    List<History> selectByExampleWithBLOBs(HistoryExample example);

    List<History> selectByExample(HistoryExample example);

    History selectByPrimaryKey(Integer historyId);

    int updateByExampleSelective(@Param("record") History record, @Param("example") HistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") History record, @Param("example") HistoryExample example);

    int updateByExample(@Param("record") History record, @Param("example") HistoryExample example);

    int updateByPrimaryKeySelective(History record);

    int updateByPrimaryKeyWithBLOBs(History record);

    int updateByPrimaryKey(History record);
}