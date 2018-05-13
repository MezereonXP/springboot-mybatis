package org.spring.springboot.service.impl;

import org.spring.springboot.dao.PrefectureDao;
import org.spring.springboot.domain.Prefecture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrefectureService {

    @Autowired
    private PrefectureDao prefectureDao;

    public List<Prefecture> getPrefectureByProvinceId(String provinceId) {
        return prefectureDao.getPrefectureByProvinceId(provinceId);
    }

}
