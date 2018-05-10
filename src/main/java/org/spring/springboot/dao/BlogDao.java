package org.spring.springboot.dao;

import java.util.List;
import org.spring.springboot.domain.Blog;
import org.spring.springboot.domain.BlogWithBLOBs;
import org.springframework.stereotype.Component;

@Component
public interface BlogDao {
    int deleteByPrimaryKey(Integer blogid);

    int insert(BlogWithBLOBs record);

    int insertSelective(BlogWithBLOBs record);

    BlogWithBLOBs selectByPrimaryKey(Integer blogid);

    int updateByPrimaryKeySelective(BlogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BlogWithBLOBs record);

    int updateByPrimaryKey(Blog record);
}