package org.spring.springboot.controller;

import org.spring.springboot.dao.*;
import org.spring.springboot.domain.*;
import org.spring.springboot.response.Response;
import org.spring.springboot.util.MyException;
import org.spring.springboot.util.ValueUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

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

    @Autowired
    SampleDao sampleDao;
    @Autowired
    LocationDao locationDao;

    @Autowired
    HistoryMapper historyMapper;

    @Autowired
    TestCycleDao testCycleDao;
    @Autowired
    CycleTeamDao cycleTeamDao;


    @RequestMapping(value = "/api/getAllDeliveryMethods", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllDeliveryMethods() {
        Response response = new Response();
        try {
            response.setStatus(true);
            DeliveryMethodExample deliveryMethodExample = new DeliveryMethodExample();
            deliveryMethodExample.createCriteria().andVisibleEqualTo(0);
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
            drinkingWaterTypeExample.createCriteria().andVisibleEqualTo(0);
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
            waterTypeExample.createCriteria().andVisibleEqualTo(0);
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
            waterSourceTypeExample.createCriteria().andVisibleEqualTo(0);
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
            centralizedTreatmentMethodExample.createCriteria().andVisibleEqualTo(0);
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
            treatmentMethodExample.createCriteria().andVisibleEqualTo(0);
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
            waterStorageExample.createCriteria().andVisibleEqualTo(0);
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
            smellExample.createCriteria().andVisibleEqualTo(0);
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
            visualExample.createCriteria().andVisibleEqualTo(0);
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
            sanitaryExample.createCriteria().andVisibleEqualTo(0);
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
            potentialContam.createCriteria().andVisibleEqualTo(0);
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
        } catch (Exception e) {
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
        } catch (Exception e) {
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

    @RequestMapping(value = "/api/updateSuperSample", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Response updateSuperSample(HttpServletRequest req,
                                      HttpServletResponse resp,
                                      @RequestBody SuperSample sample) {
        Response response = new Response();
        try {
            response.setStatus(true);
            for (int i = 1; i <= 12; i++) {
                check(sample, i);
            }
            insert(sample);
            sample.setUpdateTime(new Date());
            sampleDao.updateByPrimaryKeySelective(sample);
            ValueUtil.setHistory(historyMapper, sample, req, ValueUtil.UPDATE_FLAG);
            response.setData(sample);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addSuperSample", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Response addSuperSample(HttpServletRequest req,
                                   HttpServletResponse resp,
                                   @RequestBody SuperSample sample) {
        Response response = new Response();
        try {
            response.setStatus(true);
            TestCycleExample testCycleExample = new TestCycleExample();
            testCycleExample.createCriteria().andTestCycleIdIsNotNull();
            List<TestCycle> testCycleList = testCycleDao.selectByExample(testCycleExample);
            Integer currentCycle = testCycleList.get(testCycleList.size() - 1).getTestCycleId();

            CycleTeam cycleTeam = cycleTeamDao.selectByPrimaryKey(sample.getCycleTeamId());
            if (cycleTeam == null) {
                throw new MyException("当前队伍并未报名任何周期");
            }
            if (cycleTeam != null && cycleTeam.getTestCycleId() != currentCycle) {
                throw new MyException("当前上传周期不是最新周期!");
            }
            for (int i = 1; i <= 12; i++) {
                check(sample, i);
            }
            insert(sample);
            sample.setValidationId(1);
            sample.setCreateTime(new Date());
            sample.setUpdateTime(new Date());
            sampleDao.insertSelective(sample);
            ValueUtil.setHistory(historyMapper, sample, req, ValueUtil.CREATE_FLAG);
            response.setData(sample);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    public void check(SuperSample sample, int flag) throws MyException {
        switch (flag) {
            case ValueUtil.WATERTYPE_FLAG:
                if (sample.getWaterTypeId() == null) {
                    if (sample.getWaterTypeDesc() == null) {
                        throw new MyException("缺少水类型信息");
                    }
                }
                break;
            case ValueUtil.CENTRALIZEDWATERMETHOD_FLAG:
                if (sample.getCentralizedWaterTreatmentMethodId() == null) {
                    if (sample.getCentrTreatmentMethodDesc() == null) {
                        throw new MyException("缺少中央处理方法信息");
                    }
                }
                break;
//            case ValueUtil.DELIVERYMETHOD_FLAG:
//                if (sample.getDeliveryMethodId() == null) {
//                    if (sample.getDeliveryMethodDesc() == null) {
//                        throw new MyException("缺少运输方式信息");
//                    }
//                }
//                break;
            case ValueUtil.DRINKINGWATER_FLAG:
                if (sample.getDrinkingWaterId() == null) {
                    if (sample.getDrinkWaterDesc() == null) {
                        throw new MyException("缺少饮用水类型信息");
                    }
                }
                break;
            case ValueUtil.POTENTIAL_FLAG:
                if (sample.getPotentialContamination() == null) {
                    if (sample.getContamDesc() == null) {
                        throw new MyException("缺少潜在污染源信息");
                    }
                }
                break;
            case ValueUtil.SANITARYTYPE_FLAG:
                if (sample.getSanitaryTypeId() == null) {
                    if (sample.getSanitaryTypeDesc() == null) {
                        throw new MyException("缺少饮用水卫生情况信息");
                    }
                }
                break;
            case ValueUtil.SMELL_FLAG:
                if (sample.getSmellId() == null) {
                    if (sample.getSmellDescDetails() == null) {
                        throw new MyException("缺少气味类型信息");
                    }
                }
                break;
            case ValueUtil.TREATMENTMETHOD_FLAG:
                if (sample.getTreatmentMethodId() == null) {
                    if (sample.getTreatmentMethodDesc() == null) {
                        throw new MyException("缺少饮用水卫生情况信息");
                    }
                }
                break;
            case ValueUtil.VISUAL_FLAG:
                if (sample.getVisualId() == null) {
                    if (sample.getVisualDesc() == null) {
                        throw new MyException("缺少水样描述信息");
                    }
                }
                break;
            case ValueUtil.WATERSOURCE_FLAG:
                if (sample.getWaterSourceTypeId() == null) {
                    if (sample.getWaterSourceDesc() == null) {
                        throw new MyException("缺少水样水源类型信息");
                    }
                }
                break;
            case ValueUtil.WATERSTORAGE_FLAG:
                if (sample.getWaterStorageId() == null) {
                    if (sample.getWaterStorageDesc() == null && sample.getAvgStorageHrs() == null) {
                        throw new MyException("缺少家庭储水容器信息");
                    }
                }
                break;
            case ValueUtil.LOCATION_FLAG:
                if (sample.getProvinceId() == null) {
                    throw new MyException("缺少provinceId信息");
                } else if (sample.getPrefectureId() == null) {
                    throw new MyException("缺少prefectureId信息");
                } else if (sample.getCountyId() == null) {
                    throw new MyException("缺少countyId信息");
                } else if (sample.getTownshipId() == null) {
                    throw new MyException("缺少townshipId信息");
                } else if (sample.getVillageId() == null) {
//                    throw new MyException("缺少villageId信息");
                } else if (sample.getLocationName() == null) {
                    throw new MyException("缺少locationName信息");
                } else if (sample.getLat() == null) {
                    throw new MyException("缺少lat信息");
                } else if (sample.getLog() == null) {
                    throw new MyException("缺少log信息");
                }
                break;
            default:
                break;
        }
    }

    public void insert(SuperSample sample) throws MyException {
        Location location = new Location();
        location.setProvinceId(sample.getProvinceId());
        location.setPrefectureId(sample.getPrefectureId());
        location.setCountyId(sample.getCountyId());
        location.setTownshipId(sample.getTownshipId());
        location.setVillageId(sample.getVillageId());
        location.setLocationName(sample.getLocationName());
        location.setLat(sample.getLat());
        location.setLog(sample.getLog());
        location.setCreatedAt(new Date());
        location.setUpdatedAt(new Date());
        locationDao.insertSelective(location);
        sample.setLocationId(location.getLocationId());
        if (sample.getWaterTypeId() == null) {
            WaterType waterType = new WaterType();
            waterType.setWaterTypeDesc(sample.getWaterTypeDesc());
            waterTypeMapper.insertSelective(waterType);
            sample.setWaterTypeId(waterType.getWaterTypeId());
        }
        if (sample.getCentrTreatmentMethodDesc() != null) {
            CentralizedTreatmentMethod centralizedTreatmentMethod = new CentralizedTreatmentMethod();
            centralizedTreatmentMethod.setCentrTreatmentMethodDesc(sample.getCentrTreatmentMethodDesc());
            centralizedTreatmentMethodMapper.insertSelective(centralizedTreatmentMethod);
            String temp = "";
            if (sample.getCentralizedWaterTreatmentMethodId() != null) {
                temp = sample.getCentralizedWaterTreatmentMethodId() + ";";
            }
            sample.setCentralizedWaterTreatmentMethodId(temp + centralizedTreatmentMethod.getCentrTreatmentMethodId());
        }
        if (sample.getDeliveryMethodId() == null && sample.getDeliveryMethodDesc() != null) {
            DeliveryMethod deliveryMethod = new DeliveryMethod();
            deliveryMethod.setDeliveryMethodDesc(sample.getDeliveryMethodDesc());
            deliveryMethodMapper.insertSelective(deliveryMethod);
            sample.setDeliveryMethodId(deliveryMethod.getDeliveryMethodId());
        }
        if (sample.getDrinkingWaterId() == null) {
            DrinkingWaterType drinkingWaterType = new DrinkingWaterType();
            drinkingWaterType.setDrinkWaterDesc(sample.getDrinkWaterDesc());
            drinkingWaterTypeMapper.insertSelective(drinkingWaterType);
            sample.setDrinkingWaterId(drinkingWaterType.getDrinkWaterId());
        }
        if (sample.getContamDesc() != null) {
            PotentialContam potentialContam = new PotentialContam();
            potentialContam.setContamDesc(sample.getContamDesc());
            potentialContamMapper.insertSelective(potentialContam);
            String temp = "";
            if (sample.getPotentialContamination() != null) {
                temp = sample.getPotentialContamination() + ";";
            }
            sample.setPotentialContamination(temp + potentialContam.getContamId());
        }
        if (sample.getSanitaryTypeId() == null) {
            Sanitary sanitary = new Sanitary();
            sanitary.setSanitaryTypeDesc(sample.getSanitaryTypeDesc());
            sanitaryMapper.insertSelective(sanitary);
            sample.setSanitaryTypeId(sanitary.getSanitaryTypeId());
        }
        if (sample.getSmellId() == null) {
            Smell smell = new Smell();
            smell.setSmellDesc(sample.getSmellDetail());
            smell.setSmellDescDetails(sample.getSmellDescDetails());
            smellMapper.insertSelective(smell);
            sample.setSmellId(smell.getSmellId());
        }
        if (sample.getTreatmentMethodDesc() != null) {
            TreatmentMethod treatmentMethod = new TreatmentMethod();
            treatmentMethod.setTreatmentMethodDesc(sample.getTreatmentMethodDesc());
            treatmentMethodMapper.insertSelective(treatmentMethod);
            String temp = "";
            if (sample.getTreatmentMethodId() != null) {
                temp = sample.getTreatmentMethodId() + ";";
            }
            sample.setTreatmentMethodId(temp + treatmentMethod.getTreatmentMethodId());
        }
        if (sample.getVisualId() == null) {
            Visual visual = new Visual();
            visual.setVisualDesc(sample.getVisualDesc());
            visual.setVisualDescDetails(sample.getVisualDetail());
            visualMapper.insertSelective(visual);
            sample.setVisualId(visual.getVisualID());
        }
        if (sample.getWaterSourceTypeId() == null) {
            WaterSourceType waterSourceType = new WaterSourceType();
            waterSourceType.setWaterSourceDesc(sample.getWaterSourceDesc());
            waterSourceTypeMapper.insertSelective(waterSourceType);
            sample.setWaterSourceTypeId(waterSourceType.getWaterSourceId());
        }
        if (sample.getWaterStorageDesc() != null) {
            WaterStorage waterStorage = new WaterStorage();
            waterStorage.setWaterStorageDesc(sample.getWaterStorageDesc());
            waterStorage.setAvgStorageHrs(sample.getAvgStorageHrs());
            waterStorageMapper.insertSelective(waterStorage);
            String temp = "";
            if (sample.getWaterStorageId() != null) {
                temp = sample.getWaterStorageId() + ";";
            }
            sample.setWaterStorageId(temp + waterStorage.getWaterStorageId());
        }

        sample.setTurbidityId(String.valueOf(ValueUtil.getMethodId(ValueUtil.TURBILITY_FLAG, sample.getTurbiditymethod())));
        sample.setTdsMethod(String.valueOf(ValueUtil.getMethodId(ValueUtil.TDS_FLAG, sample.getTdsMethod())));
        sample.setNo3Method(String.valueOf(ValueUtil.getMethodId(ValueUtil.NO3_FLAG, sample.getNo3Method())));
        sample.setPhMethod(String.valueOf(ValueUtil.getMethodId(ValueUtil.PH_FLAG, sample.getPhMethod())));
        sample.setfMethod(String.valueOf(ValueUtil.getMethodId(ValueUtil.F_FLAG, sample.getfMethod())));
        sample.setAsMethod(String.valueOf(ValueUtil.getMethodId(ValueUtil.AS_FLAG, sample.getAsMethod())));
        sample.setEcoilMethod(String.valueOf(ValueUtil.getMethodId(ValueUtil.ECOIL_FLAG, sample.getEcoilMethod())));
        sample.setNh3Method(String.valueOf(ValueUtil.getMethodId(ValueUtil.NH3_FLAG, sample.getNh3Method())));
    }
}
