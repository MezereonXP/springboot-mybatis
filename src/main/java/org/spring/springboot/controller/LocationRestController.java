package org.spring.springboot.controller;

import org.spring.springboot.dao.LocationDao;
import org.spring.springboot.domain.Location;
import org.spring.springboot.domain.SampleWithBLOBs;
import org.spring.springboot.response.Response;
import org.spring.springboot.service.impl.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/14.
 */
@RestController
public class LocationRestController {

    @Autowired
    private LocationService locationService;

    @RequestMapping(value = "/api/addLocation", method = RequestMethod.POST)
    @ResponseBody
    public Response addLocation(@RequestBody Location location) {
        Response response = new Response();
        try {
            response.setStatus(locationService.addLocation(location)!=-1);
            response.setData(location.getLocationid());
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}
