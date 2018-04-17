package org.spring.springboot.dao;

import org.spring.springboot.domain.Blog;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BlogDao {
    int deleteByPrimaryKey(Integer blogid);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer blogid);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKeyWithBLOBs(Blog record);

    int updateByPrimaryKey(Blog record);

    List<Blog> getTeamBlog(Integer teamid);

    Blog selectByLocation(Integer locationid);
}