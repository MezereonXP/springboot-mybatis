package org.spring.springboot.dao;
import org.springframework.cache.annotation.Cacheable;


import org.spring.springboot.domain.Method;
import org.springframework.stereotype.Component;

@Component
public interface MethodDao {
    int deleteByPrimaryKey(Integer methodid);

    int insert(Method record);

    int insertSelective(Method record);

    Method selectByPrimaryKey(Integer methodid);

    int updateByPrimaryKeySelective(Method record);

    int updateByPrimaryKey(Method record);
}