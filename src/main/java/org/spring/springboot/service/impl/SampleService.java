package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CycleTeamDao;
import org.spring.springboot.dao.LocationDao;
import org.spring.springboot.dao.SampleDao;
import org.spring.springboot.dao.SingleChooseDao;
import org.spring.springboot.dao.TeamDao;
import org.spring.springboot.dao.TestCycleDao;
import org.spring.springboot.dao.WaterSourceTypeMapper;
import org.spring.springboot.domain.*;
import org.spring.springboot.util.ListConverter;
import org.spring.springboot.util.ValueUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

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

    @Autowired
    private LocationDao locationDao;

    @Autowired
    private TeamDao teamDao;

    @Autowired
    private SingleChooseDao singleChooseDao;

    @Autowired
    private WaterSourceTypeMapper waterSourceTypeMapper;

    public Sample selectById(Integer baseid) {
        return sampleDao.selectByPrimaryKey(baseid);
    }

    public List<Sample> selectByCycleTeamId(Integer cycleTeamId) {
        SampleExample sampleExample = new SampleExample();
        sampleExample.createCriteria().andCycleTeamIdEqualTo(cycleTeamId);
        return sampleDao.selectByExample(sampleExample);
    }

    public boolean addSample(Sample sample) {
        Integer count = sampleDao.insertSelective(sample);
        if(count == 1){
            return true;
        }else{
            return false;
        }
    }

    public boolean updateSample(Sample sample) {
        Integer count = sampleDao.updateByPrimaryKeySelective(sample);
        if(count == 1){
            return true;
        }else{
            return false;
        }
    }

    //需要修改
    public CleanShowSamples getShowSamples(Integer teamId) {
        CleanShowSamples showSamples = new CleanShowSamples();
        List<CleanShowCycle> showCycles = new ArrayList<>();
        CycleTeamExample cycleTeamExample = new CycleTeamExample();
        cycleTeamExample.createCriteria().andTeamIdEqualTo(teamId);
        List<CycleTeam> cycleTeams = cycleTeamDao.selectByExample(cycleTeamExample);
        for(CycleTeam cycleTeam : cycleTeams){
            CleanShowCycle cleanShowCycle = new CleanShowCycle();
            cleanShowCycle.setSample(ValueUtil.toCleanSampleList(selectByCycleTeamId(cycleTeam.getCycleTeamId()), locationDao));
            cleanShowCycle.setTestCycle(testCycleDao.selectByPrimaryKey(cycleTeam.getTestCycleId()));
            showCycles.add(cleanShowCycle);
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
            if (!map.containsKey(testCycle.getTestCycleId())) {
                map.put(testCycle.getTestCycleId(), new ShowSamples.ShowCycle());
                map.get(testCycle.getTestCycleId()).setTestCycle(testCycle);
            }
            ShowSamples.ShowCycle showCycle = map.get(testCycle.getTestCycleId());
            CycleTeamExample cycleTeamExample = new CycleTeamExample();
            cycleTeamExample.createCriteria().andTestCycleIdEqualTo(testCycle.getTestCycleId());
            List<CycleTeam> list = cycleTeamDao.selectByExample(cycleTeamExample);
            for (CycleTeam cycleTeam:list) {
                for (Sample sample : selectByCycleTeamId(cycleTeam.getCycleTeamId())) {
                    showCycle.getSample().add(sample);
                }
            }
        }
        for (Integer i:map.keySet()){
            showSamples.getShowCycles().add(map.get(i));
        }
        return showSamples;
    }

    public List<ShowForIndex> getShowForIndex(Integer testCycleId){
        List<ShowForIndex> showForIndexList = new ArrayList<ShowForIndex>();
        CycleTeamExample cycleTeamExample = new CycleTeamExample();
        cycleTeamExample.createCriteria().andTestCycleIdEqualTo(testCycleId);
        List<CycleTeam> list = cycleTeamDao.selectByExample(cycleTeamExample);
        for (CycleTeam cycleTeam:list) {
            Team team = teamDao.selectByPrimaryKey(cycleTeam.getTeamId());
            for (Sample sample : selectByCycleTeamId(cycleTeam.getCycleTeamId())) {
                WaterSourceType waterSourceType;
                waterSourceType = waterSourceTypeMapper.selectByPrimaryKey(sample.getWaterSourceTypeId());
                if (waterSourceType == null) {
                    waterSourceType = new WaterSourceType();
                    waterSourceType.setWaterSourceDesc("暂无");
                }
                showForIndexList.add(new ShowForIndex(team.getTeamName(),
                        locationDao.selectByPrimaryKey(sample.getLocationId()),
                        sample, waterSourceType.getWaterSourceDesc()));
            }
        }
        return showForIndexList;
    }

    public List<ShowForIndex> getShowForIndexWithYear(Integer testCycleId, String year) throws ParseException {
        List<ShowForIndex> showForIndexList = new ArrayList<ShowForIndex>();
        CycleTeamExample cycleTeamExample = new CycleTeamExample();
        cycleTeamExample.createCriteria().andTestCycleIdEqualTo(testCycleId);
        List<CycleTeam> list = cycleTeamDao.selectByExample(cycleTeamExample);
        for (CycleTeam cycleTeam : list) {
            Team team = teamDao.selectByPrimaryKey(cycleTeam.getTeamId());
            for (Sample sample : selectByCycleTeamId(cycleTeam.getCycleTeamId())) {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                Date oldDate = format.parse((Integer.parseInt(year) + 1) + "-01-01 00:00:00");
                if (team != null && sample.getSamplingDate() != null && sample.getSamplingDate().before(oldDate)) {
                    WaterSourceType waterSourceType;
                    waterSourceType = waterSourceTypeMapper.selectByPrimaryKey(sample.getWaterSourceTypeId());
                    if (waterSourceType == null) {
                        waterSourceType = new WaterSourceType();
                        waterSourceType.setWaterSourceDesc("暂无");
                    }
                    showForIndexList.add(new ShowForIndex(team.getTeamName(),
                            locationDao.selectByPrimaryKey(sample.getLocationId()),
                            sample, waterSourceType.getWaterSourceDesc()));
                }
            }
        }
        return showForIndexList;
    }

    public Statistics getDetailForIndexWithYear(Integer testCycleId, String year, Statistics statistics, Set<Integer> provinceSet, Set<Integer> prefectureSet, Set<Integer> countySet, Set<Integer> sampleSet, Set<Integer> teamSet)
            throws ParseException {
        CycleTeamExample cycleTeamExample = new CycleTeamExample();
        cycleTeamExample.createCriteria().andTestCycleIdEqualTo(testCycleId);
        List<CycleTeam> list = cycleTeamDao.selectByExample(cycleTeamExample);
        for (CycleTeam cycleTeam : list) {
            Team team = teamDao.selectByPrimaryKey(cycleTeam.getTeamId());
            if (team == null) {
                continue;
            }
            if (!teamSet.contains(team.getTeamId())) {
                teamSet.add(team.getTeamId());
                statistics.setTeamCount(statistics.getTeamCount() + 1);
            }
            for (Sample sample : selectByCycleTeamId(cycleTeam.getCycleTeamId())) {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                Date oldDate = format.parse((Integer.parseInt(year) + 1) + "-01-01 00:00:00");
                if (team != null && sample.getSamplingDate() != null && sample.getSamplingDate().before(oldDate)) {
                    Location location = locationDao.selectByPrimaryKey(sample.getLocationId());
                    if (location != null) {
                        if (!provinceSet.contains(location.getProvinceId())) {
                            provinceSet.add(location.getProvinceId());
                            statistics.setProvinceCount(statistics.getProvinceCount() + 1);
                        }
                        if (!prefectureSet.contains(location.getPrefectureId())) {
                            prefectureSet.add(location.getPrefectureId());
                            statistics.setPrefectureCount(statistics.getPrefectureCount() + 1);
                        }
                        if (!countySet.contains(location.getCountyId())) {
                            countySet.add(location.getCountyId());
                            statistics.setCountyCount(statistics.getCountyCount() + 1);
                        }
                        if (!sampleSet.contains(sample.getBaseId())) {
                            sampleSet.add(sample.getBaseId());
                            statistics.setSampleCount(statistics.getSampleCount() + 1);
                        }
                    }
                }
            }
        }
        return statistics;
    }

}
