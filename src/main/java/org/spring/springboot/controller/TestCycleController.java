package org.spring.springboot.controller;

import java.util.List;
import org.spring.springboot.dao.CycleTeamDao;
import org.spring.springboot.domain.CycleTeam;
import org.spring.springboot.domain.Team;
import org.spring.springboot.domain.TestCycle;
import org.spring.springboot.response.Response;
import org.spring.springboot.service.impl.TeamService;
import org.spring.springboot.service.impl.TestCycleService;
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

    @RequestMapping(value = "/api/testCycle", method = RequestMethod.GET)
    public Response regist(@CookieValue(value="teamid") String teamid) {
        Response response = new Response();
        try {
//            response.setData(testCycleService.findTestCycleByTeamId(teamid));
            List<CycleTeam> list = cycleTeamDao.selectByTeamId(Integer.parseInt(teamid));
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
            CycleTeam cycleTeam = cycleTeamDao.selectByPrimaryKey(cycleteamid);
            cycleTeam.setReport(report);
            cycleTeamDao.updateByPrimaryKeyWithBLOBs(cycleTeam);
            response.setStatus(true);
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

}
