package org.spring.springboot.controller;

import org.spring.springboot.domain.SampleWithBLOBs;
import org.spring.springboot.response.Response;
import org.spring.springboot.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/14.
 */
@RestController
public class SampleRestController {

    @Autowired
    private SampleService samplesService;

    @RequestMapping(value = "/api/sample", method = RequestMethod.GET)
    public Response findOneCity(@RequestParam(value = "baseid", required = true) Integer baseid) {
        Response response = new Response();
        try {
            response.setStatus(samplesService.selectById(baseid)!=null);
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}
