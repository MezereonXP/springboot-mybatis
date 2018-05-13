package org.spring.springboot.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.spring.springboot.domain.*;
import org.spring.springboot.response.Response;
import org.spring.springboot.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SpaceRestController {

    private static Logger logger = LogManager.getLogger(SpaceRestController.class);

    @Autowired
    private ProvinceService provinceService;

    @Autowired
    private PrefectureService prefectureService;

    @Autowired
    private CountyService countyService;

    @Autowired
    private TownshipService townshipService;

    @Autowired
    private VillageService villageService;


    @RequestMapping(value = "/api/province", method = RequestMethod.GET)
    public Response getAllProvince() {
        Response response = new Response();
        try {
            List<Province> provinces = provinceService.getAllProvince();
            response.setStatus(provinces != null);
            response.setData(provinces);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/prefecture", method = RequestMethod.GET)
    public Response getPrefectureByProvinceId(@RequestParam(value = "provinceId") String provinceId) {
        Response response = new Response();
        try {
            List<Prefecture> prefectures = prefectureService.getPrefectureByProvinceId(provinceId);
            response.setStatus(prefectures != null);
            response.setData(prefectures);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/county", method = RequestMethod.GET)
    public Response getCountyByPrefectureId(@RequestParam(value = "prefectureId") String prefectureId) {
        Response response = new Response();
        try {
            List<County> counties = countyService.getCountyByPrefectureId(prefectureId);
            response.setStatus(counties != null);
            response.setData(counties);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/township", method = RequestMethod.GET)
    public Response getTownshipByCountyId(@RequestParam(value = "countyId") String countyId) {
        Response response = new Response();
        try {
            List<Township> townships = townshipService.getTownshipByCountyId(countyId);
            response.setStatus(townships != null);
            response.setData(townships);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/village", method = RequestMethod.GET)
    public Response getVillageByTownshipId(@RequestParam(value = "townshipId") String townshipId) {
        Response response = new Response();
        try {
            List<Village> villages = villageService.getVillageByTownshipId(townshipId);
            response.setStatus(villages != null);
            response.setData(villages);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

}
