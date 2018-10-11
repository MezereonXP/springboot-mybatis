package org.spring.springboot.domain;

import org.spring.springboot.dao.CleanSample;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: CleanShowCycle
 * @description: Clean show cycle
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/10/12
 **/
public class CleanShowCycle {
    private TestCycle testCycle;
    private List<CleanSample> sample;

    public TestCycle getTestCycle() {
        return testCycle;
    }

    public void setTestCycle(TestCycle testCycle) {
        this.testCycle = testCycle;
    }

    public List<CleanSample> getSample() {
        return sample;
    }

    public void setSample(List<CleanSample> sample) {
        this.sample = sample;
    }
}
