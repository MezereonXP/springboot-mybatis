package org.spring.springboot.controller;

import org.spring.springboot.domain.Team;
import org.spring.springboot.response.Response;
import org.spring.springboot.service.impl.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/4/12.
 */
@RestController
public class TeamRestController {

    @Autowired
    private TeamService teamService;

    @RequestMapping(value = "/api/team", method = RequestMethod.GET)
    public Team findOneTeam(@RequestParam(value = "email", required = true) String email) {
        return teamService.findTeamByEmail(email);
    }

    @RequestMapping(value = "/api/login", method = RequestMethod.GET)
    public Response login(HttpServletRequest req,
                           HttpServletResponse resp,
                           @RequestParam(value = "email", required = true) String email,
                           @RequestParam(value = "password", required = true) String password) {
        Response response = new Response();
        try {
            if(teamService.login(email).getPassword().equals(password)){
                response.setStatus(true);
                resp.addCookie(new Cookie("teamid",teamService.findTeamByEmail(email).getTeamid().toString()));
            }else {
                response.setStatus(false);
            }
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/updatePassword", method = RequestMethod.GET)
    public Response login(@RequestParam(value = "email", required = true) String email,
                          @RequestParam(value = "oldPassword", required = true) String oldPassword,
                          @RequestParam(value = "newPassword", required = true) String newPassword) {
        Response response = new Response();
        try {
            response.setStatus(teamService.updatePassword(email,oldPassword ,newPassword));
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
