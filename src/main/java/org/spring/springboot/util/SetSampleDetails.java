package org.spring.springboot.util;

import org.spring.springboot.dao.*;
import org.spring.springboot.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.StringTokenizer;

@Service
public class SetSampleDetails {
    @Autowired
    private CentralizedTreatmentMethodMapper centralizedTreatmentMethodMapper;
    @Autowired
    private WaterTypeMapper waterTypeMapper;
    @Autowired
    private WaterSourceTypeMapper waterSourceTypeMapper;
    @Autowired
    private DeliveryMethodMapper deliveryMethodMapper;
    @Autowired
    private DrinkingWaterTypeMapper drinkingWaterTypeMapper;
    @Autowired
    private IntakeMethodMapper intakeMethodMapper;
    @Autowired
    private TreatmentMethodMapper treatmentMethodMapper;
    @Autowired
    private WaterStorageMapper waterStorageMapper;
    @Autowired
    private SmellMapper smellMapper;
    @Autowired
    private VisualMapper visualMapper;
    @Autowired
    private TurbidityMapper turbidityMapper;
    @Autowired
    private SanitaryMapper sanitaryMapper;
    @Autowired
    private HealthCenterMapper healthCenterMapper;

    private final static String DEFAULT = "暂无";

    public void setSampleDetails(SampleDetails sampleDetails) {
        CentralizedTreatmentMethod centralizedTreatmentMethod = centralizedTreatmentMethodMapper.selectByPrimaryKey(sampleDetails.getSample().getCentralizedWaterTreatmentMethodId());
        WaterType waterType = waterTypeMapper.selectByPrimaryKey(sampleDetails.getSample().getWaterTypeId());
        WaterSourceType waterSourceType = waterSourceTypeMapper.selectByPrimaryKey(sampleDetails.getSample().getWaterSourceTypeId());
        DeliveryMethod deliveryMethod = deliveryMethodMapper.selectByPrimaryKey(sampleDetails.getSample().getDeliveryMethodId());
        DrinkingWaterType drinkingWaterType = drinkingWaterTypeMapper.selectByPrimaryKey(sampleDetails.getSample().getDrinkingWaterId());
        IntakeMethod intakeMethod = intakeMethodMapper.selectByPrimaryKey(sampleDetails.getSample().getInTakeMethodId());
        TreatmentMethod treatmentMethod = treatmentMethodMapper.selectByPrimaryKey(sampleDetails.getSample().getTreatmentMethodId());
        WaterStorage waterStorage = waterStorageMapper.selectByPrimaryKey(sampleDetails.getSample().getWaterStorageId());
        Smell smell = smellMapper.selectByPrimaryKey(sampleDetails.getSample().getSmellId());
        Visual visual = visualMapper.selectByPrimaryKey(sampleDetails.getSample().getVisualId());
        Turbidity turbidity = turbidityMapper.selectByPrimaryKey(sampleDetails.getSample().getTurbidityId());
        Sanitary sanitary = sanitaryMapper.selectByPrimaryKey(sampleDetails.getSample().getSanitaryTypeId());
        ArrayList<HealthCenter> healthCenters = new ArrayList<>();
        String healthCenterIds = sampleDetails.getSample().getHealthCenterId();
        if (healthCenterIds != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(healthCenterIds, ";");
            while (stringTokenizer.hasMoreElements()) {
                int healthCenterId = Integer.parseInt(stringTokenizer.nextToken());
                HealthCenter healthCenter = healthCenterMapper.selectByPrimaryKey(healthCenterId);
                if (healthCenter != null) {
                    healthCenters.add(healthCenter);
                }
            }
        }
        if (centralizedTreatmentMethod != null) {
            sampleDetails.setCentralizedWaterTreatmentMethodDesc(centralizedTreatmentMethod.getCentrTreatmentMethodDesc());
        } else {
            sampleDetails.setCentralizedWaterTreatmentMethodDesc(DEFAULT);
        }
        if (waterType != null) {
            sampleDetails.setWaterTypeDesc(waterType.getWaterTypeDesc());
        } else {
            sampleDetails.setWaterTypeDesc(DEFAULT);
        }
        if (waterSourceType != null) {
            sampleDetails.setWaterSourceDesc(waterSourceType.getWaterSourceDesc());
        } else {
            sampleDetails.setWaterSourceDesc(DEFAULT);
        }
        if (deliveryMethod != null) {
            sampleDetails.setDeliveryMethodDesc(deliveryMethod.getDeliveryMethodDesc());
        } else {
            sampleDetails.setDeliveryMethodDesc(DEFAULT);
        }
        if (drinkingWaterType != null) {
            sampleDetails.setDrinkingWaterDesc(drinkingWaterType.getDrinkWaterDesc());
        } else {
            sampleDetails.setDrinkingWaterDesc(DEFAULT);
        }
        if (intakeMethod != null) {
            sampleDetails.setInTakeMethodDesc(intakeMethod.getIntakeMethodDesc());
        } else {
            sampleDetails.setInTakeMethodDesc(DEFAULT);
        }
        if (treatmentMethod != null) {
            sampleDetails.setTreatmentMethodDesc(treatmentMethod.getTreatmentMethodDesc());
        } else {
            sampleDetails.setTreatmentMethodDesc(DEFAULT);
        }
        if (waterStorage != null) {
            sampleDetails.setWaterStorageDesc(waterStorage.getWaterStorageDesc());
        } else {
            sampleDetails.setWaterStorageDesc(DEFAULT);
        }
        if (smell != null) {
            sampleDetails.setSmellDesc(smell.getSmellDesc());
        } else {
            sampleDetails.setSmellDesc(DEFAULT);
        }
        if (visual != null) {
            sampleDetails.setVisualDesc(visual.getVisualDesc());
        } else {
            sampleDetails.setVisualDesc(DEFAULT);
        }
        sampleDetails.setTurbidity(turbidity);
        if (sanitary != null) {
            sampleDetails.setSanitaryTypeDesc(sanitary.getSanitaryTypeDesc());
        } else {
            sampleDetails.setSanitaryTypeDesc(DEFAULT);
        }
        String healthCenterDesc = "";
        for (HealthCenter healthCenter : healthCenters) {
            healthCenterDesc += healthCenter.getHealthCenterDesc() + ";";
        }
        if (healthCenterDesc == "") {
            sampleDetails.setHealthCenterDesc(DEFAULT);
        } else {
            healthCenterDesc = healthCenterDesc.substring(0, healthCenterDesc.length() - 1);
            sampleDetails.setHealthCenterDesc(healthCenterDesc);
        }
    }
}
