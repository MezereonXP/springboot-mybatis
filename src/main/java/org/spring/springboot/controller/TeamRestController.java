package org.spring.springboot.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.spring.springboot.domain.Team;
import org.spring.springboot.response.Response;
import org.spring.springboot.service.impl.TeamService;
import org.spring.springboot.util.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/4/12.
 */
@RestController
public class TeamRestController {

    private static Logger logger = LogManager.getLogger(TeamRestController.class);

    private static final String HOST = "47.92.254.221";

    private static final String EMAIL_HOST = "smtp.myh2o.org.cn";
    private static final String EMAIL_USERNAME = "dataaccount@myh2o.org";
    private static final String EMAIL_PWD = "dddAAA123";

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
                String teamid = teamService.findTeamByEmail(email).getTeamId().toString();
                Cookie emailCookie = new Cookie("email",email);
                Cookie tokenCookie = new Cookie("token", Token.getMyToken(email,teamid));
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
                              @CookieValue(value="teamid" , required = false) String teamid,
                              @CookieValue(value="token" , required = false) String token) {
        Response response = new Response();
        try {
            if(email != null && token != null && teamid != null){
                if(teamService.checkAuth(email , token ,teamid)){
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
                           @RequestParam(value = "teamName", required = true) String teamName,
                           @RequestParam(value = "universityId", required = false) Integer universityId,
                           @RequestParam(value = "priority", required = true) Integer priority) {
        Response response = new Response();
        try {
            response.setStatus(teamService.addTeam(email, teamName, password, detail, universityId, priority));
            return response;
        } catch (Exception e){
            response.setMsg("注册失败,原因是:" + e.getMessage());
            response.setStatus(false);
            logger.info("用户Email:" + email + "注册失败,原因是:" + e.getMessage());
            return response;
        }
    }

    @RequestMapping(value = "auth/logout", method = RequestMethod.GET)
    public Response logout(HttpServletRequest req,
                          HttpServletResponse resp) {
        Response response = new Response();
        try {
            response.setStatus(true);
            Cookie emailCookie = new Cookie("email",null);
            Cookie tokenCookie = new Cookie("token", null);
            Cookie teamidCookie = new Cookie("teamid",null);
            emailCookie.setPath("/api");
            tokenCookie.setPath("/api");
            teamidCookie.setPath("/api");
            resp.addCookie(emailCookie);
            resp.addCookie(tokenCookie);
            resp.addCookie(teamidCookie);
            logger.info("用户Email:" + "登出成功了");
            return response;
        } catch (Exception e){
            response.setMsg("登出失败了原因是Exception:" + e.getMessage());
            response.setStatus(false);
            logger.info("用户Email:"  + "登出失败了,原因是Exception:" + e.getMessage());
            return response;
        }
    }

    @RequestMapping(value = "auth/getCode", method = RequestMethod.GET)
    @CrossOrigin
    public Response getCode(HttpServletRequest req,
                            HttpServletResponse resp,
                            @RequestParam(value = "email", required = true) String email) {
        Response response = new Response();
        JedisPool pool = new JedisPool(new JedisPoolConfig(), HOST);
        Jedis jedis = null;
        try {
            if (teamService.findTeamByEmail(email) == null) {
                response.setStatus(true);
                jedis = pool.getResource();
                if (jedis.exists(email)) {
                    response.setStatus(false);
                    response.setMsg("短时间内请勿重复获取验证码");
                } else {
                    int number = (int) (Math.random() * 899998 + 100001);
                    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
                    mailSender.setHost(EMAIL_HOST);
                    mailSender.setPassword(EMAIL_PWD);
                    mailSender.setUsername(EMAIL_USERNAME);
                    MimeMessage mimeMailMessage = mailSender.createMimeMessage();
                    MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMailMessage, false, "utf-8");
                    mimeMessageHelper.setTo(email);
                    mimeMessageHelper.setFrom(EMAIL_USERNAME);
                    // 设置邮件发送内容的主题
                    mimeMessageHelper.setSubject("注册验证");
                    // true 表示启动HTML格式的邮件
                    mimeMessageHelper.setText("<html><title>这是一封用于注册的邮件</title><body>感谢您注册MyH2O系统, 您的验证码为:"
                            + number + ", 有效期为一个小时, 请及时完成注册!</body></html>", true);
                    mailSender.send(mimeMailMessage);
                    jedis.setex(email, 3600, String.valueOf(number));
                }
            } else {
                response.setStatus(false);
                response.setMsg("邮箱名已存在, 请勿重复注册");
            }
            return response;
        } catch (Exception e) {
            response.setMsg("注册失败原因是Exception:" + e.getMessage());
            response.setStatus(false);
            logger.info("用户Email:" + "注册失败了,原因是Exception:" + e.getMessage());
            return response;
        } finally {
            if (jedis != null) {
                jedis.close();
            }
            pool.close();
        }
    }
}
