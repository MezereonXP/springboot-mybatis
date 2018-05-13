package org.spring.springboot.service.impl;

import org.spring.springboot.dao.TownshipDao;
import org.spring.springboot.domain.Township;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TownshipService {

    @Autowired
    private TownshipDao townshipDao;

    public List<Township> getTownshipByCountyId(String countyId) {
        return townshipDao.getTownshipByCountyId(countyId);
    }

}
