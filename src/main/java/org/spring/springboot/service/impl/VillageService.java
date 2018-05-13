package org.spring.springboot.service.impl;

import org.spring.springboot.dao.TownshipDao;
import org.spring.springboot.dao.VillageDao;
import org.spring.springboot.domain.Township;
import org.spring.springboot.domain.Village;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VillageService {

    @Autowired
    private VillageDao villageDao;

    public List<Village> getVillageByTownshipId(String townshipId) {
        return villageDao.getVillageByTownshipId(townshipId);
    }

}
