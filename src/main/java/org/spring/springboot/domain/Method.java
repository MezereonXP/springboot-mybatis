package org.spring.springboot.domain;

public class Method {
    private Integer methodid;

    private String methodname;

    private String methodvalue;

    private String methodregex;

    public Integer getMethodid() {
        return methodid;
    }

    public void setMethodid(Integer methodid) {
        this.methodid = methodid;
    }

    public String getMethodname() {
        return methodname;
    }

    public void setMethodname(String methodname) {
        this.methodname = methodname == null ? null : methodname.trim();
    }

    public String getMethodvalue() {
        return methodvalue;
    }

    public void setMethodvalue(String methodvalue) {
        this.methodvalue = methodvalue == null ? null : methodvalue.trim();
    }

    public String getMethodregex() {
        return methodregex;
    }

    public void setMethodregex(String methodregex) {
        this.methodregex = methodregex == null ? null : methodregex.trim();
    }
}