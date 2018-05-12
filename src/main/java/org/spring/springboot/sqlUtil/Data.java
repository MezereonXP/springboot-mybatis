package org.spring.springboot.sqlUtil;

import java.util.List;

public class Data {
        String name;
        String href;
        String code;
        String type;
        String level;
        List<Data> children;

    public Data() {
    }

    public Data(String name, String href, String code, String type, String level, List<Data> children) {
        this.name = name;
        this.href = href;
        this.code = code;
        this.type = type;
        this.level = level;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<Data> getChildren() {
        return children;
    }

    public void setChildren(List<Data> children) {
        this.children = children;
    }
}
