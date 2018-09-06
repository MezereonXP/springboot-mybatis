package org.spring.springboot.domain;

public class SampleWithLocation {
    private Sample sample;
    private Location location;

    public SampleWithLocation(Sample sample, Location location) {
        this.sample = sample;
        this.location = location;
    }

    public SampleWithLocation() {
    }

    public Sample getSample() {
        return sample;
    }

    public void setSample(Sample sample) {
        this.sample = sample;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
