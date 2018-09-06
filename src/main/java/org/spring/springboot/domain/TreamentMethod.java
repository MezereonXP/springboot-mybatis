package org.spring.springboot.domain;

public class TreamentMethod {
    private Integer treamentMethodId;

    private String treamentMethodDesc;

    public Integer getTreamentMethodId() {
        return treamentMethodId;
    }

    public void setTreamentMethodId(Integer treamentMethodId) {
        this.treamentMethodId = treamentMethodId;
    }

    public String getTreamentMethodDesc() {
        return treamentMethodDesc;
    }

    public void setTreamentMethodDesc(String treamentMethodDesc) {
        this.treamentMethodDesc = treamentMethodDesc == null ? null : treamentMethodDesc.trim();
    }
}