package org.spring.springboot.controller;

import org.spring.springboot.dao.*;
import org.spring.springboot.domain.*;
import org.spring.springboot.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    DiarrheaCauseMapper diarrheaCauseMapper;
    @Autowired
    MethodMapper methodMapper;
    @Autowired
    UniversityMapper universityMapper;

    @Autowired
    PotentialContamMapper potentialContamMapper;

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
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addDeliveryMethod", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Response addDeliveryMethod(@RequestBody DeliveryMethod deliveryMethod) {
        Response response = new Response();
        try {
            response.setStatus(true);
            deliveryMethodMapper.insertSelective(deliveryMethod);
            response.setData(deliveryMethod);
            return response;
        } catch (Exception e) {
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
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addDrinkingWaterType", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Response addDrinkingWaterType(@RequestBody DrinkingWaterType drinkingWaterType) {
        Response response = new Response();
        try {
            response.setStatus(true);
            drinkingWaterTypeMapper.insertSelective(drinkingWaterType);
            response.setData(drinkingWaterType);
            return response;
        } catch (Exception e) {
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
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addWaterType", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Response addWaterType(@RequestBody WaterType waterType) {
        Response response = new Response();
        try {
            response.setStatus(true);
            waterTypeMapper.insertSelective(waterType);
            response.setData(waterType);
            return response;
        } catch (Exception e) {
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
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addWaterSourceType", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Response addWaterSourceType(@RequestBody WaterSourceType waterSourceType) {
        Response response = new Response();
        try {
            response.setStatus(true);
            waterSourceTypeMapper.insertSelective(waterSourceType);
            response.setData(waterSourceType);
            return response;
        } catch (Exception e) {
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
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addCentralizedTreatmentMethod", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Response addCentralizedTreatmentMethod(@RequestBody CentralizedTreatmentMethod centralizedTreatmentMethod) {
        Response response = new Response();
        try {
            response.setStatus(true);
            centralizedTreatmentMethodMapper.insertSelective(centralizedTreatmentMethod);
            response.setData(centralizedTreatmentMethod);
            return response;
        } catch (Exception e) {
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
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addTreatmentMethod", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Response addTreatmentMethod(@RequestBody TreatmentMethod treatmentMethod) {
        Response response = new Response();
        try {
            response.setStatus(true);
            treatmentMethodMapper.insertSelective(treatmentMethod);
            response.setData(treatmentMethod);
            return response;
        } catch (Exception e) {
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
            WaterStorageExample waterStorageExample = new WaterStorageExample();
            waterStorageExample.createCriteria();
            response.setData(waterStorageMapper.selectByExample(waterStorageExample));
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addWaterStorage", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Response addWaterStorage(@RequestBody WaterStorage waterStorage) {
        Response response = new Response();
        try {
            response.setStatus(true);
            waterStorageMapper.insertSelective(waterStorage);
            response.setData(waterStorage);
            return response;
        } catch (Exception e) {
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
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addSmell", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Response addSmell(@RequestBody Smell smell) {
        Response response = new Response();
        try {
            response.setStatus(true);
            smellMapper.insertSelective(smell);
            response.setData(smell);
            return response;
        } catch (Exception e) {
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
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addVisual", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Response addVisual(@RequestBody Visual visual) {
        Response response = new Response();
        try {
            response.setStatus(true);
            visualMapper.insertSelective(visual);
            response.setData(visual);
            return response;
        } catch (Exception e) {
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
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addTurbidity", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Response addTurbidity(@RequestBody Turbidity turbidity) {
        Response response = new Response();
        try {
            response.setStatus(true);
            turbidityMapper.insertSelective(turbidity);
            response.setData(turbidity);
            return response;
        } catch (Exception e) {
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
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addSanitary", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Response addSanitary(@RequestBody Sanitary sanitary) {
        Response response = new Response();
        try {
            response.setStatus(true);
            sanitaryMapper.insertSelective(sanitary);
            response.setData(sanitary);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getAllHealthCenters", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllHealthCenters() {
        Response response = new Response();
        try {
            response.setStatus(true);
            HealthCenterExample healthCenterExample = new HealthCenterExample();
            healthCenterExample.createCriteria();
            response.setData(healthCenterMapper.selectByExample(healthCenterExample));
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addHealthCenter", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Response addHealthCenter(@RequestBody HealthCenter healthCenter) {
        Response response = new Response();
        try {
            response.setStatus(true);
            healthCenterMapper.insertSelective(healthCenter);
            response.setData(healthCenter);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getAllPotentialContams", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllPotentialContams() {
        Response response = new Response();
        try {
            response.setStatus(true);
            PotentialContamExample potentialContam = new PotentialContamExample();
            potentialContam.createCriteria();
            response.setData(potentialContamMapper.selectByExample(potentialContam));
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getAllMethods", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllMethods() {
        Response response = new Response();
        try {
            response.setStatus(true);
            MethodExample methodExample = new MethodExample();
            methodExample.createCriteria();
            response.setData(methodMapper.selectByExample(methodExample));
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getMethodsByName", method = RequestMethod.GET)
    @CrossOrigin
    public Response getMethodsByName(@RequestParam(value = "name") String name) {
        Response response = new Response();
        try {
            response.setStatus(true);
            name = name.replace(" ", "+");
            MethodExample methodExample = new MethodExample();
            methodExample.createCriteria().andIndexNameEqualTo(name);
            response.setData(methodMapper.selectByExample(methodExample));
            return response;
        }catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
    @RequestMapping(value = "/api/addMethod", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Response addMethod(@RequestBody Method method) {
        Response response = new Response();
        try {
            response.setStatus(true);
            methodMapper.insertSelective(method);
            response.setData(method);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getAllDiarrheaCauses", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllDiarrheacauses() {
        Response response = new Response();
        try {
            response.setStatus(true);
            DiarrheaCauseExample diarrheaCauseExample = new DiarrheaCauseExample();
            diarrheaCauseExample.createCriteria();
            response.setData(diarrheaCauseMapper.selectByExample(diarrheaCauseExample));
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/auth/getAllUniversities", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllUniversities() {
        Response response = new Response();
        try {
            response.setStatus(true);
            UniversityExample universityExample = new UniversityExample();
            universityExample.createCriteria();
            response.setData(universityMapper.selectByExample(universityExample));
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/auth/getAllUniversityById", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllUniversityById(@RequestParam(value = "id") Integer id) {
        Response response = new Response();
        try {
            response.setStatus(true);
            response.setData(universityMapper.selectByPrimaryKey(id));
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/auth/searchUniversityByName", method = RequestMethod.GET)
    @CrossOrigin
    public Response searchUniversityByName(@RequestParam(value = "name") String name) {
        Response response = new Response();
        try {
            response.setStatus(true);
            UniversityExample universityExample = new UniversityExample();
            universityExample.createCriteria().andUniversityNameLike("%" + name + "%");
            response.setData(universityMapper.selectByExample(universityExample));
            return response;
        }catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
    @RequestMapping(value = "/api/addDiarrheacause", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Response addDiarrheacause(@RequestBody DiarrheaCause diarrheaCause) {
        Response response = new Response();
        try {
            response.setStatus(true);
            diarrheaCauseMapper.insertSelective(diarrheaCause);
            response.setData(diarrheaCause);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}
