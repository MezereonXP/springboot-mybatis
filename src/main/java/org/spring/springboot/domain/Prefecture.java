package org.spring.springboot.domain;

public class Prefecture {
    private Integer prefectureid;

    private String prefecturename;

    private String provinceid;

    private String description;

    public Integer getPrefectureid() {
        return prefectureid;
    }

    public void setPrefectureid(Integer prefectureid) {
        this.prefectureid = prefectureid;
    }

    public String getPrefecturename() {
        return prefecturename;
    }

    public void setPrefecturename(String prefecturename) {
        this.prefecturename = prefecturename == null ? null : prefecturename.trim();
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}