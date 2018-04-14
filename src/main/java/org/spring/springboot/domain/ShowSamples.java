package org.spring.springboot.domain;

import java.util.List;

/**
 * Created by Administrator on 2018/4/14.
 */
public class ShowSamples {
    private List<ShowCycle> showCycles;

    class ShowCycle {
        private TestCycle testCycle;
        private List<SampleWithBLOBs> sample;
        public TestCycle getTestCycle() {
            return testCycle;
        }

        public void setTestCycle(TestCycle testCycle) {
            this.testCycle = testCycle;
        }

        public List<SampleWithBLOBs> getSample() {
            return sample;
        }

        public void setSample(List<SampleWithBLOBs> sample) {
            this.sample = sample;
        }
    }

    public List<ShowCycle> getShowCycles() {
        return showCycles;
    }

    public void setShowCycles(List<ShowCycle> showCycles) {
        this.showCycles = showCycles;
    }

}
