package org.spring.springboot.controller;

import org.spring.springboot.dao.BlogDao;
import org.spring.springboot.domain.Blog;
import org.spring.springboot.domain.City;
import org.spring.springboot.domain.SampleWithBLOBs;
import org.spring.springboot.response.Response;
import org.spring.springboot.service.impl.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/4/16.
 */
@RestController
public class BlogRestController {

    @Autowired
    private BlogService blogService;

    /**
     * 利用团队id来获取他们所有的博客
     *
     * @param teamid
     * @return
     */
    @RequestMapping(value = "/api/getTeamBlog", method = RequestMethod.GET)
    public Response getTeamBlog(@CookieValue(value = "teamid", required = true) Integer teamid) {
        Response response = new Response();
        try {
            response.setStatus(true);
            response.setData(blogService.getTeamBlog(teamid));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addBlog", method = RequestMethod.POST)
    @ResponseBody
    public Response addBlog(@RequestBody Blog blog) {
        Response response = new Response();
        try {
            blogService.addBlog(blog);
            response.setStatus(true);
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}
