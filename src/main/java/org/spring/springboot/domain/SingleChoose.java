package org.spring.springboot.domain;

public class SingleChoose {
    private Integer singlechooseid;

    private String singlechoosename;

    private String singlechoosevalue;

    public Integer getSinglechooseid() {
        return singlechooseid;
    }

    public void setSinglechooseid(Integer singlechooseid) {
        this.singlechooseid = singlechooseid;
    }

    public String getSinglechoosename() {
        return singlechoosename;
    }

    public void setSinglechoosename(String singlechoosename) {
        this.singlechoosename = singlechoosename == null ? null : singlechoosename.trim();
    }

    public String getSinglechoosevalue() {
        return singlechoosevalue;
    }

    public void setSinglechoosevalue(String singlechoosevalue) {
        this.singlechoosevalue = singlechoosevalue == null ? null : singlechoosevalue.trim();
    }
}