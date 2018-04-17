package org.spring.springboot.domain;

public class MapShowModel {

    private SampleWithBLOBs sampleWithBLOBs;
    private Location location;
    private Blog blog;

    public MapShowModel() {
    }

    public MapShowModel(SampleWithBLOBs sampleWithBLOBs, Location location) {
        this.sampleWithBLOBs = sampleWithBLOBs;
        this.location = location;
    }

    public MapShowModel(SampleWithBLOBs sampleWithBLOBs, Location location, Blog blog) {
        this.sampleWithBLOBs = sampleWithBLOBs;
        this.location = location;
        this.blog = blog;
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

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
