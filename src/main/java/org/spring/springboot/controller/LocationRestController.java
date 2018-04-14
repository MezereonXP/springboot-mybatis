package org.spring.springboot.controller;

import org.spring.springboot.dao.LocationDao;
import org.spring.springboot.domain.Location;
import org.spring.springboot.domain.SampleWithBLOBs;
import org.spring.springboot.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/4/14.
 */
public class LocationRestController {

    @Autowired
    private LocationDao locationDao;

    @RequestMapping(value = "/api/addSample", method = RequestMethod.POST)
    @ResponseBody
    public Response addSample(@RequestBody Location location) {
        Response response = new Response();
        try {
            response.setStatus(locationDao.insert(location)!=-1);
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}
