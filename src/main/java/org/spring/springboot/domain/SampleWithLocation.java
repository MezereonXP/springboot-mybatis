package org.spring.springboot.domain;

public class SampleWithLocation {
    private SampleWithBLOBs sampleWithBLOBs;
    private Location location;

    public SampleWithLocation(SampleWithBLOBs sampleWithBLOBs, Location location) {
        this.sampleWithBLOBs = sampleWithBLOBs;
        this.location = location;
    }

    public SampleWithLocation() {
    }

    public SampleWithBLOBs getSampleWithBLOBs() {
        return sampleWithBLOBs;
    }

    public void setSampleWithBLOBs(SampleWithBLOBs sampleWithBLOBs) {
        this.sampleWithBLOBs = sampleWithBLOBs;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
