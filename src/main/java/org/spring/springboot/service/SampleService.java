package org.spring.springboot.service;

import org.spring.springboot.domain.SampleWithBLOBs;


/**
 * Created by Administrator on 2018/4/14.
 */
public interface SampleService {

    SampleWithBLOBs selectById(Integer baseid);
}
