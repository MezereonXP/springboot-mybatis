package org.spring.springboot.controller;

import org.spring.springboot.domain.Team;
import org.spring.springboot.response.Response;
import org.spring.springboot.service.impl.TeamService;
import org.spring.springboot.service.impl.TestCycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/4/12.
 */
@RestController
public class TestCyiceController {

    @Autowired
    private TestCycleService testCycleService;

    @RequestMapping(value = "/api/testCyice", method = RequestMethod.GET)
    public Response regist(@CookieValue(value="teamid") String teamid) {
        Response response = new Response();
        try {
            response.setData(testCycleService.findTestCycleByTeamId(teamid));
            response.setStatus(true);
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}
