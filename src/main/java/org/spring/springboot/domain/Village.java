package org.spring.springboot.domain;

public class Village {
    private Integer villageId;

    private Integer townshipId;

    private String villageName;

    private Integer status;

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Integer getTownshipId() {
        return townshipId;
    }

    public void setTownshipId(Integer townshipId) {
        this.townshipId = townshipId;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName == null ? null : villageName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}