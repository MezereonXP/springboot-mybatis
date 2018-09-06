package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Blog;
import org.spring.springboot.domain.BlogExample;
import org.spring.springboot.domain.BlogWithBLOBs;
import org.springframework.stereotype.Component;

@Component
public interface BlogDao {
    long countByExample(BlogExample example);

    int deleteByExample(BlogExample example);

    int deleteByPrimaryKey(Integer blogId);

    int insert(Blog record);

    int insertSelective(Blog record);

    List<Blog> selectByExampleWithBLOBs(BlogExample example);

    List<Blog> selectByExample(BlogExample example);

    Blog selectByPrimaryKey(Integer blogId);

    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByExampleWithBLOBs(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKeyWithBLOBs(Blog record);

    int updateByPrimaryKey(Blog record);
}