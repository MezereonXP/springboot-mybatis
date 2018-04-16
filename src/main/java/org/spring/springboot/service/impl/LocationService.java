package org.spring.springboot.service.impl;

import org.spring.springboot.dao.LocationDao;
import org.spring.springboot.dao.SampleDao;
import org.spring.springboot.dao.TestCycleDao;
import org.spring.springboot.domain.Location;
import org.spring.springboot.domain.Sample;
import org.spring.springboot.domain.SampleWithBLOBs;
import org.spring.springboot.domain.SampleWithLocation;
import org.spring.springboot.domain.ShowSamples;
import org.spring.springboot.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/14.
 */

@Service
public class LocationService {

    @Autowired
    private LocationDao locationDao;

    @Autowired
    private SampleService sampleService;

    @Autowired
    private TestCycleDao testCycleDao;

    public Integer addLocation(Location location){
        int count = locationDao.insert(location);
        if (count == 1){
            return location.getLocationid();
        } else {
            return -1;
        }
    }

    /**
     * 获取所有的location， 并且将Sample和对应的Location返回
     *
     * @return
     */
    public Map<Integer, List<SampleWithLocation>> getAllLocation(){
        Map<Integer, List<SampleWithLocation>> map = new HashMap<Integer, List<SampleWithLocation>>();
        ShowSamples showSamples = sampleService.getAllShowSamples();
        for (ShowSamples.ShowCycle showCycle:showSamples.getShowCycles()){
            Integer tempCycleId = showCycle.getTestCycle().getTestcycleid();
            map.put(tempCycleId, new ArrayList<SampleWithLocation>());
            for (SampleWithBLOBs sample:showCycle.getSample()){
                SampleWithLocation sampleWithLocation = new SampleWithLocation();
                Location location = locationDao.selectByPrimaryKey(sample.getLocationid());
                sampleWithLocation.setLocation(location);
                sampleWithLocation.setSampleWithBLOBs(sample);
                map.get(tempCycleId).add(sampleWithLocation);
            }
        }
        return map;
    }

}
