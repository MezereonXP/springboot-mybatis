package org.spring.springboot.controller;

import org.spring.springboot.domain.Sample;
import org.spring.springboot.domain.SampleWithBLOBs;
import org.spring.springboot.response.Response;
import org.spring.springboot.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

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
    public Response addSample(@RequestBody Sample sample) {
        Response response = new Response();
        try {
            response.setStatus(false);
            response.setData(false);
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }


}
