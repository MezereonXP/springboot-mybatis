package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CycleTeamDao;
import org.spring.springboot.dao.LocationDao;
import org.spring.springboot.dao.SampleDao;
import org.spring.springboot.dao.SingleChooseDao;
import org.spring.springboot.dao.TeamDao;
import org.spring.springboot.dao.TestCycleDao;
import org.spring.springboot.dao.WaterSourceTypeMapper;
import org.spring.springboot.domain.CycleTeam;
import org.spring.springboot.domain.Location;
import org.spring.springboot.domain.Sample;
import org.spring.springboot.domain.SampleWithBLOBs;
import org.spring.springboot.domain.ShowForIndex;
import org.spring.springboot.domain.ShowSamples;
import org.spring.springboot.domain.SingleChoose;
import org.spring.springboot.domain.Statistics;
import org.spring.springboot.domain.Team;
import org.spring.springboot.domain.TestCycle;
import org.spring.springboot.domain.WaterSourceType;
import org.spring.springboot.util.ListConverter;
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
        return sampleDao.getSamplesByCycleTeamid(cycleTeamId);
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
    public ShowSamples getShowSamples(Integer teamId) {
        ShowSamples showSamples = new ShowSamples();
        List<ShowSamples.ShowCycle> showCycles = new ArrayList<ShowSamples.ShowCycle>();
        List<CycleTeam> cycleTeams = cycleTeamDao.selectByTeamId(teamId);
        for(CycleTeam cycleTeam : cycleTeams){
            ShowSamples.ShowCycle showCycle = new ShowSamples.ShowCycle();
            showCycle.setSample(sampleDao.getSamplesByCycleTeamid(cycleTeam.getCycleTeamId()));
            showCycle.setTestCycle(testCycleDao.selectByPrimaryKey(cycleTeam.getTestCycleId()));
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
            if (!map.containsKey(testCycle.getTestCycleId())) {
                map.put(testCycle.getTestCycleId(), new ShowSamples.ShowCycle());
                map.get(testCycle.getTestCycleId()).setTestCycle(testCycle);
            }
            ShowSamples.ShowCycle showCycle = map.get(testCycle.getTestCycleId());
            List<CycleTeam> list = cycleTeamDao.selectByTestCycleId(testCycle.getTestCycleId());
            for (CycleTeam cycleTeam:list) {
                for (Sample sample : sampleDao.getSamplesByCycleTeamid(cycleTeam.getCycleTeamId())) {
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

        List<CycleTeam> list = cycleTeamDao.selectByTestCycleId(testCycleId);
        for (CycleTeam cycleTeam:list) {
            Team team = teamDao.selectByPrimaryKey(cycleTeam.getTeamId());
            for (Sample sample : sampleDao.getSamplesByCycleTeamid(cycleTeam.getCycleTeamId())) {
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

    public List<ShowForIndex> getShowForIndexWithYear(Integer testCycleId, String year) {
        List<ShowForIndex> showForIndexList = new ArrayList<ShowForIndex>();

        List<CycleTeam> list = cycleTeamDao.selectByTestCycleId(testCycleId);
        for (CycleTeam cycleTeam : list) {
            Team team = teamDao.selectByPrimaryKey(cycleTeam.getTeamId());
            for (Sample sample : sampleDao.getSamplesByCycleTeamid(cycleTeam.getCycleTeamId())) {
                if (team != null && sample.getSamplingDate() != null && sample.getSamplingDate().before(new Date(Integer.parseInt(year) + 1, 1, 1))) {
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

        List<CycleTeam> list = cycleTeamDao.selectByTestCycleId(testCycleId);
        for (CycleTeam cycleTeam : list) {
            Team team = teamDao.selectByPrimaryKey(cycleTeam.getTeamId());
            if (!teamSet.contains(team.getTeamId())) {
                teamSet.add(team.getTeamId());
                statistics.setTeamCount(statistics.getTeamCount() + 1);
            }
            for (Sample sample : sampleDao.getSamplesByCycleTeamid(cycleTeam.getCycleTeamId())) {
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
