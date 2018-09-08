package org.spring.springboot.controller;

import org.spring.springboot.dao.*;
import org.spring.springboot.domain.*;
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
    @Autowired
    DrinkingWaterTypeMapper drinkingWaterTypeMapper;
    @Autowired
    WaterTypeMapper waterTypeMapper;
    @Autowired
    WaterSourceTypeMapper waterSourceTypeMapper;
    @Autowired
    CentralizedTreatmentMethodMapper centralizedTreatmentMethodMapper;
    @Autowired
    TreatmentMethodMapper treatmentMethodMapper;
    @Autowired
    WaterStorageMapper waterStorageMapper;
    @Autowired
    SmellMapper smellMapper;
    @Autowired
    VisualMapper visualMapper;
    @Autowired
    TurbidityMapper turbidityMapper;
    @Autowired
    SanitaryMapper sanitaryMapper;
    @Autowired
    HealthCenterMapper healthCenterMapper;

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

    @RequestMapping(value = "/api/getAllDrinkingWaterTypes", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllDrinkingWaterTypes() {
        Response response = new Response();
        try {
            response.setStatus(true);
            DrinkingWaterTypeExample drinkingWaterTypeExample = new DrinkingWaterTypeExample();
            drinkingWaterTypeExample.createCriteria();
            response.setData(drinkingWaterTypeMapper.selectByExample(drinkingWaterTypeExample));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getAllWaterTypes", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllWaterTypes() {
        Response response = new Response();
        try {
            response.setStatus(true);
            WaterTypeExample waterTypeExample = new WaterTypeExample();
            waterTypeExample.createCriteria();
            response.setData(waterTypeMapper.selectByExample(waterTypeExample));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getAllWaterSourceTypes", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllWaterSourceTypes() {
        Response response = new Response();
        try {
            response.setStatus(true);
            WaterSourceTypeExample waterSourceTypeExample = new WaterSourceTypeExample();
            waterSourceTypeExample.createCriteria();
            response.setData(waterSourceTypeMapper.selectByExample(waterSourceTypeExample));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getAllCentralizedTreatmentMethods", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllCentralizedTreatmentMethods() {
        Response response = new Response();
        try {
            response.setStatus(true);
            CentralizedTreatmentMethodExample centralizedTreatmentMethodExample = new CentralizedTreatmentMethodExample();
            centralizedTreatmentMethodExample.createCriteria();
            response.setData(centralizedTreatmentMethodMapper.selectByExample(centralizedTreatmentMethodExample));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getAllTreatmentMethods", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllTreatmentMethods() {
        Response response = new Response();
        try {
            response.setStatus(true);
            TreatmentMethodExample treatmentMethodExample = new TreatmentMethodExample();
            treatmentMethodExample.createCriteria();
            response.setData(treatmentMethodMapper.selectByExample(treatmentMethodExample));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getAllWaterStorages", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllWaterStorages() {
        Response response = new Response();
        try {
            response.setStatus(true);
            WaterStorageExample waterStorageExample= new WaterStorageExample();
            waterStorageExample.createCriteria();
            response.setData(waterStorageMapper.selectByExample(waterStorageExample));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getAllSmells", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllSmells() {
        Response response = new Response();
        try {
            response.setStatus(true);
            SmellExample smellExample = new SmellExample();
            smellExample.createCriteria();
            response.setData(smellMapper.selectByExample(smellExample));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getAllVisuals", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllVisuals() {
        Response response = new Response();
        try {
            response.setStatus(true);
            VisualExample visualExample = new VisualExample();
            visualExample.createCriteria();
            response.setData(visualMapper.selectByExample(visualExample));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getAllTurbiditys", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllTurbiditys() {
        Response response = new Response();
        try {
            response.setStatus(true);
            TurbidityExample turbidityExample = new TurbidityExample();
            turbidityExample.createCriteria();
            response.setData(turbidityMapper.selectByExample(turbidityExample));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getAllSanitarys", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllSanitarys() {
        Response response = new Response();
        try {
            response.setStatus(true);
            SanitaryExample sanitaryExample = new SanitaryExample();
            sanitaryExample.createCriteria();
            response.setData(sanitaryMapper.selectByExample(sanitaryExample));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getAllSHealthCenters", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllHealthCenters() {
        Response response = new Response();
        try {
            response.setStatus(true);
            HealthCenterExample healthCenterExample = new HealthCenterExample();
            healthCenterExample.createCriteria();
            response.setData(healthCenterMapper.selectByExample(healthCenterExample));
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}
