package org.spring.springboot.domain;

public class BlogWithBLOBs extends Blog {
    private String text;

    private String admincomment;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getAdmincomment() {
        return admincomment;
    }

    public void setAdmincomment(String admincomment) {
        this.admincomment = admincomment == null ? null : admincomment.trim();
    }
}