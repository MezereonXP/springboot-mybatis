package org.spring.springboot.controller;

import java.util.*;

import org.spring.springboot.dao.CycleTeamDao;
import org.spring.springboot.dao.TeamDao;
import org.spring.springboot.domain.*;
import org.spring.springboot.response.Response;
import org.spring.springboot.service.impl.TeamService;
import org.spring.springboot.service.impl.TestCycleService;
import org.spring.springboot.util.ValueUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/4/12.
 */
@RestController
public class TestCycleController {

    @Autowired
    private TestCycleService testCycleService;

    @Autowired
    private CycleTeamDao cycleTeamDao;

    @Autowired
    private TeamDao teamDao;

    @RequestMapping(value = "/getTestCycle", method = RequestMethod.GET)
    public Response getTestCycle() {
        Response response = new Response();
        try {
            List<TestCycle> list = testCycleService.getAllTestCycle();
            response.setData(list);
            response.setStatus(true);
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/auth/getTestCycleDistinct", method = RequestMethod.GET)
    public Response getTestCycleDistinct() {
        Response response = new Response();
        try {
            List<TestCycle> newList = new ArrayList<>();
            Set<String> nameSet = new HashSet<>();
            List<TestCycle> list = testCycleService.getAllTestCycle();
            for (TestCycle testCycle : list) {
                if (!nameSet.contains(testCycle.getTestCycleDescribe())) {
                    newList.add(testCycle);
                    nameSet.add(testCycle.getTestCycleDescribe());
                }
            }
            response.setData(newList);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/testCycle", method = RequestMethod.GET)
    public Response regist(@CookieValue(value="teamid") String teamid) {
        Response response = new Response();
        try {
//            response.setData(testCycleService.findTestCycleByTeamId(teamid));
            CycleTeamExample cycleTeamExample = new CycleTeamExample();
            cycleTeamExample.createCriteria().andTeamIdEqualTo(Integer.parseInt(teamid));
            List<CycleTeam> list = cycleTeamDao.selectByExample(cycleTeamExample);
            response.setData(list);
            response.setStatus(true);
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/uploadReport", method = RequestMethod.GET)
    public Response uploadReport(@RequestParam(value="cycleTeamId") Integer cycleteamid,
                                @RequestParam(value = "report") String report) {
        Response response = new Response();
        try {
            CycleTeamWithBLOBs cycleTeam = cycleTeamDao.selectByPrimaryKey(cycleteamid);
            cycleTeam.setReport(report);
            cycleTeam.setUpdateTime(new Date());
            cycleTeamDao.updateByPrimaryKeyWithBLOBs(cycleTeam);
            response.setStatus(true);
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addCycleTeam", method = RequestMethod.POST)
    @ResponseBody
    public Response uploadReport(@RequestBody CycleTeamWithBLOBs cycleTeam) {
        Response response = new Response();
        try {
            cycleTeam.setCreateTime(new Date());
            cycleTeam.setUpdateTime(new Date());
            cycleTeamDao.insertSelective(cycleTeam);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getTeamForCycle", method = RequestMethod.GET)
    public Response getTeamForCycle(@RequestParam(value = "testCycleId") Integer testCycleId,
                                    @CookieValue(value = "teamid") String teamid) {
        Response response = new Response();
        try {
            if (teamDao.selectByPrimaryKey(Integer.valueOf(teamid)).getPriority() <= 1)
                throw new Exception("权限不够!");
//            response.setData(testCycleService.findTestCycleByTeamId(teamid));
            CycleTeamExample cycleTeamExample = new CycleTeamExample();
            cycleTeamExample.createCriteria().andTestCycleIdEqualTo(testCycleId);
            List<CycleTeam> list = cycleTeamDao.selectByExample(cycleTeamExample);
            List<Team> teamList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                teamList.add(teamDao.selectByPrimaryKey(list.get(i).getTeamId()));
            }
            response.setData(teamList);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

}
