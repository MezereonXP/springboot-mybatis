package org.spring.springboot.controller;

import org.spring.springboot.dao.DeliveryMethodMapper;
import org.spring.springboot.domain.DeliveryMethodExample;
import org.spring.springboot.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListRestController {

    @Autowired
    DeliveryMethodMapper deliveryMethodMapper;

    @RequestMapping(value = "/api/getAllDeliveryMethods", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllDeliveryMethods() {
        Response response = new Response();
        try {
            response.setStatus(true);
            DeliveryMethodExample deliveryMethodExample = new DeliveryMethodExample();
            deliveryMethodExample.createCriteria();
            response.setData(deliveryMethodMapper.selectByExample(deliveryMethodExample));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}
