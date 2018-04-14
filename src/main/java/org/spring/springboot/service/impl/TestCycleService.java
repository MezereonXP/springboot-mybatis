package org.spring.springboot.service.impl;

import org.spring.springboot.dao.LocationDao;
import org.spring.springboot.dao.TestCycleDao;
import org.spring.springboot.domain.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/4/14.
 */
@Service
public class TestCycleService {

    @Autowired
    private TestCycleDao testCycleDao;

}
