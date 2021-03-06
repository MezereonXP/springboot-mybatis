package org.spring.springboot.controller;

import org.spring.springboot.dao.LocationDao;
import org.spring.springboot.domain.Location;
import org.spring.springboot.response.Response;
import org.spring.springboot.service.impl.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/14.
 */
@RestController
public class LocationRestController {

    @Autowired
    private LocationService locationService;

    @Autowired
    private LocationDao locationDao;

    /**
     * 添加Location
     *
     * @param location
     * @return
     */
    @RequestMapping(value = "/api/addLocation", method = RequestMethod.POST)
    @ResponseBody
    public Response addLocation(@RequestBody Location location) {
        Response response = new Response();
        try {
            location.setCreatedAt(new Date());
            location.setUpdatedAt(new Date());
            locationDao.insertSelective(location);
            response.setStatus(location.getLocationId() != null);
            response.setData(location);
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/updateLocation", method = RequestMethod.POST)
    @ResponseBody
    public Response updateLocation(@RequestBody Location location) {
        Response response = new Response();
        try {
            location.setUpdatedAt(new Date());
            locationDao.updateByPrimaryKeySelective(location);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }


    /**
     * 按周期获取所有的样本点以及位置信息
     *
     * @return
     */
    @RequestMapping(value = "/getAllLocation", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllLocation() {
        Response response = new Response();
        try {
            response.setStatus(true);
            response.setData(locationService.getAllLocation());
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getAllLocationForCycleTeam", method = RequestMethod.GET)
    public Response getAllLocationForCycleTeam(@RequestParam(value = "cycleTeamName", required = true) Integer cycleTeamName,
                                               @CookieValue(value="teamid", required = true) String teamid) {
        Response response = new Response();
        try {
            response.setStatus(true);
            response.setData(locationService.getLocationForTeam(cycleTeamName));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

}
