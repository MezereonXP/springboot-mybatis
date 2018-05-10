package org.spring.springboot.dao;

import org.spring.springboot.domain.MultiChoose;
import org.springframework.stereotype.Component;

@Component
public interface MultiChooseDao {
    int deleteByPrimaryKey(Integer multichooseid);

    int insert(MultiChoose record);

    int insertSelective(MultiChoose record);

    MultiChoose selectByPrimaryKey(Integer multichooseid);

    int updateByPrimaryKeySelective(MultiChoose record);

    int updateByPrimaryKey(MultiChoose record);
}