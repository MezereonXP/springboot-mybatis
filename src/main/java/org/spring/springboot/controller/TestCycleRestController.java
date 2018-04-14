package org.spring.springboot.controller;

import org.spring.springboot.service.impl.TestCycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/14.
 */

@RestController
public class TestCycleRestController {

    @Autowired
    private TestCycleService testCycleService;
}
