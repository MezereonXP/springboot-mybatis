package org.spring.springboot.domain;

public class MultiChoose {
    private Integer multichooseid;

    private String multichoosename;

    private String multichoosevalue;

    public Integer getMultichooseid() {
        return multichooseid;
    }

    public void setMultichooseid(Integer multichooseid) {
        this.multichooseid = multichooseid;
    }

    public String getMultichoosename() {
        return multichoosename;
    }

    public void setMultichoosename(String multichoosename) {
        this.multichoosename = multichoosename == null ? null : multichoosename.trim();
    }

    public String getMultichoosevalue() {
        return multichoosevalue;
    }

    public void setMultichoosevalue(String multichoosevalue) {
        this.multichoosevalue = multichoosevalue == null ? null : multichoosevalue.trim();
    }
}