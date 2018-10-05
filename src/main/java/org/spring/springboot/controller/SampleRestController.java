package org.spring.springboot.controller;

import org.spring.springboot.dao.CentralizedTreatmentMethodMapper;
import org.spring.springboot.dao.LocationDao;
import org.spring.springboot.dao.SampleDao;
import org.spring.springboot.domain.*;
import org.spring.springboot.response.Response;
import org.spring.springboot.service.impl.SampleService;
import org.spring.springboot.service.impl.TestCycleService;
import org.spring.springboot.util.SetSampleDetails;
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
    private LocationDao locationDao;

    @Autowired
    private TestCycleService testCycleService;

    @Autowired
    private SetSampleDetails setSampleDetails;

    @Autowired
    private SampleDao sampleDao;


    @RequestMapping(value = "/api/sample", method = RequestMethod.GET)
    public Response findOneSample(@RequestParam(value = "baseid", required = true) Integer baseid) {
        Response response = new Response();
        try {
            Sample sample = samplesService.selectById(baseid);
            response.setStatus(sample != null);
            response.setData(sample);
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addSample", method = RequestMethod.POST)
    @ResponseBody
    public Response addSample(@RequestBody Sample sample) {
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
    public Response updateSample(@RequestBody Sample sample) {
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

    @RequestMapping(value = "/api/bindBlog", method = RequestMethod.GET)
    public Response bindBlog(@RequestParam(value="baseid") Integer baseid,
                                @RequestParam(value="blogid") Integer blogid) {
        Response response = new Response();
        try {
            Sample sample = samplesService.selectById(baseid);
            Location location = locationDao.selectByPrimaryKey(sample.getLocationId());
            location.setBlogId(blogid);
            locationDao.updateByPrimaryKeySelective(location);
            response.setStatus(true);
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
    public Response getShowSamples(@CookieValue(value="teamid") Integer teamid) {
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

    @RequestMapping(value = "/getShowForIndex", method = RequestMethod.GET)
    public Response getShowForIndex(@RequestParam(value = "testCycleId") Integer testCycleId) {
        Response response = new Response();
        try {
            response.setData(samplesService.getShowForIndex(testCycleId));
            response.setStatus(true);
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/auth/getShowForIndexWithYear", method = RequestMethod.GET)
    public Response getShowForIndexWithYear(@RequestParam(value = "testCycleId") Integer testCycleId,
                                            @RequestParam(value = "year") String year) {
        Response response = new Response();
        try {
            response.setData(samplesService.getShowForIndexWithYear(testCycleId, year));
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getSamppleDetailsById", method = RequestMethod.GET)
    public Response getSamppleDetailsById(@RequestParam(value = "baseid") Integer baseid) {
        Response response = new Response();
        try {
            Sample sample = samplesService.selectById(baseid);
            SampleDetails sampleDetails = new SampleDetails();
            sampleDetails.setSample(sample);
            setSampleDetails.setSampleDetails(sampleDetails);
            response.setData(sampleDetails);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/updateMutiResopnse", method = RequestMethod.GET)
    public Response updateMutiResopnse() {
        Response response = new Response();
        try {
            SampleExample sampleExample = new SampleExample();
            sampleExample.createCriteria();
            List<Sample> samples = sampleDao.selectByExample(sampleExample);
            for (int i = 0; i < samples.size(); i++) {
                String healthCenter = samples.get(i).getHealthCenterId();
                String dh = samples.get(i).getDiarrheaCause();
                if (healthCenter != null) {
                    String realH = healthCenter.replace("；", ";");
                    samples.get(i).setHealthCenterId(realH);
                }
                if (dh != null) {
                    String realDh = dh.replace("；", ";");
                    samples.get(i).setDiarrheaCause(realDh);
                }
                samplesService.updateSample(samples.get(i));
            }
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            //response.setData(new Sample());
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

}
