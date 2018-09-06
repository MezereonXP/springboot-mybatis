package org.spring.springboot.domain;

public class DeliveryMethod {
    private Integer deliveryMethodId;

    private String deliveryMethodDesc;

    public Integer getDeliveryMethodId() {
        return deliveryMethodId;
    }

    public void setDeliveryMethodId(Integer deliveryMethodId) {
        this.deliveryMethodId = deliveryMethodId;
    }

    public String getDeliveryMethodDesc() {
        return deliveryMethodDesc;
    }

    public void setDeliveryMethodDesc(String deliveryMethodDesc) {
        this.deliveryMethodDesc = deliveryMethodDesc == null ? null : deliveryMethodDesc.trim();
    }
}