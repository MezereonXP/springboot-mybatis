package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CycleTeamDao;
import org.spring.springboot.dao.SampleDao;
import org.spring.springboot.dao.TestCycleDao;
import org.spring.springboot.domain.CycleTeam;
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

    @Autowired
    private CycleTeamDao cycleTeamDao;

    public SampleWithBLOBs selectById(Integer baseid) {
        return sampleDao.selectByPrimaryKey(baseid);
    }

    public List<SampleWithBLOBs> selectByCycleTeamId(Integer cycleTeamId){
        return sampleDao.getSamplesByCycleTeamid(cycleTeamId);
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

    //需要修改
    public ShowSamples getShowSamples(Integer teamId) {
        ShowSamples showSamples = new ShowSamples();
        List<ShowSamples.ShowCycle> showCycles = new ArrayList<ShowSamples.ShowCycle>();
        List<CycleTeam> cycleTeams = cycleTeamDao.selectByTeamId(teamId);
        for(CycleTeam cycleTeam : cycleTeams){
            ShowSamples.ShowCycle showCycle = new ShowSamples.ShowCycle();
            showCycle.setSample(sampleDao.getSamplesByCycleTeamid(cycleTeam.getCycleteamid()));
            showCycle.setTestCycle(testCycleDao.selectByPrimaryKey(cycleTeam.getTestcycleid()));
            showCycles.add(showCycle);
        }
        showSamples.setShowCycles(showCycles);
        return showSamples;
    }

    //需要修改
    public ShowSamples getAllShowSamples(){
        ShowSamples showSamples = new ShowSamples();
        Map<Integer, ShowSamples.ShowCycle> map = new HashMap<Integer, ShowSamples.ShowCycle>();
        List<TestCycle> testCycleList = testCycleDao.getAllTestCycle();

        for (TestCycle testCycle : testCycleList){
            if (!map.containsKey(testCycle.getTestcycleid())){
                map.put(testCycle.getTestcycleid(), new ShowSamples.ShowCycle());
                map.get(testCycle.getTestcycleid()).setTestCycle(testCycle);
            }
            ShowSamples.ShowCycle showCycle = map.get(testCycle.getTestcycleid());
            List<CycleTeam> list = cycleTeamDao.selectByTestCycleId(testCycle.getTestcycleid());
            for (CycleTeam cycleTeam:list) {
                for (SampleWithBLOBs sample : sampleDao.getSamplesByCycleTeamid(cycleTeam.getCycleteamid())) {
                    showCycle.getSample().add(sample);
                }
            }
        }
        for (Integer i:map.keySet()){
            showSamples.getShowCycles().add(map.get(i));
        }
        return showSamples;
    }
}
