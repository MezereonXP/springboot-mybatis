package org.spring.springboot.service.impl;

import org.spring.springboot.dao.LocationDao;
import org.spring.springboot.domain.Location;
import org.spring.springboot.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/4/14.
 */

@Service
public class LocationService {

    @Autowired
    private LocationDao locationDao;

    private Integer addLocation(Location location){
        int count = locationDao.insert(location);
        if (count == 1){
            return 1;
        } else {
            return -1;
        }
    }

}
