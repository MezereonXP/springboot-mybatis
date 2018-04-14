package org.spring.springboot.service.impl;

import org.spring.springboot.dao.SampleDao;
import org.spring.springboot.domain.Sample;
import org.spring.springboot.domain.SampleWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/4/14.
 */
@Service
public class SampleService {

    @Autowired
    private SampleDao sampleDao;

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
}
