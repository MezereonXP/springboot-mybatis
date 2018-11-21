package org.spring.springboot.domain;

public class DrinkingWaterType {
    private Integer drinkWaterId;

    private String drinkWaterDesc;

    private Integer visible;

    public Integer getDrinkWaterId() {
        return drinkWaterId;
    }

    public void setDrinkWaterId(Integer drinkWaterId) {
        this.drinkWaterId = drinkWaterId;
    }

    public String getDrinkWaterDesc() {
        return drinkWaterDesc;
    }

    public void setDrinkWaterDesc(String drinkWaterDesc) {
        this.drinkWaterDesc = drinkWaterDesc == null ? null : drinkWaterDesc.trim();
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }
}