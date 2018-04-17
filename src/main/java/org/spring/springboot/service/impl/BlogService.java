package org.spring.springboot.service.impl;

import org.spring.springboot.dao.BlogDao;
import org.spring.springboot.domain.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/4/16.
 */
@Service
public class BlogService {

    @Autowired
    private BlogDao blogDao;

    public List<Blog> getTeamBlog(Integer teamid) {
        return blogDao.getTeamBlog(teamid);
    }

    public void addBlog(Blog blog){
        blogDao.insert(blog);
    }

    public Blog getBlogByLocation(Integer locationid){
        return blogDao.selectByLocation(locationid);
    }
}
