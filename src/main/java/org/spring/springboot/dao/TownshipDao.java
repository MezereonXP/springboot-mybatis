package org.spring.springboot.dao;

import org.spring.springboot.domain.Township;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TownshipDao {
    int deleteByPrimaryKey(Integer townid);

    int insert(Township record);

    int insertSelective(Township record);

    Township selectByPrimaryKey(Integer townid);

    int updateByPrimaryKeySelective(Township record);

    int updateByPrimaryKeyWithBLOBs(Township record);

    int updateByPrimaryKey(Township record);

    public List<Township> getTownshipByCountyId(String countyId);

    }