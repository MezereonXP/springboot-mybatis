package org.spring.springboot.service.impl;

import org.spring.springboot.dao.SampleDao;
import org.spring.springboot.dao.TestCycleDao;
import org.spring.springboot.domain.SampleWithBLOBs;
import org.spring.springboot.domain.ShowSamples;
import org.spring.springboot.domain.TestCycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/14.
 */
@Service
public class SampleService {

    @Autowired
    private SampleDao sampleDao;

    @Autowired
    private TestCycleDao testCycleDao;

    public SampleWithBLOBs selectById(Integer baseid) {
        return sampleDao.selectByPrimaryKey(baseid);
    }
    public boolean addSample(SampleWithBLOBs sample) {
        Integer count = sampleDao.insertSelective(sample);
        if(count == 1){
            return true;
        }else{
            return false;
        }
    }
    public boolean updateSample(SampleWithBLOBs sample) {
        Integer count = sampleDao.updateByPrimaryKeySelective(sample);
        if(count == 1){
            return true;
        }else{
            return false;
        }
    }

    public ShowSamples getShowSamples(String teamId) {
        ShowSamples showSamples = new ShowSamples();
        List<ShowSamples.ShowCycle> showCycles = new ArrayList<ShowSamples.ShowCycle>();
        List<TestCycle> testCycles = testCycleDao.findTestCycleByTeamId(teamId);
        for(TestCycle testCycle : testCycles){
            ShowSamples.ShowCycle showCycle = new ShowSamples.ShowCycle();
            showCycle.setSample(sampleDao.getSamplesByCycleTeamid(testCycle.getCycleteamid()));
            showCycle.setTestCycle(testCycle);
            showCycles.add(showCycle);
        }
        showSamples.setShowCycles(showCycles);
        return showSamples;
    }

    public ShowSamples getAllShowSamples(){
        ShowSamples showSamples = new ShowSamples();
        Map<Integer, ShowSamples.ShowCycle> map = new HashMap<Integer, ShowSamples.ShowCycle>();
        List<TestCycle> testCycleList = testCycleDao.getAllTestCycle();

        for (TestCycle testCycle : testCycleList){
            if (!map.containsKey(testCycle.getTestcycleid())){
                map.put(testCycle.getTestcycleid(), new ShowSamples.ShowCycle());
            }
            ShowSamples.ShowCycle showCycle = map.get(testCycle.getTestcycleid());
            for (SampleWithBLOBs sample:sampleDao.getSamplesByCycleTeamid(testCycle.getCycleteamid())){
                showCycle.getSample().add(sample);
            }
        }
        for (Integer i:map.keySet()){
            showSamples.getShowCycles().add(map.get(i));
        }
        return showSamples;
    }
}
