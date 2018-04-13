package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.domain.Team;
import org.spring.springboot.service.CityService;
import org.spring.springboot.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

}
