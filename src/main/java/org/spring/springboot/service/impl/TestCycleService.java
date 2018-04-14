package org.spring.springboot.service.impl;

import org.spring.springboot.dao.LocationDao;
import org.spring.springboot.dao.TestCycleDao;
import org.spring.springboot.domain.Location;
import org.spring.springboot.domain.TestCycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/4/14.
 */
@Service
public class TestCycleService {

    @Autowired
    private TestCycleDao testCycleDao;

    public List<TestCycle> findTestCycleByTeamId(String teamid) {
        return testCycleDao.findTestCycleByTeamId(teamid);
    }

    public List<TestCycle> getAllTestCycle() {
        return testCycleDao.getAllTestCycle();
    }
}
