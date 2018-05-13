package org.spring.springboot.dao;

import org.spring.springboot.domain.Village;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface VillageDao {
    int deleteByPrimaryKey(Integer villageid);

    int insert(Village record);

    int insertSelective(Village record);

    Village selectByPrimaryKey(Integer villageid);

    int updateByPrimaryKeySelective(Village record);

    int updateByPrimaryKeyWithBLOBs(Village record);

    int updateByPrimaryKey(Village record);

    public List<Village> getVillageByTownshipId(String townshipId);

}