package org.spring.springboot.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.spring.springboot.domain.Team;
import org.spring.springboot.response.Response;
import org.spring.springboot.service.impl.TeamService;
import org.spring.springboot.util.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/4/12.
 */
@RestController
public class TeamRestController {

    private static Logger logger = LogManager.getLogger(TeamRestController.class);

    static final String HASH = "%E5%A5%87%E6%80%AA%E7%9A%84%E5%AD%97%E7%AC%A6%E4%B8%B2&pn=30&oq=%E5%A5%87%E6%80%AA%E7%9A%84%E5%AD%97%E7%AC%A6%E4%B8%B2&ie=utf-8&rsv_idx=1&rsv_pq=fd9f2b3c00087951&rsv_t=e7c5NJGVFprZOgQdstCngJa5XGCDpWPaa%2BmgHBpTRSXj1O6T%2Bw%2FGAkVd9hM&rsv";

    @Autowired
    private TeamService teamService;

    @RequestMapping(value = "/api/team", method = RequestMethod.GET)
    public Team findOneTeam(@RequestParam(value = "email", required = true) String email) {
        return teamService.findTeamByEmail(email);
    }

    @RequestMapping(value = "auth/login", method = RequestMethod.GET)
    public Response login(HttpServletRequest req,
                           HttpServletResponse resp,
                           @RequestParam(value = "email", required = true) String email,
                           @RequestParam(value = "password", required = true) String password) {
        Response response = new Response();
        try {
            if(teamService.login(email).getPassword().equals(password)){
                response.setStatus(true);
                String teamid = teamService.findTeamByEmail(email).getTeamid().toString();
                Cookie emailCookie = new Cookie("email",email);
                Cookie tokenCookie = new Cookie("token", Token.getToken(Token.getToken(Token.getToken(email
                        +
                        new SimpleDateFormat("yyyy-MM-dd").format(new Date())
                        +
                        HASH))));
                Cookie teamidCookie = new Cookie("teamid",teamid);
                emailCookie.setPath("/api");
                tokenCookie.setPath("/api");
                teamidCookie.setPath("/api");
                resp.addCookie(emailCookie);
                resp.addCookie(tokenCookie);
                resp.addCookie(teamidCookie);
                logger.info("用户Email:" + email + "登陆成功了");
            }else {
                response.setStatus(false);
                response.setMsg("登陆失败了,原因是密码匹配不通过");
                logger.info("用户Email:" + email + "登陆失败了,原因是密码匹配不通过");
            }
            return response;
        } catch (Exception e){
            response.setMsg("登陆失败了原因是Exception:" + e.getMessage());
            response.setStatus(false);
            logger.info("用户Email:" + email + "登陆失败了,原因是Exception:" + e.getMessage());
            return response;
        }
    }

    @RequestMapping(value = "api/checkAuth", method = RequestMethod.GET)
    public Response checkAuth(HttpServletRequest req,
                          HttpServletResponse resp,
                              @CookieValue(value="email" , required = false) String email,
                              @CookieValue(value="token" , required = false) String token) {
        Response response = new Response();
        try {
            if(email != null && token != null){
                if(teamService.checkAuth(email , token)){
                    Team team = teamService.findTeamByEmail(email);
                    team.setPassword(null);
                    response.setData(team);
                    response.setStatus(true);
                    logger.info("用户Email:" + email + "校验权限成功");
                }else{
                    response.setMsg("校验权限失败,原因是token校验不通过");
                    response.setStatus(false);
                    logger.info("用户Email:" + email + "校验权限失败,原因是token校验不通过");
                }
            }else {
                response.setStatus(false);
                response.setMsg("校验权限失败,原因是emailtoken为空");
                logger.info("校验权限失败,原因是email或token为空");
            }
            return response;
        } catch (Exception e){
            response.setMsg("校验权限失败,原因是" + e.getMessage());
            response.setStatus(false);
            logger.info("用户Email:" + email + "校验权限失败,原因是Exception:" + e.getMessage());
            return response;
        }
    }

    @RequestMapping(value = "/api/updatePassword", method = RequestMethod.GET)
    public Response updatePassword(@RequestParam(value = "email", required = true) String email,
                          @RequestParam(value = "oldPassword", required = true) String oldPassword,
                          @RequestParam(value = "newPassword", required = true) String newPassword) {
        Response response = new Response();
        try {
            response.setStatus(teamService.updatePassword(email,oldPassword ,newPassword));
            return response;
        } catch (Exception e){
            response.setMsg("更改密码失败,原因是" + e.getMessage());
            response.setStatus(false);
            logger.info("用户Email:" + email + "更改密码失败,原因是:" + e.getMessage());
            return response;
        }
    }

    @RequestMapping(value = "/auth/regist", method = RequestMethod.GET)
    public Response regist(@RequestParam(value = "email", required = true) String email,
                         @RequestParam(value = "password", required = true) String password,
                          @RequestParam(value = "detail", required = true) String detail,
                          @RequestParam(value = "teamName", required = true) String teamName) {
        Response response = new Response();
        try {
            response.setStatus(teamService.addTeam(email,teamName,password,detail));
            return response;
        } catch (Exception e){
            response.setMsg("注册失败,原因是:" + e.getMessage());
            response.setStatus(false);
            logger.info("用户Email:" + email + "注册失败,原因是:" + e.getMessage());
            return response;
        }
    }
}
