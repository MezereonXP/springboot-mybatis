package org.spring.springboot.service.impl;

import org.spring.springboot.dao.SampleDao;
import org.spring.springboot.domain.SampleWithBLOBs;
import org.spring.springboot.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/4/14.
 */
public class SampleServiceImpl implements SampleService {

    @Autowired
    private SampleDao sampleDao;

    @Override
    public SampleWithBLOBs selectById(Integer baseid) {
        return sampleDao.selectByPrimaryKey(baseid);
    }
}
