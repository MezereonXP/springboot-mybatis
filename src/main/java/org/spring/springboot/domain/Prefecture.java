package org.spring.springboot.domain;

public class Prefecture {
    private Integer prefectureId;

    private Integer provinceId;

    private String prefectureName;

    private String status;

    public Integer getPrefectureId() {
        return prefectureId;
    }

    public void setPrefectureId(Integer prefectureId) {
        this.prefectureId = prefectureId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getPrefectureName() {
        return prefectureName;
    }

    public void setPrefectureName(String prefectureName) {
        this.prefectureName = prefectureName == null ? null : prefectureName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}