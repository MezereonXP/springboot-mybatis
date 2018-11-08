package org.spring.springboot.service.impl;

import java.util.ArrayList;
import org.spring.springboot.dao.BlogDao;
import org.spring.springboot.dao.CycleTeamDao;
import org.spring.springboot.dao.LocationDao;
import org.spring.springboot.dao.SampleDao;
import org.spring.springboot.domain.*;
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

    @Autowired
    private SampleDao sampleDao;

    @Autowired
    private LocationDao locationDao;

    public void addBlog(Blog blog) {
        blogDao.insert(blog);
    }

    public Blog getBlogByBlogId(Integer blogid) {
        return blogDao.selectByPrimaryKey(blogid);
    }

    public List<Blog> getBlogsByCycleTeamId(Integer cycleTeamId) {
        List<Blog> result = new ArrayList<Blog>();
        SampleExample sampleExample = new SampleExample();
        sampleExample.createCriteria().andCycleTeamIdEqualTo(cycleTeamId);
        List<Sample> list = sampleDao.selectByExample(sampleExample);
        ArrayList idList = new ArrayList();//为了防止id相同的博客多次被加
        for (Sample sample : list) {
            Integer tempId = locationDao.selectByPrimaryKey(sample.getLocationId()).getBlogId();
            if (!idList.contains(tempId)) {
                idList.add(tempId);
                result.add(blogDao.selectByPrimaryKey(tempId));
            }
        }
        return result;
    }
}
