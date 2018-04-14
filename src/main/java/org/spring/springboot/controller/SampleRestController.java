package org.spring.springboot.controller;

import org.spring.springboot.domain.Sample;
import org.spring.springboot.domain.SampleWithBLOBs;
import org.spring.springboot.domain.ShowSamples;
import org.spring.springboot.domain.TestCycle;
import org.spring.springboot.response.Response;
import org.spring.springboot.service.impl.SampleService;
import org.spring.springboot.service.impl.TestCycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018/4/14.
 */
@RestController
public class SampleRestController {

    @Autowired
    private SampleService samplesService;

    @Autowired
    private TestCycleService testCycleService;

    @RequestMapping(value = "/api/sample", method = RequestMethod.GET)
    public Response findOneSample(@RequestParam(value = "baseid", required = true) Integer baseid) {
        Response response = new Response();
        try {
            SampleWithBLOBs sampleWithBLOBs = samplesService.selectById(baseid);
            response.setStatus(sampleWithBLOBs!=null);
            response.setData(sampleWithBLOBs);
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addSample", method = RequestMethod.POST)
    @ResponseBody
    public Response addSample(@RequestBody SampleWithBLOBs sample) {
        Response response = new Response();
        try {
            response.setStatus(samplesService.addSample(sample));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/updateSample", method = RequestMethod.POST)
    @ResponseBody
    public Response updateSample(@RequestBody SampleWithBLOBs sample) {
        Response response = new Response();
        try {
            response.setStatus(samplesService.updateSample(sample));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }


    @RequestMapping(value = "/api/findAllSample", method = RequestMethod.POST)
    @ResponseBody
    public Response findSample() {
        Response response = new Response();
        try {
//            response.setStatus(samplesService.addSample());
            List<TestCycle> testCycleList = testCycleService.getAllTestCycle();
            for (TestCycle testCycle:testCycleList){
//                List<Sample> samples = testCycle.getCycleteamid();
            }
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getShowSamples", method = RequestMethod.GET)
    public Response getShowSamples(@CookieValue(value="teamid") String teamid) {
        Response response = new Response();
        try {
            response.setData(samplesService.getShowSamples(teamid));
            response.setStatus(true);
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getAllShowSamples", method = RequestMethod.GET)
    public Response getAllShowSamples() {
        Response response = new Response();
        try {
            response.setData(samplesService.getAllShowSamples());
            response.setStatus(true);
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }


}
