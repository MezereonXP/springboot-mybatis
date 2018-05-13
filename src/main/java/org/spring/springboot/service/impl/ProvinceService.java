package org.spring.springboot.service.impl;

import org.spring.springboot.dao.ProvinceDao;
import org.spring.springboot.domain.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceService {

    @Autowired
    private ProvinceDao provinceDao;

    public List<Province> getAllProvince() {
        return provinceDao.getAllProvince();
    }

}
