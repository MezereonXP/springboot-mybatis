package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CountyDao;
import org.spring.springboot.dao.PrefectureDao;
import org.spring.springboot.domain.County;
import org.spring.springboot.domain.Prefecture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountyService {

    @Autowired
    private CountyDao countyDao;

    public List<County> getCountyByPrefectureId(String prefectureId) {
        return countyDao.getCountyByPrefectureId(prefectureId);
    }

}
