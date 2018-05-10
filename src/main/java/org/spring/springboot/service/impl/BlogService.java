package org.spring.springboot.service.impl;

import java.util.ArrayList;
import org.spring.springboot.dao.BlogDao;
import org.spring.springboot.dao.CycleTeamDao;
import org.spring.springboot.dao.LocationDao;
import org.spring.springboot.dao.SampleDao;
import org.spring.springboot.domain.Blog;
import org.spring.springboot.domain.BlogWithBLOBs;
import org.spring.springboot.domain.Sample;
import org.spring.springboot.domain.SampleWithBLOBs;
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

    public void addBlog(BlogWithBLOBs blog){
        blogDao.insert(blog);
    }

    public BlogWithBLOBs getBlogByBlogId(Integer blogid){
        return blogDao.selectByPrimaryKey(blogid);
    }

    public List<BlogWithBLOBs> getBlogsByCycleTeamId(Integer cycleTeamId){
        List<BlogWithBLOBs> result = new ArrayList<BlogWithBLOBs>();
        List<SampleWithBLOBs> list = sampleDao.getSamplesByCycleTeamid(cycleTeamId);
        ArrayList idList = new ArrayList();//为了防止id相同的博客多次被加
        for (SampleWithBLOBs sampleWithBLOBs:list){
            Integer tempId = locationDao.selectByPrimaryKey(sampleWithBLOBs.getLocationid()).getBlogid();
            if (!idList.contains(tempId)) {
                idList.add(tempId);
                result.add(blogDao.selectByPrimaryKey(tempId));
            }
        }
        return result;
    }
}
