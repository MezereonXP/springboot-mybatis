package org.spring.springboot.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;
import org.spring.springboot.dao.CentralizedTreatmentMethodMapper;
import org.spring.springboot.dao.CycleTeamDao;
import org.spring.springboot.dao.LocationDao;
import org.spring.springboot.dao.QuickMapMapper;
import org.spring.springboot.dao.SampleDao;
import org.spring.springboot.dao.TestCycleDao;
import org.spring.springboot.domain.*;
import org.spring.springboot.response.Response;
import org.spring.springboot.service.impl.SampleService;
import org.spring.springboot.service.impl.TestCycleService;
import org.spring.springboot.util.SetSampleDetails;
import org.spring.springboot.util.ValueUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @Autowired
    private TestCycleDao testCycleDao;

    @Autowired
    private CycleTeamDao cycleTeamDao;

    @Autowired
    private QuickMapMapper quickMapMapper;

    private static final String HOST = "47.92.254.221";

    @RequestMapping(value = "/auth/setPicForSample", method = RequestMethod.GET)
    public Response setPicForSample() {
        Response response = new Response();
        try {
            SampleExample sample = new SampleExample();
            sample.createCriteria();
            List<Sample> list = sampleDao.selectByExample(sample);
            for (int i = 0; i < list.size(); i++) {
                CycleTeam cycleTeam = cycleTeamDao.selectByPrimaryKey(list.get(i).getCycleTeamId());
                String url = "http://static.myh2o.org.cn/pic/0" + cycleTeam.getTestCycleId() + "_"
                        + (cycleTeam.getTeamId() > 9 ? "" : "0") + cycleTeam.getTeamId() + "_"
                        + list.get(i).getBaseId() + "_1.JPG";
                if (isImagesTrue(url).equals("200")) {
                    list.get(i).setPicture(url);
                    sampleDao.updateByPrimaryKeySelective(list.get(i));
                }
            }
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    /**
     * 判断网络图片是否存在
     * posturl 图片地址链接
     */
    public static String isImagesTrue(String posturl) throws IOException {
        URL url = new URL(posturl);
        HttpURLConnection urlcon = (HttpURLConnection) url.openConnection();
        urlcon.setRequestMethod("POST");
        urlcon.setRequestProperty("Content-type",
                "application/x-www-form-urlencoded");
        if (urlcon.getResponseCode() == HttpURLConnection.HTTP_OK) {
            System.out.println(HttpURLConnection.HTTP_OK + posturl
                    + ":posted ok!");
            return "200";
        } else {
            System.out.println(urlcon.getResponseCode() + posturl
                    + ":Bad post...");
            return "404";
        }
    }



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
            sampleDao.insertSelective(sample);
            response.setData(sample);
            response.setStatus(sample.getBaseId() != null);
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
        Gson gson = new Gson();
        JedisPool pool = new JedisPool(new JedisPoolConfig(), HOST);
        Jedis jedis = null;
        try {
            jedis = pool.getResource();
            if (!jedis.exists(testCycleId + ":" + year)) {
                List<TestCycle> testCycleList = getTestCycleListDistinct(testCycleId);
                List<ShowForIndex> result = new ArrayList<>();
                for (TestCycle testCycle : testCycleList) {
                    result.addAll(samplesService.getShowForIndexWithYear(testCycle.getTestCycleId(), year));
                }
                int i = 1;
                for (ShowForIndex showForIndex : result) {
                    showForIndex.setId(i);
                    i++;
                }
                jedis.set(testCycleId + ":" + year, gson.toJson(result));
                response.setData(result);
                response.setStatus(true);
                return response;
            } else {
                ShowForIndex[] result = gson.fromJson(jedis.get(testCycleId + ":" + year), ShowForIndex[].class);
                response.setData(result);
                response.setStatus(true);
                return response;
            }

        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        } finally {
            if (jedis != null) {
                jedis.close();
            }
            pool.close();
        }
    }

    /**
     * 返回相同描述的TestCycle列表
     *
     * @param testCycleId
     * @return
     */
    private List<TestCycle> getTestCycleListDistinct(Integer testCycleId) {
        List<TestCycle> newList = new ArrayList<>();
        String desc = testCycleDao.selectByPrimaryKey(testCycleId).getTestCycleDescribe();
        List<TestCycle> list = testCycleService.getAllTestCycle();
        for (TestCycle testCycle : list) {
            if (testCycle.getTestCycleDescribe().equals(desc)) {
                newList.add(testCycle);
            }
        }
        return newList;
    }

    @RequestMapping(value = "/auth/getStatisticsForIndexWithYear", method = RequestMethod.GET)
    public Response getStatisticsForIndexWithYear(@RequestParam(value = "testCycleId") Integer testCycleId,
                                                  @RequestParam(value = "year") String year) {
        Response response = new Response();
        List<TestCycle> testCycleList = getTestCycleListDistinct(testCycleId);
        try {
            Statistics statistics = new Statistics();
            statistics.setCountyCount(0);
            statistics.setPrefectureCount(0);
            statistics.setProvinceCount(0);
            statistics.setSampleCount(0);
            statistics.setTeamCount(0);
            Set<Integer> provinceSet = new HashSet<>();
            Set<Integer> prefectureSet = new HashSet<>();
            Set<Integer> countySet = new HashSet<>();
            Set<Integer> sampleSet = new HashSet<>();
            Set<Integer> teamSet = new HashSet<>();
            for (TestCycle testCycle : testCycleList) {
                samplesService.getDetailForIndexWithYear(testCycle.getTestCycleId(), year, statistics,
                        provinceSet, prefectureSet, countySet, sampleSet, teamSet);
            }
            response.setData(statistics);
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
