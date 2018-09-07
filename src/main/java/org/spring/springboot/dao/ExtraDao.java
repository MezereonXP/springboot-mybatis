package org.spring.springboot.dao;

import org.spring.springboot.domain.Extra;
import org.springframework.stereotype.Component;

@Component
public interface ExtraDao {
    int deleteByPrimaryKey(Integer extraid);

    int insert(Extra record);

    int insertSelective(Extra record);

    Extra selectByPrimaryKey(Integer extraid);

    int updateByPrimaryKeySelective(Extra record);

    int updateByPrimaryKeyWithBLOBs(Extra record);

    int updateByPrimaryKey(Extra record);
}