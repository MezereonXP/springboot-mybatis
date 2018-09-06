package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/14.
 */
public class ShowSamples {
    private List<ShowCycle> showCycles;

    public ShowSamples(){
        showCycles = new ArrayList<ShowCycle>();
    }

     public static class ShowCycle {
        private TestCycle testCycle;
         private List<Sample> sample;
        public TestCycle getTestCycle() {
            return testCycle;
        }

        public ShowCycle() {
            sample = new ArrayList<Sample>();
        }

        public void setTestCycle(TestCycle testCycle) {
            this.testCycle = testCycle;
        }

         public List<Sample> getSample() {
            return sample;
        }

         public void setSample(List<Sample> sample) {
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
