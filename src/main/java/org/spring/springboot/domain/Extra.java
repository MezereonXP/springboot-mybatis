package org.spring.springboot.domain;

public class Extra {
    private Integer extraid;

    private String extraname;

    private String extravalue;

    public Integer getExtraid() {
        return extraid;
    }

    public void setExtraid(Integer extraid) {
        this.extraid = extraid;
    }

    public String getExtraname() {
        return extraname;
    }

    public void setExtraname(String extraname) {
        this.extraname = extraname == null ? null : extraname.trim();
    }

    public String getExtravalue() {
        return extravalue;
    }

    public void setExtravalue(String extravalue) {
        this.extravalue = extravalue == null ? null : extravalue.trim();
    }
}