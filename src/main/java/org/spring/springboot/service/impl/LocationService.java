package org.spring.springboot.service.impl;

import org.spring.springboot.dao.LocationDao;
import org.spring.springboot.dao.SampleDao;
import org.spring.springboot.dao.TestCycleDao;
import org.spring.springboot.domain.Location;
import org.spring.springboot.domain.Sample;
import org.spring.springboot.domain.SampleWithBLOBs;
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
     * 获取所有的location， 并且根据测试周期进行分组， 组合成map进行返回
     *
     * @return
     */
    public Map<Integer, List<Location>> getAllLocation(){
        Map<Integer, List<Location>> map = new HashMap<Integer, List<Location>>();
        ShowSamples showSamples = sampleService.getAllShowSamples();
        for (ShowSamples.ShowCycle showCycle:showSamples.getShowCycles()){
            Integer tempCycleId = showCycle.getTestCycle().getTestcycleid();
            map.put(tempCycleId, new ArrayList<Location>());
            for (SampleWithBLOBs sample:showCycle.getSample()){
                Location location = locationDao.selectByPrimaryKey(sample.getLocationid());
                map.get(tempCycleId).add(location);
            }
        }
        return map;
    }

}
