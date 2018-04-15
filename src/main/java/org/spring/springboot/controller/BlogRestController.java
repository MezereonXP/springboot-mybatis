package org.spring.springboot.controller;

import org.spring.springboot.dao.BlogDao;
import org.spring.springboot.domain.Blog;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.impl.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/4/16.
 */
@RestController
public class BlogRestController {

    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/api/getTeamBlog", method = RequestMethod.GET)
    public List<Blog> getTeamBlog(@RequestParam(value = "teamid", required = true) Integer teamid) {
        return blogService.getTeamBlog(teamid);
    }
}
