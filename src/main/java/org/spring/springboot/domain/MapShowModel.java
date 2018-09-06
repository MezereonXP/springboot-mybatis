package org.spring.springboot.domain;

public class MapShowModel {

    private Sample sample;
    private Location location;
    private Blog blog;

    public MapShowModel() {
    }

    public MapShowModel(Sample sample, Location location) {
        this.sample = sample;
        this.location = location;
    }

    public MapShowModel(Sample sample, Location location, Blog blog) {
        this.sample = sample;
        this.location = location;
        this.blog = blog;
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

    public Sample getSample() {
        return sample;
    }

    public void setSample(Sample sample) {
        this.sample = sample;
    }
}
