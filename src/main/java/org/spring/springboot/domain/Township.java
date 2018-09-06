package org.spring.springboot.domain;

public class Township {
    private Integer townshipId;

    private Integer countryId;

    private String townName;

    private Integer status;

    public Integer getTownshipId() {
        return townshipId;
    }

    public void setTownshipId(Integer townshipId) {
        this.townshipId = townshipId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName == null ? null : townName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}