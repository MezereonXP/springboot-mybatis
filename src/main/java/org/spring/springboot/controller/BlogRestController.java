package org.spring.springboot.controller;

import org.spring.springboot.dao.CycleTeamDao;
import org.spring.springboot.domain.Blog;
import org.spring.springboot.domain.BlogWithBLOBs;
import org.spring.springboot.domain.CycleTeam;
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

import java.util.Map;

/**
 * Created by Administrator on 2018/4/16.
 */
@RestController
public class BlogRestController {

    @Autowired
    private BlogService blogService;

    /**
     * 利用id来获取博客
     *
     * @param blogid
     * @return
     */
    @RequestMapping(value = "/api/getBlog", method = RequestMethod.GET)
    public Response getTeamBlog(@RequestParam(value = "blogid", required = true) Integer blogid) {
        Response response = new Response();
        try {
            response.setStatus(true);
            response.setData(blogService.getBlogByBlogId(blogid));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    /**
     * 利用cycleteamid来获取博客
     *
     * @param cycleteamid
     * @return
     */
    @RequestMapping(value = "/api/getBlogByCycleTeamId", method = RequestMethod.GET)
    public Response getBlogsByCycleTeamId(@RequestParam(value = "cycleTeamId", required = true) Integer cycleteamid) {
        Response response = new Response();
        try {
            response.setStatus(true);
            response.setData(blogService.getBlogsByCycleTeamId(cycleteamid));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }


    @RequestMapping(value = "/api/addBlog", method = RequestMethod.POST)
    @ResponseBody
    public Response addBlog(@CookieValue(value = "teamid", required = true) Integer teamid,
                            @RequestBody BlogWithBLOBs blogWithBLOBs) {
        Response response = new Response();
        try {
            blogService.addBlog(blogWithBLOBs);
            response.setStatus(true);
            response.setMsg(String.valueOf(blogWithBLOBs.getBlogId()));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}
