package org.spring.springboot.controller;

import org.spring.springboot.domain.Team;
import org.spring.springboot.response.Response;
import org.spring.springboot.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * Created by Administrator on 2018/4/12.
 */
@RestController
public class TeamRestController {

    @Autowired
    private TeamService teamService;

    @RequestMapping(value = "/api/team", method = RequestMethod.GET)
    public Team findOneTeam(@RequestParam(value = "teamName", required = true) String teamName) {
        return teamService.findTeamByName(teamName);
    }

    @RequestMapping(value = "/api/login", method = RequestMethod.GET)
    public Response login(@RequestParam(value = "email", required = true) String email,
                         @RequestParam(value = "password", required = true) String password) {
        Response response = new Response();
        try {
            response.setStatus(teamService.login(email).getPassword().equals(password));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/regist", method = RequestMethod.GET)
    public Response regist(@RequestParam(value = "email", required = true) String email,
                         @RequestParam(value = "password", required = true) String password,
                          @RequestParam(value = "detail", required = true) String detail,
                          @RequestParam(value = "teamName", required = true) String teamName) {
        Response response = new Response();
        try {
            response.setStatus(teamService.addTeam(email,teamName,password,detail));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

}
